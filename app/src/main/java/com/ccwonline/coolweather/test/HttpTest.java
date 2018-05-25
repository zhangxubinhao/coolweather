package com.ccwonline.coolweather.test;

import com.ccwonline.coolweather.util.HttpUtil;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by zhang_xubin on 2018/5/24.
 */

public class HttpTest {
    public static void main(String reg[]) throws Exception{
        String address = "http://www.baidu.com/";
        HttpUtil.sendOkHttpRequest(address, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseData = response.body().string();
                System.out.println(responseData);
            }
        });

    }
}
