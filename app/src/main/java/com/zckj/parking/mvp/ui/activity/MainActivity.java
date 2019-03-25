package com.zckj.parking.mvp.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.zckj.parking.R;
import com.zckj.parking.base.SimpleBaseActivity;
import com.zckj.parking.di.component.DaggerMainComponent;
import com.zckj.parking.di.module.MainModule;
import com.zckj.parking.di.module.testModule;
import com.zckj.parking.di.scope.provideLayoutManager;
import com.zckj.parking.di.scope.provideLayoutManager2;
import com.zckj.parking.mvp.contract.MainContract;
import com.zckj.parking.mvp.contract.testContract;
import com.zckj.parking.mvp.presenter.MainPresenter;
import com.zckj.parking.mvp.presenter.testPresenter;

import javax.inject.Inject;

import butterknife.OnClick;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 12/29/2018 13:41
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class MainActivity extends SimpleBaseActivity<MainPresenter> implements MainContract.View,testContract.View {

    @Inject
    testPresenter mTestPresenter;

    @Inject
    @provideLayoutManager
    RecyclerView.LayoutManager layoutManager;

    @Inject
    @provideLayoutManager2
    RecyclerView.LayoutManager layoutManager2;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mainModule(new MainModule(this))
                .testModule(new testModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_main; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        hideLoadingDialog();
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @OnClick(R.id.tv_login)
    public void login()
    {
        mPresenter.doLogin();
    }

    @Override
    public void onLoginSuccess() {
    }

    @Override
    public void onLoginFail() {
    }

    @Override
    public Activity getActivity() {
        return this;
    }


    @OnClick(R.id.tv_logout)
    public void logout()
    {
        mTestPresenter.logOut();
    }

    @Override
    public void onLogOutSuccess() {
        Toast.makeText(this,"退出成功",Toast.LENGTH_SHORT).show();
    }


    @OnClick(R.id.textView)
    public void tv()
    {
        Toast.makeText(this,""+layoutManager,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,""+layoutManager2,Toast.LENGTH_SHORT).show();
    }
}
