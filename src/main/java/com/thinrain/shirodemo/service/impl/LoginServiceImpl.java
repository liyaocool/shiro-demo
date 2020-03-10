package com.thinrain.shirodemo.service.impl;

import com.thinrain.shirodemo.bean.Permissions;
import com.thinrain.shirodemo.bean.Role;
import com.thinrain.shirodemo.bean.User;
import com.thinrain.shirodemo.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public User getUserByName(String getMapByName) {
        //模拟数据库查询，正常情况此处是从数据库或者缓存查询。
        return getMapByName(getMapByName);
    }

    /**
     * 模拟数据库查询
     *
     * @param userName
     * @return
     */
    @Override
    public User getMapByName(String userName) {
        //共添加两个用户，两个用户都是admin一个角色，
        //liyao有query和add权限，zhangsan只有一个query权限
        Permissions permissions1 = new Permissions("1", "query");
        Permissions permissions2 = new Permissions("2", "add");
        Set<Permissions> permissionsSet = new HashSet<Permissions>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        Role role = new Role("1", "admin", permissionsSet);
        Set<Role> roleSet = new HashSet<Role>();
        roleSet.add(role);
        User user = new User("1", "liyao", "123456", roleSet);
        Map<String, User> map = new HashMap<String, User>();
        map.put(user.getUserName(), user);

        Permissions permissions3 = new Permissions("3", "query");
        Set<Permissions> permissionsSet1 = new HashSet<Permissions>();
        permissionsSet1.add(permissions3);
        Role role1 = new Role("2", "user", permissionsSet1);
        Set<Role> roleSet1 = new HashSet<Role>();
        roleSet1.add(role1);
        User user1 = new User("2", "zhangsan", "123456", roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}