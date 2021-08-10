package com.java1234.controller;

import com.java1234.custom.MySessionContext;
import com.java1234.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.HashMap;


/**
 * 管理员Controller控制器
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-08-07 23:05
 */
@RequestMapping("/manager")
@RestController
public class ManagerController {

    /**
     * 模拟用户登录
     * @return
     */
    @RequestMapping("/modifySession")
    public String modifySession(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        String userId="1"; // 修改userId=1的用户
        String sessionId = (String)servletContext.getAttribute(userId);  // 从servletContext上下文 根据userId获取sessionId
        System.out.println("sessionId:"+sessionId);
        HashMap<String, HttpSession> sessionMap = MySessionContext.sessionMap; // 获取sessionMap
        HttpSession currentSession = sessionMap.get(sessionId); // 根据sessionId获取用户session
        User user = (User)currentSession.getAttribute("currentUser"); // 根据session得到用户信息
        user.setLevel("vip"); // 修改内容
        return "success";
    }

}