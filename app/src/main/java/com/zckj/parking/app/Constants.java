package com.zckj.parking.app;

import android.os.Environment;


import java.io.File;

/**
 * Created by wmq on 2018/1/5.
 */
public class Constants {
    private static boolean debugMode = false;

//    //正式
//    public static  String BASE_URL = "https://api.yftx365.com";

    //测试
    public static String BASE_URL = "http://fang.an9.top:8000";

    //测试2
//    public static  String BASE_URL = "http://192.168.10.198";

    //用于一键切换测试环境
    public static String TEST_BASE_URL = "http://fang.an9.top:8000";

    public static String PIC_BASE_URL = "";


    public static final int MIUI_ROM = 1;
    public static final int FLYME_ROM = 2;
    public static final int EMUI_ROM = 3;
    public static final int OTHER_ROM = 4;

    public static final String ROLETYPE_MANAGER = "4";//项目总
    public static final String ROLETYPE_ZC = "3";//驻场
    public static final String ROLETYPE_MARKET = "2";//市场

    public static final String ORDER_REWARD_DISABLE = "0";//不可申请
    public static final String ORDER_REWARD_APPLY = "1";//申请
    public static final String ORDER_REWARD_WAIT_APPLY = "2";//待申请
    public static final String ORDER_REWARD_WAIT_CHECK = "3";//待审核
    public static final String ORDER_REWARD_WAIT_LOAN = "4";//待放款
    public static final String ORDER_REWARD_ALREADY_LOAN = "5";//已放款
    public static final String ORDER_REWARD_APPLY_AGAIN = "6";//重新申请
    public static final String ORDER_REWARD_APPLY_FAIL = "7";//申请失败


    public static final String ORDERR_START_REPORT= "1";//发起报备
    public static final String ORDERR_WAIT_DEFINE= "2";//等待界定
    public static final String ORDERR_REPORT_VALID= "3";//报备有效
    public static final String ORDERR_APPLY_SHOW= "7";//申请带看
    public static final String ORDER_SHOW_SUCCESS = "8";//带看成功
    public static final String ORDER_SHOW_AGAIN = "19";//重新带看
    public static final String ORDER_RENCHOU = "10";//已认筹
    public static final String ORDER_TUICHOU= "11";//已退筹
    public static final String ORDER_APPLY_DEAL_AGAIN = "23";//重新发起成交
    public static final String ORDER_SHOW_TIMEOUT = "9";//带看超时
    public static final String ORDER_WAIT_PAY = "17";//等待结佣
    public static final String ORDER_APPLY_DEAL = "16";//申请成交
    public static final String ORDER_PAYING = "24";//结佣中
    public static final String ORDER_CLOSE = "5";//订单关闭

    //================= RESULT ====================
    public static final int FIND_PWD_SUCCESS_RESULTCODE = 101;

    public static final int REGISTER_SUCCESS_RESULTCODE = 102;

    public static final int REQUEST_CODE_ENTERPRISE_LICENSECHOOSE = 222;//营业执照
    public static final int REQUEST_CODE_OPENCHOOSE = 223;//开户许可证
    public static final int REQUEST_CODE_COOPERATIVECHOOSE = 224;//营业执照

    public static final int REQUEST_CODE_CHOOSE_PIC = 66;

    public static final int REQUEST_CODE_SCAN = 77;
    public static final int RESULT_CODE_SCAN = 78;

    public static final int REQUEST_CODE_CHOOSE_INVOICE_PIC = 67; //选取发票
    public static final int REQUEST_CODE_CHOOSE_TAKE_PIC = 68;//现场拍照

    public static final int REQUEST_CODE_CHOOSE_DAIKAN_PIC = 69; //带看图片
    public static final int REQUEST_CODE_CHOOSE_CUSTOMER_CONFIRM_PIC = 70;//客户确认单

    //================= TYPE ====================

    public static final int TYPE_ZHIHU = 101;

    public static final String FLAG_BAOBEI = "baobei";//报备申请
    public static final String FLAG_DAIKAN = "daikan";//带看申请
    public static final String FLAG_REWARD = "reward";//奖励

    public static final String FLAG_REWARD_SHOW = "reward_show";//带看奖励
    public static final String FLAG_REWARD_OIL = "reward_oil";//油补奖励


