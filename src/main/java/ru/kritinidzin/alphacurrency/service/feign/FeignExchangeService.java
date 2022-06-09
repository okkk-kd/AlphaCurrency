package ru.kritinidzin.alphacurrency.service.feign;


import org.springframework.boot.configurationprocessor.json.JSONException;

public interface FeignExchangeService {
    public String getAllInformation();
    public String getCurrencyByCodeHistorical(String currency) throws JSONException;
    public String getCurrencyByCode(String currency) throws JSONException;
    public String compareCurrencies(String currency) throws JSONException;
}
