package com.zckj.parking.util;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import com.zckj.parking.R;


public class DialogHelper {

//	/**
//	 * 得到自定义的progressDialog
//	 *
//	 * @param context
//	 * @param msg
//	 * @return
//	 */
//	public static Dialog createLoadingDialog(Context context, String msg) {
//
//		LayoutInflater inflater = LayoutInflater.from(context);
//		View v = inflater.inflate(R.layout.progress_dialog, null);
//
//		ImageView spaceshipImage = (ImageView) v.findViewById(R.id.img);
//		TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);
//
//		 //加载动画
//		Animation hyperspaceJumpAnimation = AnimationUtils.loadAnimation(
//				context, R.anim.loading_rotate);
//		spaceshipImage.startAnimation(hyperspaceJumpAnimation);
//		tipTextView.setText(msg);
//
//		Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);// 创建自定义样式dialog
//
//		loadingDialog.setCancelable(false);
//		loadingDialog.setContentView(v, new LinearLayout.LayoutParams(
//				LinearLayout.LayoutParams.FILL_PARENT,
//				LinearLayout.LayoutParams.FILL_PARENT));
//
//		return loadingDialog;
//
//	}

	public static Dialog createLoadingDialog_transparent(Context context) {

		LayoutInflater inflater = LayoutInflater.from(context);
		View v = inflater.inflate(R.layout.progress_dialog, null);
		Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);// 创建自定义样式dialog

		loadingDialog.setCancelable(false);
		loadingDialog.setContentView(v, new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.FILL_PARENT,
				LinearLayout.LayoutParams.FILL_PARENT));

		return loadingDialog;

	}
}
