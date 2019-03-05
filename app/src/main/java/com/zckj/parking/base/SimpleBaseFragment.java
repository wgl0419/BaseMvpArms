package com.zckj.parking.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;

import com.jess.arms.base.BaseFragment;
import com.jess.arms.mvp.IPresenter;
import com.zckj.parking.util.DialogHelper;

public abstract class SimpleBaseFragment<P extends IPresenter> extends BaseFragment<P> {
    private Dialog loading;
    public P getPresent(){
        return mPresenter;
    }
    private Activity mActivity;
    protected Context mContext;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (Activity) context;
        mContext = context;
    }

    public void showLoadingDialog() {
        if(mActivity == null)
        {
            return;
        }
        if (!mActivity.isFinishing()) {// Activity是否还存在
            if (loading == null) {
                loading = DialogHelper.createLoadingDialog_transparent(
                        mContext);
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
}
