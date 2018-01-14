package com.edge.weather.weather;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by c2619 on 2018-01-15.
 */

public interface ApiService {
    //베이스 Url
    static final String BASEURL = "http://apis.skplanetx.com/";
    static final String APPKEY ="b2657823-e732-38b8-82be-856c2b8abd63";
    //get 메소드를 통한 http rest api 통신


    @GET("weather/current/hourly")
    Call<JsonObject> getHourly (@Header("appKey")String appKey , @Query("version") int version,
                                @Query("lat") double lat, @Query("lon") double lon);

}

