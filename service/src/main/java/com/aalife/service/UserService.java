package com.aalife.service;

import com.aalife.bo.UserOverviewBo;
import com.aalife.bo.WxUserBo;

import java.util.Map;

/**
 * 用户登录类
 * @author brother lu
 * @date 2018-06-04
 */
public interface UserService {
    /**
     * 用户登录
     * @param wxUser
     */
    void login(WxUserBo wxUser);

    /**
     * DEV Login，用于本地测试接口
     * @param wxUser
     */
    void DEVLogin(WxUserBo wxUser);
    /**
     * 获取用户的信息概括
     * @return
     */
    UserOverviewBo getUserOverview();
}
