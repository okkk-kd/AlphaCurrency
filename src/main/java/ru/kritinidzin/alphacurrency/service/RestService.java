package ru.kritinidzin.alphacurrency.service;

import org.springframework.boot.configurationprocessor.json.JSONException;

public interface RestService {
    public String getInformation() throws JSONException;
}
