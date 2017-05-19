package com.nigel.wechat.common.constant;

import com.github.sd4324530.fastweixin.api.config.ApiConfig;

/**
 * 微信账号配置类 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/5/1 0001  13:08
 */
public class WeixinConfig {
    public static final String appid = "wx46126c68d98f25b7";
    public static final String secret = "629ce902a1b930959e4aabb105c04977";
    public static final String token = "nigel";

    public static ApiConfig config = new  ApiConfig(appid, secret);

}
