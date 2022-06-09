package ru.kritinidzin.alphacurrency.service.feign;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.kritinidzin.alphacurrency.GsonParser;

import java.time.LocalDate;

@Service("FeignServiceImpl")
public class FeignExchangeServiceImpl implements FeignExchangeService {
    @Autowired
    private FeignExchangeClient client;
    @Override
    public String getAllInformation() {
        return client.getAllInformation();
    }
    @Override
    public String getCurrencyByCode(String code) throws JSONException {
        String str = client.getCurrencyByCode(code);
        GsonParser parser = new GsonParser();
        String result = parser.findByKey(str, code);
        return result;
    }
    @Override
    public String getCurrencyByCodeHistorical(String code) throws JSONException {
        final String date = LocalDate.now().minusDays(3).toString();
        String url = "https://openexchangerates.org/api/" + "historical/" + date + ".json" + "?app_id=8e0da00540074e68958b05c1f86a3d41";
        RestTemplate restTemplate = new RestTemplate();
        GsonParser parser = new GsonParser();
        return parser.findByKey(restTemplate.getForObject(url, String.class), code);
    }
    @Override
    public String compareCurrencies(String code) throws JSONException {

        if (Double.valueOf(getCurrencyByCode(code)) > Double.valueOf(getCurrencyByCodeHistorical(code))) {
            return "https://giphy.com/gifs/pPzjpxJXa0pna";
        } else {
            return "https://giphy.com/gifs/5266-n5266-215266-9G2Vf0AncO9jptnp0o";
        }
    }
}
