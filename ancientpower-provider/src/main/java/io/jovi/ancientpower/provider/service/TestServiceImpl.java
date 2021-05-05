package io.jovi.ancientpower.provider.service;

import io.jovi.ancientpower.provider.facade.TestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author zlt
 * @date 2020/6/26
 * <p>
 * Blog: https://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@DubboService
public class TestServiceImpl implements TestService {
    @Override
    public String test(String param) {
        return "dubbo service: " + param;
    }
}
