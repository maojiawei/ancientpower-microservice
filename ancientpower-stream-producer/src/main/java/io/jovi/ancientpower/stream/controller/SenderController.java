package io.jovi.ancientpower.stream.controller;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2020
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
public class SenderController {
    @Resource
    private DefaultMQProducer defaultMQProducer;


    /**
     * 使用一个controller断点模拟发送消息，可以在setHeader方法中设置header来实现消息过滤
     */
    @GetMapping("/message-send")
    public String testCustomInterfaceSendMsg(String msg) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        Message sendMsg = new Message("input1", "MyTag", msg.getBytes());
        //默认3秒超时
        SendResult sendResult = defaultMQProducer.send(sendMsg);
        SendStatus sendStatus = sendResult.getSendStatus();
        System.out.println("消息发送响应信息状态：" + sendStatus);
        System.out.println("消息发送响应信息：" + sendResult.toString());

        return "send success,msg:"+msg;
    }


}
