package com.java1234.custom;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * 自定义session上下文
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-08-05 10:39
 */
public class MySessionContext {

    private static MySessionContext instance;
    // session map存储session  如果session较多，影响到系统性能的话，可以把用redis，key-value  sessionId->session对象 session对象序列化
    public static HashMap<String,HttpSession> sessionMap;

    private MySessionContext() {
        sessionMap = new HashMap<String,HttpSession>();
    }

    /**
     * 单例
     * @return
     */
    public static MySessionContext getInstance() {
        if (instance == null) {
            instance = new MySessionContext();
        }
        return instance;
    }

    /**
     * 添加session
     * @param session
     */
    public synchronized void addSession(HttpSession session) {
        if (session != null) {
            System.out.println("session添加成功！");
            sessionMap.put(session.getId(), session);
        }
    }

    /**
     * 删除session
     * @param session
     */
    public synchronized void delSession(HttpSession session) {
        if (session != null) {
            System.out.println("session删除成功！");
            sessionMap.remove(session.getId());
        }
    }

    /**
     * 根据sessionId获取session
     * @param sessionID
     * @return
     */
    public synchronized HttpSession getSession(String sessionID) {
        if (sessionID == null) {
            return null;
        }
        return sessionMap.get(sessionID);
    }
}