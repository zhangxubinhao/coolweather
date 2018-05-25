package com.ccwonline.coolweather.gson;

import android.test.MoreAsserts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhang_xubin on 2018/5/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("text")
        public String info;
    }
}
