package com.zckj.parking.mvp.model.api;


import com.zckj.parking.http.HttpResponse;
import com.zckj.parking.mvp.model.entity.UserInfoBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by wmq on 2018/1/5.
 */

public interface MyApis {

    /**
     * 登录
     */
    @POST(Api.Login)
    Observable<HttpResponse<UserInfoBean>> postLoginInfo(@Body RequestBody requestBody);

}
