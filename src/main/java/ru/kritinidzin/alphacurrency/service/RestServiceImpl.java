package ru.kritinidzin.alphacurrency.service;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Transactional
@Service("RestServiceImpl")
public class RestServiceImpl implements RestService{
    @Override
    public String getInformation() throws JSONException {
//        RestTemplate restTemplate = new RestTemplate();
//
//        String url = "https://openexchangerates.org/api/latest.json?app_id=83cbda9e629045ada058cf2daf8d21b5";
//        String str = restTemplate.getForObject(url, String.class);
        String str = "Test me";
        return str;
    }
}
