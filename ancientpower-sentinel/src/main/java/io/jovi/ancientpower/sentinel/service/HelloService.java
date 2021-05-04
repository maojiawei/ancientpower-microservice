package io.jovi.ancientpower.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

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
@Service
public class HelloService {

    @SentinelResource(value = "sayHello")
    public String sayhello(String msg){
        return "Hello,"+msg;
    }
}
