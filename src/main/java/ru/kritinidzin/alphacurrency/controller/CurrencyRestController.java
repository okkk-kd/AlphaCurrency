package ru.kritinidzin.alphacurrency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.*;
import ru.kritinidzin.alphacurrency.service.feign.FeignExchangeServiceImpl;

@RestController
@RequestMapping("/currency")
public class CurrencyRestController {
    @Autowired
    private FeignExchangeServiceImpl feignService;

    @RequestMapping(value = "/information")
    public String getAllInformation() throws JSONException {
        return feignService.getAllInformation();
    }

    @RequestMapping(value = "/getCode/{code}")
    public String getCurrencyByCode(@PathVariable String code) throws JSONException {
        return feignService.getCurrencyByCode(code);
    }

    @RequestMapping(value = "/getCodeHistorical/{code}")
    public String getCurrencyByCodeHistorical(@PathVariable String code) throws JSONException {
        return feignService.getCurrencyByCodeHistorical(code);
    }

    @RequestMapping(value = "/seeTheTruth/{code}")
    public String compareCurrencies(@PathVariable String code) throws JSONException {
        return feignService.compareCurrencies(code);
    }
}
