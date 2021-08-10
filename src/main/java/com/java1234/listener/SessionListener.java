package com.java1234.listener;

import com.java1234.custom.MySessionContext;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * session监听器
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-08-05 10:43
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    // 获取自定义session上下文实例
    private MySessionContext msc = MySessionContext.getInstance();

    /**
     * session创建事件
     * @param se
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session创建");
        HttpSession session = se.getSession();
        msc.addSession(session);  // 添加当前session到自定义session上下文
    }

    /**
     * session销毁事件
     * @param se
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session销毁");
        HttpSession session = se.getSession();
        //todo 要从数据库或者redis缓存把指定sessionId的用户session信息删除
        msc.delSession(session);  // 从自定义session上下文里删除当前session
    }
}