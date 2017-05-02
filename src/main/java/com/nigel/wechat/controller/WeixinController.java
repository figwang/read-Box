package com.nigel.wechat.controller;
import com.github.sd4324530.fastweixin.handle.EventHandle;
import com.github.sd4324530.fastweixin.handle.MessageHandle;
import com.github.sd4324530.fastweixin.message.BaseMsg;
import com.github.sd4324530.fastweixin.message.TextMsg;
import com.github.sd4324530.fastweixin.message.req.TextReqMsg;
import com.github.sd4324530.fastweixin.servlet.WeixinControllerSupport;
import com.nigel.wechat.common.constant.WeixinConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * 微信基本服务类 .
 *
 * @author nigel.wang
 * @version 1.0.0
 * @Date 2017/5/1 0001  12:55
 */
    @RestController
    @RequestMapping("/weixin")
 public class WeixinController extends WeixinControllerSupport {
        private static final Logger log = LoggerFactory.getLogger(WeixinController.class);
        //设置TOKEN，用于绑定微信服务器
        @Override
        protected String getToken() {
            return WeixinConfig.token;
        }
        //使用安全模式时设置：APPID
        @Override
        protected String getAppId() {
            return null;
        }
        //使用安全模式时设置：密钥
        @Override
        protected String getAESKey() {
            return null;
        }
        //重写父类方法，处理对应的微信消息
        @Override
        protected BaseMsg handleTextMsg(TextReqMsg msg) {
            String content = msg.getContent();
            log.debug("用户发送到服务器的内容:{}", content);
            return null;
        }
        /*重写父类方法，加入自定义微信消息处理器
         *不是必须的，上面的方法是统一处理所有的文本消息，如果业务觉复杂，上面的会显得比较乱
         *这个机制就是为了应对这种情况，每个MessageHandle就是一个业务，只处理指定的那部分消息
         */
        @Override
        protected List<MessageHandle> initMessageHandles() {
            List<MessageHandle> handles = new ArrayList<MessageHandle>();
            MessageHandle<TextReqMsg>  a = new MessageHandle<TextReqMsg>() {

                public BaseMsg handle(TextReqMsg textReqMsg) {

                    return new TextMsg("调哥!001----http://sevenfan.imwork.net/readBox/view/wechatView/account_bind.html"+textReqMsg.getContent());
                }

                public boolean beforeHandle(TextReqMsg textReqMsg) {
                    return true;
                }
            };
            handles.add(a);
            return handles;
        }
        //重写父类方法，加入自定义微信事件处理器，同上
        @Override
        protected List<EventHandle> initEventHandles() {
            List<EventHandle> handles = new ArrayList<EventHandle>();
            handles.add(null);
            return handles;
        }
    }


