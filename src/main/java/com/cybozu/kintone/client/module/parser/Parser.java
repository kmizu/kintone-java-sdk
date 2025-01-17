package com.cybozu.kintone.client.module.parser;

import com.cybozu.kintone.client.exception.KintoneAPIException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class Parser {
	private static final Gson gson = new Gson();
	public Object parseObject(Object obj) throws KintoneAPIException {
        try {
            return gson.toJson(obj);
        } catch (Exception e) {
            throw new KintoneAPIException("Parse error");
        }
    }
	
	public Object parseJson(JsonElement json, Class<?> type) throws KintoneAPIException {
        try {
            return gson.fromJson(json, type);
        } catch (Exception e) {
            throw new KintoneAPIException("Parse error");
        }
    }
}
