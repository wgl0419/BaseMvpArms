package com.zckj.parking.mvp.presenter;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;
import com.zckj.parking.app.utils.RxUtils;
import com.zckj.parking.mvp.contract.testContract;
import com.zckj.parking.mvp.model.entity.EmptyBean;

import java.util.Map;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.MediaType;
import okhttp3.RequestBody;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 03/07/2019 16:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class testPresenter extends BasePresenter<testContract.Model, testContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public testPresenter(testContract.Model model, testContract.View rootView) {
        super(model, rootView);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }

    public void logOut()
    {
        mModel.doLogout()
                .compose(RxUtils.<EmptyBean>applySchedulers(mRootView))
                .subscribe(new ErrorHandleSubscriber<EmptyBean>(mErrorHandler) {
                    @Override
                    public void onNext(EmptyBean userInfoBean) {
                        mRootView.onLogOutSuccess();
                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                    }
                });
    }
    /**
     * 将Map转化为RequestBody
     *
     * @param map
     * @return String
     */
    public static RequestBody mapToRequestBody(Map<String,String> map) {
        Gson gson = new Gson();
        String jsonStr = gson.toJson(map);
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/json"),jsonStr);
        return requestBody;
    }
}
