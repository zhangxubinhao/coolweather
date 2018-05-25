package com.ccwonline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhang_xubin on 2018/5/25.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
