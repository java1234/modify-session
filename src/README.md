# modify-session

本项目配套视频教程地址：[https://www.bilibili.com/video/BV1jh411B7Lp](https://www.bilibili.com/video/BV1jh411B7Lp)

#### 介绍
java动态修改用户Session项目
当前用户自身是可以通过sesssion.setAttribute方法修改session信息的。
![输入图片说明](https://images.gitee.com/uploads/images/2021/0811/094534_7fc795d7_4896466.png "屏幕截图.png")
但是我们在某些情况，业务上要求非自身用户修改Session；

比如管理员后台充值好vip后，数据是修改了，但是登录用户的Session没变化，用户看到的依然是非Vip，需要重新登录后，才能看到vip信息，用户体验就差劲了；如果我们可以动态的去修改任意一个用户的Session信息，那用户无需登录，刷新网页就立即能看到vip信息，那用户体验就上来了。


作者：java1234_小锋

官网站点：http://www.java1234.vip

关于锋哥：http://www.java1234.vip/article/14

java学习路线图：http://www.java1234.vip/article/1

锋哥微信：java3459

![输入图片说明](https://images.gitee.com/uploads/images/2021/0811/094711_5f12a7f5_4896466.png "屏幕截图.png")


