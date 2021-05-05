package io.jovi.ancientpower.provider.controller;

import io.jovi.ancientpower.provider.facade.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zlt
 * @date 2020/6/26
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@RestController
public class WebController {
    @Autowired
    private TestService service;

    @GetMapping("/test/{p}")
    public String test(@PathVariable("p") String param) {
        return service.test(param);
    }
}
