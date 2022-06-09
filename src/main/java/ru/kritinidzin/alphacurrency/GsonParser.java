package ru.kritinidzin.alphacurrency;

import com.google.gson.Gson;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class GsonParser {
    public String findByKey(String str, String code) throws JSONException {
        JSONObject json = new JSONObject(str);
        return String.valueOf(json.getJSONObject("rates").getDouble(code));
    }
}
