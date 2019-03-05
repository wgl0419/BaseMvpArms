package com.zckj.parking.base;

import android.app.Dialog;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.mvp.IPresenter;
import com.zckj.parking.util.DialogHelper;

public abstract class SimpleBaseActivity<P extends IPresenter> extends BaseActivity<P> {
    private Dialog loading;
    public P getPresent(){
        return mPresenter;
    }

    public void showLoadingDialog() {

        if (!isFinishing()) {// Activity是否还存在
            if (loading == null) {
                loading = DialogHelper.createLoadingDialog_transparent(
                        this);
            }
            loading.show();
        }

    }

    public void hideLoadingDialog() {

        if (loading != null) {
            loading.dismiss();
            loading = null;
        }

    }

    @Override
    protected void onDestroy() {
        hideLoadingDialog();
        super.onDestroy();
    }
}
