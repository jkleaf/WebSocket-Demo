package tk.leaflame.websocketdemo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;
import tk.leaflame.websocketdemo.common.Result;

/**
 * @author leaflame
 * @date 2019/10/22 23:47
 */
@RestController
@Api("测试接口")
public class TestController {

    @GetMapping("/test")
    public Result test() {
        return Result.ok("testing...", null);
    }

    @PatchMapping("/test/fuck")
    public Result testFuck() {
        return Result.ok("fuck you...");
    }

    @GetMapping("/admin")
    public Result admin() {
        return Result.ok("admin", null);
    }
}
