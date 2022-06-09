package ru.kritinidzin.alphacurrency.service.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@FeignClient(value = "openExchange", url = "${feign.get.baseUrl}")
public interface FeignExchangeClient {
    final String id = "${feign.id}";
    @RequestMapping(value = "latest.json" + id)
    public String getAllInformation();
    @RequestMapping(value = "latest.json" + id)
    public String getCurrencyByCode(String code);
}
