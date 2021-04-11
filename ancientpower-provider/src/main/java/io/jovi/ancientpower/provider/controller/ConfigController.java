package io.jovi.ancientpower.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Value("${ancientpower.cache:0}")
    private Integer useLocalCache;

    @RequestMapping("/get")
    public Integer get() {
        return useLocalCache;
    }

}
