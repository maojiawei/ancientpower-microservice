package io.jovi.ancientpower.consumer;

import io.jovi.ancientpower.provider.facade.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
public class HelloController {
    @DubboReference(timeout = 300000,check = false)
    private TicketService service;

    @GetMapping("get")
    public String get(){
        return service.getTicket();
    }
}
