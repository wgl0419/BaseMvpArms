package com.zckj.parking.mvp.model.entity;

import java.io.Serializable;

/**
 * Created by wmq on 2018/1/15.
 */

public class UserInfoBean implements Serializable {
        /**
         * userInfo : {"uid":"3d7b5a0de9289d3d3af53f0d5d9345e5","username":"18876331921","real_name":"朱志敏","create_time":"2018-10-15 09:23:52","last_login_time":null,"is_credentials_expired":"0","portrait_md5":"1539566682335720230","role_id":"9","role_code":"ROLE_AGENT","role_name":"经纪人","is_incumbency":"1","agent_id":"644a99738e4296f2817226795c51f72e","store_id":"8a9a4ece5c4042cc015c9bbb16ea7f31","profile":null,"role_type":1,"store_name":"泉州易渠房地产咨询有限公司","address":"福建省泉州市晋江市梅岭街道双龙路九湾区M2栋2506","province_namme":"福建省","city_name":"泉州市","district_name":"晋江市"}
         */

        private UserInfo userInfo;

        public UserInfo getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfo userInfo) {
            this.userInfo = userInfo;
        }

        public static class UserInfo {
            /**
             * uid : 3d7b5a0de9289d3d3af53f0d5d9345e5
             * username : 18876331921
             * real_name : 朱志敏
             * create_time : 2018-10-15 09:23:52
             * last_login_time : null
             * is_credentials_expired : 0
             * portrait_md5 : 1539566682335720230
             * role_id : 9
             * role_code : ROLE_AGENT
             * role_name : 经纪人
             * is_incumbency : 1
             * agent_id : 644a99738e4296f2817226795c51f72e
             * store_id : 8a9a4ece5c4042cc015c9bbb16ea7f31
             * profile : null
             * role_type : 1
             * store_name : 泉州易渠房地产咨询有限公司
             * address : 福建省泉州市晋江市梅岭街道双龙路九湾区M2栋2506
             * province_namme : 福建省
             * city_name : 泉州市
             * district_name : 晋江市
             */

            private String uid;
            private String username;
            private String real_name;
            private String create_time;
            private Object last_login_time;
            private String is_credentials_expired;
            private String portrait_md5;
            private String role_id;
            private String role_code;
            private String role_name;
            private String is_incumbency;
            private String agent_id;
            private String store_id;
            private Object profile;
            private int role_type;
            private String store_name;
            private String address;
            private String province_namme;
            private String city_name;
            private String district_name;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public String getCreate_time() {
                return create_time;
            }

            public void setCreate_time(String create_time) {
                this.create_time = create_time;
            }

            public Object getLast_login_time() {
                return last_login_time;
            }

            public void setLast_login_time(Object last_login_time) {
                this.last_login_time = last_login_time;
            }

            public String getIs_credentials_expired() {
                return is_credentials_expired;
            }

            public void setIs_credentials_expired(String is_credentials_expired) {
                this.is_credentials_expired = is_credentials_expired;
            }

            public String getPortrait_md5() {
                return portrait_md5;
            }

            public void setPortrait_md5(String portrait_md5) {
                this.portrait_md5 = portrait_md5;
            }

            public String getRole_id() {
                return role_id;
            }

            public void setRole_id(String role_id) {
                this.role_id = role_id;
            }

            public String getRole_code() {
                return role_code;
            }

            public void setRole_code(String role_code) {
                this.role_code = role_code;
            }

            public String getRole_name() {
                return role_name;
            }

            public void setRole_name(String role_name) {
                this.role_name = role_name;
            }

            public String getIs_incumbency() {
                return is_incumbency;
            }

            public void setIs_incumbency(String is_incumbency) {
                this.is_incumbency = is_incumbency;
            }

            public String getAgent_id() {
                return agent_id;
            }

            public void setAgent_id(String agent_id) {
                this.agent_id = agent_id;
            }

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public Object getProfile() {
                return profile;
            }

            public void setProfile(Object profile) {
                this.profile = profile;
            }

            public int getRole_type() {
                return role_type;
            }

            public void setRole_type(int role_type) {
                this.role_type = role_type;
            }

            public String getStore_name() {
                return store_name;
            }

            public void setStore_name(String store_name) {
                this.store_name = store_name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getProvince_namme() {
                return province_namme;
            }

            public void setProvince_namme(String province_namme) {
                this.province_namme = province_namme;
            }

            public String getCity_name() {
                return city_name;
            }

            public void setCity_name(String city_name) {
                this.city_name = city_name;
            }

            public String getDistrict_name() {
                return district_name;
            }

            public void setDistrict_name(String district_name) {
                this.district_name = district_name;
            }
    }
}
