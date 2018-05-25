package com.ccwonline.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhang_xubin on 2018/5/25.
 */

public class Forecase {

    public String date;

    @SerializedName("tmp")
    public Temeperature temeperature;

    @SerializedName("cond")
    public More more;

    public class Temeperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
