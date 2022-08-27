package com.example.demo.Controller;

import com.example.demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 用户controller
 * @author lrj
 */
@RestController
@RequestMapping(path = "/user")
@Api(tags = "用户")
public class UserController {


    /**
     * 获取用户信息
     *
     * @param userName
     * @return
     */
    @GetMapping("/getUserInfo")
    @ResponseBody
    @ApiOperation(value = "获取用户信息" ,response = User.class, notes="详细的描述",produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserInfo(@ApiParam(value = "用户名", required = true)
                            @RequestParam(name = "userName", defaultValue = "张三") String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setAge(20);
        return user;
    }
}