package com.zckj.parking.http;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


/**
 * Created by Atu on 2016/9/17.
 */
public class ResultJsonDeser implements JsonDeserializer<HttpResponse<?>> {

    @Override
    public HttpResponse<?> deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        HttpResponse result = new HttpResponse();
        if (json.isJsonObject()){
            JsonObject jsonObject = json.getAsJsonObject();
            String resultCode = jsonObject.get("code").getAsString();
            result.setCode(jsonObject.get("code").getAsString());
//            if (resultCode.equals("297")){//未绑定门店
//                result.setMessage(jsonObject.get("message").getAsString());
//                JsonElement data = jsonObject.get("data");
//                if (data!= null && data.toString() != null && !data.toString().equals("") && !data.toString().equals("\"\"")){
//                    JsonObject dataObject = jsonObject.get("data").getAsJsonObject();
//                    String uid = dataObject.get("uid").getAsString();
//                }
//                return result;
//            }
            if (!resultCode.equals("200")){
                result.setMessage(jsonObject.get("message").getAsString());
                return result;
            }
            JsonElement data = jsonObject.get("data");
            if (data!= null && data.toString() != null && !data.toString().equals("") && !data.toString().equals("\"\"")){
                Type itemType = ((ParameterizedType) type).getActualTypeArguments()[0];
                result.setData(context.deserialize(jsonObject.get("data"),itemType));
            }
        }
        return result;
    }
}
