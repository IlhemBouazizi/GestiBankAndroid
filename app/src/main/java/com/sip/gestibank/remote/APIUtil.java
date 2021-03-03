package com.sip.gestibank.remote;

public class APIUtil {
    private APIUtil(){
    };

    public static final String API_URL = "http://192.168.1.82:85/clients/";
    public static final String API_CURRENCY = "http://api.currencylayer.com/";


    public static ClientService getClientService(){
        return RetrofitClient.getClient(API_URL).create(ClientService.class);
    }

/*
    public static CurrencyService getCurrencyService(){
        return RetrofitClient.getClient(API_CURRENCY).create(CurrencyService.class);
    }*/
}
