package com.thinrain.shirodemo.service;

import com.thinrain.shirodemo.bean.User;

/**
 * Author  liyao
 * Date  2020/3/10 14:58
 * Version 1.0
 * Description
 */
public interface LoginService {
    /**
     *
     * @param getMapByName
     * @return
     */
    public User getUserByName(String getMapByName);

    public User getMapByName(String userName);
}
