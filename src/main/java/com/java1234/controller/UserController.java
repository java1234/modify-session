package com.java1234.controller;

import com.java1234.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

/**
 * 用户controller
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-08-03 21:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 模拟用户登录
     * @return
     */
    @RequestMapping("/login")
    public String login(HttpSession session){
        User uesr=new User(1,"java1234","123456");
        session.setAttribute("currentUser",uesr);
        System.out.println(session.getId());
        ServletContext servletContext = session.getServletContext();
        // 模拟存储用户session信息到数据库 用application模拟
        servletContext.setAttribute(String.valueOf(uesr.getId()),session.getId()); // key-value 用户id-sessionId
        return "success";
    }

    /**
     * 获取当前用户信息
     * @param session
     * @return
     */
    @RequestMapping("/getUserInfo")
    public User getUserInfo(HttpSession session){
        return (User)session.getAttribute("currentUser");
    }
}
