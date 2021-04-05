package io.jovi.ancientpower.provider.service;

import io.jovi.ancientpower.provider.facade.TicketService;
import org.apache.dubbo.config.annotation.DubboService;

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
@DubboService(group = "dubbo")
public class TicketServiceImpl implements TicketService {
    /**
     * 接口定义
     *
     * @return
     */
    @Override
    public String getTicket() {
        return "ticket A";
    }
}
