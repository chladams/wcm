package cn.skylark.wcm.controller;

import cn.skylark.wcm.entity.User;
import cn.skylark.wcm.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(value="用户相关的接口")
@RestController
@RequestMapping("/user")
public class UserController {
//    Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public PageInfo<User> list() {
		 /*
         * 第一个参数是第几页；第二个参数是每页显示条数。
         */
        PageHelper.startPage(1,1);
        List<User> list=userService.getUsers();
        PageInfo<User> pageInfo=new PageInfo<User>(list);
        return pageInfo;
    }

    @RequestMapping("/get")
    public User list(Integer id) {
        return userService.getUser(id);
    }

    @RequestMapping("/add")
    @ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",paramType="query",dataType="Integer"),
            @ApiImplicitParam(name="username",paramType="query",dataType="string"),
            @ApiImplicitParam(name="state",paramType="query",dataType="Integer"),
    })
    public String add(User user) {
//        logger.info("测试日志");
        return "Hello" + userService.addUser(user);
    }
}