package top.caker.gmall.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.caker.gmall.lock.LockService;

/**
 * 分布式锁测试
 *
 * @author cakeralter
 * @date 2020/5/31
 */
@Api(value = "LockController", tags = "分布式锁测试")
@RestController
@RequestMapping("/lock")
public class LockController {

    @Reference
    private LockService lockService;

    @GetMapping
    public String lock() {
        return lockService.lock();
    }
}
