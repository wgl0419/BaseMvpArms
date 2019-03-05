package com.zckj.parking.app;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatDelegate;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;

import com.jess.arms.base.BaseApplication;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by wmq on 2018/1/5.
 */

public class App extends BaseApplication {
    private static App instance;
    private Stack<Activity> allActivities;

    public static int SCREEN_WIDTH = -1;
    public static int SCREEN_HEIGHT = -1;
    public static float DIMEN_RATE = -1.0F;
    public static int DIMEN_DPI = -1;
    private String mUserAgent;
    private static Context mContext;
    private static final String SHAREDPREFERENCES_NAME = "my_sp";

    public static synchronized App getInstance() {
        return instance;
    }
    public Context getContext(){
        return mContext;
    }
    static {
        AppCompatDelegate.setDefaultNightMode(
                AppCompatDelegate.MODE_NIGHT_NO);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        mContext = this;
        //初始化屏幕宽高
        getScreenSize();

        mUserAgent = new WebView(this).getSettings().getUserAgentString();

    }

    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    public void getScreenSize() {
        WindowManager windowManager = (WindowManager)this.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        Display display = windowManager.getDefaultDisplay();
        display.getMetrics(dm);
        DIMEN_RATE = dm.density / 1.0F;
        DIMEN_DPI = dm.densityDpi;
        SCREEN_WIDTH = dm.widthPixels;
        SCREEN_HEIGHT = dm.heightPixels;
        if(SCREEN_WIDTH > SCREEN_HEIGHT) {
            int t = SCREEN_HEIGHT;
            SCREEN_HEIGHT = SCREEN_WIDTH;
            SCREEN_WIDTH = t;
        }
    }

    public String getUserAgent() {
        return mUserAgent;
    }


    public void saveCookies(HashSet<String> cookies) {
        SharedPreferences mSPrefs = App.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = mSPrefs.edit();
        edit.putStringSet(Constants.sp_cookies, cookies);
        edit.commit();
    }

    public HashSet<String> getCookies() {
        SharedPreferences mSPrefs = App.getInstance().getSharedPreferences(SHAREDPREFERENCES_NAME, Context.MODE_PRIVATE);
        return (HashSet<String>) mSPrefs.getStringSet(Constants.sp_cookies, new HashSet<String>());
    }

    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new Stack<Activity>();
        }
        allActivities.add(act);
    }

    public void removeActivity(Activity act) {
        if (allActivities != null) {
            act.finish();
            allActivities.remove(act);
        }
    }
    /**
     * 结束指定类名的Activity
     */
    public void finishActivity(Class<?> cls) {
        for (Activity activity : allActivities) {
            if (activity.getClass().equals(cls)) {
                finishActivity(activity);
            }
        }
    }
    /**
     * 结束指定的Activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            allActivities.remove(activity);
            activity.finish();
            activity = null;
        }
    }
    public void popAllActivity() {
        while (true) {

            Activity activity = currentActivity();
            // Log.e("pop", "pop:"+activity.getLocalClassName());
            if (activity == null) {
                break;
            }
            removeActivity(activity);
        }
    }
    public void popAllActivityExceptOne(Class<?> cls) {
        while (true) {

            Activity activity = currentActivity();
            // Log.e("pop", "pop:"+activity.getLocalClassName());
            if (activity == null) {
                break;
            }
            if (activity.getClass().equals(cls)) {
                // Log.e("pop", "break");
                break;
            }
            removeActivity(activity);
        }
    }
    public Activity currentActivity() {

        if (allActivities != null && allActivities.size() > 0) {
            Activity activity = allActivities.lastElement();
            return activity;
        }
        return null;
    }
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

}