    public static final String FLAG_SCENE = "scene";//现场
    public static final String FLAG_SALE = "sale";//销售
    public static final String FLAG_MYBUILDING = "mybuilding";//驻场-我的楼盘
    public static final String FLAG_ALLBUILDING = "allbuilding";//驻场-所有楼盘

    //签约资料页面
    public static final String FLAG_ZC_CHECK = "zc_check";//经纪人提交，驻场需要审核
    public static final String FLAG_ZC = "zc";//驻场自己提交申请,无需审核直接确认
    public static final String FLAG_Fill = "fill";//驻场填写签约资料


    public static final String TYPE_CLOSE = "close";//关闭奖励
    public static final String TYPE_REFUSED = "refused";//拒绝奖励

    public static final String TYPE_PINPAI ="pinpai";//选择品牌公司
    public static final String TYPE_COMPANY ="company";//选择品牌公司

    public static final String TYPE_ADD ="add";//添加
    public static final String TYPE_EDIT ="edit";//编辑

    public static final String TYPE_ID ="id";
    public static final String TYPE_QRCODE ="qrcode";



    //================= KEY ====================
    public static final String KEY1 = "sifangqian_api_Sks41hhD991J";

    public static final String MSG_TYPE = "msgtype";
    public static final String CHECK_VALUE = "checkvalue";

    public static final String SORT_DESC = "name";
    public static final String SORT_ASC = "asc";



    public static final String KEY_API = "52b7ec3471ac3bec6846577e79f20e4c"; //需要APIKEY请去 http://www.tianapi.com/#wxnew 申请,复用会减少访问可用次数

    public static final String KEY_ALIPAY = "aex07566wvayrgxicnaraae";

    public static final String LEANCLOUD_ID = "mhke0kuv33myn4t4ghuid4oq2hjj12li374hvcif202y5bm6";

    public static final String LEANCLOUD_SIGN = "badc5461a25a46291054b902887a68eb,1480438132702";

    public static final String BUGLY_ID = "257700f3f8";

    public static final String BUILDING_COUNT_STATUS = "building_count_status";
    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "codeest" + File.separator + "GeekNews";

    //================= PREFERENCE ====================

    public static final String SP_NIGHT_MODE = "night_mode";

    public static final String SP_NO_IMAGE = "no_image";

    public static final String sp_user_info = "user_info";

    public static final String sp_cookies = "cookies";

    public static final String sp_is_login = "is_login";//判断登录状态

    public static final String sp_role_type = "role_type";//角色类型


    public static final String sp_user_account = "user_account";

    public static final String sp_user_pwd = "user_pwd";

    public static final String sp_area_info = "area_info";

    public static final String sp_mobile = "sp_mobile";//用于极光推送别名设置

    //================= INTENT ====================

    public static final String IT_GANK_TYPE = "gank_type";

    public static final String IT_MOBILE_INFO = "mobile_info";

    public static final String IT_SCAN_DATA = "scan_data";

    public static final String IT_WEB_URL = "web_url";

    public static final String IT_USER_INFO = "user_info";

    public static final String IT_FLAG = "flag";

    public static final String IT_TYPE = "type";

    public static final String IT_ID = "id";

    public static final String IT_IMAGES = "images";

    public static final String IT_IMAGES_POS = "images_pos";

    public static final String IT_STOREID = "store_id";

    public static final String IT_STOREBEAN = "store_bean";

    public static final String IT_NOTICEOPEN = "notice_open";

    public static final String IT_PREMISESID = "premisesId";

    public static final String IT_DETAIL_BEAN = "detail_bean";

    public static final String IT_ORDERID = "orderid";

    public static final String IT_INVOICE_IMAGES = "invoiceimages"; //发票图片

    public static final String IT_SCENE_IMAGES = "sceneimages";//现场合照

    public static final String IT_DATABEAN = "databean";
    //================= Bundle  ====================
    public static final String Bundle_Detail = "bundle_detail";
    public static final String Bundle_StoreID = "bundle_StoreID";
    public static final String Bundle_Scene = "bundle_scene";

    public static boolean isDebugMode() {
        return debugMode;
    }
    public static void setDebugMode(boolean b) {
        debugMode = b;
    }

    public static String getPicBaseUrl() {
        return PIC_BASE_URL;
    }

    public static void setPicBaseUrl(String picBaseUrl) {
        PIC_BASE_URL = picBaseUrl;
    }
}
