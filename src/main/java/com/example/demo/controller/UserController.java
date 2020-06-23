package com.example.demo.controller;

import com.example.demo.entity.Response;
import com.example.demo.entity.ResponseResult;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/* 类注解 */
@Api(value = "用户信息")
@RestController
public class UserController {
    @Autowired
    UserService service;
    /* 方法注解 */
    @ApiOperation(value = "获取用户信息")
    @RequestMapping(value = "/getUserItem",method = RequestMethod.GET)
    public ResponseResult<User> getUserItem(){
        try {
            User user = service.getUserInfo();
            String[] arr= new String[]{"测试"};
            return  Response.makeOKRsp(user);
        }catch (Exception e)
        {
            return  Response.makeErrRsp("查询用户信息异常");
        }
    }

    @ApiOperation("根据id查询用户的接口")
    /* 参数注解 */
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "00", required = true)
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    public ResponseResult<User> getUserById(@PathVariable Integer id) {
        User user = service.getUserInfo();
        return  Response.makeOKRsp(user);
    }

    @ApiOperation(value = "获取用户字符串")
    @RequestMapping(value = "/api/getStr",method = RequestMethod.GET)
    public String getStr()
    {
        return  service.getStr();
    }
}
