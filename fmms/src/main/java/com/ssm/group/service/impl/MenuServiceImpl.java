package com.ssm.group.service.impl;

import com.ssm.group.dao.mapper.SysMenuMapper;
import com.ssm.group.entity.SysMenu;
import com.ssm.group.service.MenuService;
import com.ssm.group.service.RedisService;
import com.ssm.group.service.impl.base.BaseServiceImpl;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @ClassName MenuServiceImpl
 * @description 菜单服务
 * @date 2020/1/9
 */
@Service
@Log4j
public class MenuServiceImpl extends BaseServiceImpl<SysMenu> implements MenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;

    @Autowired
    private RedisService redisService;
    @Override
    public int addMenu() {
        SysMenu menu = new SysMenu();
        Date date = new Date();
        menu.setMenuName("标签管理");
        menu.setUrl("gmms/main/views/SysTagMainView");
        menu.setCreateBy("admin");
        menu.setCreateDate(date);
        menu.setUpdateBy("admin");
        menu.setUpdateDate(date);
        menu.setMenuCode("tagManager");
        menu.setLevel(1);
        menu.setSort(1);
        menu.setDelFlag((byte) 0);
        this.sysMenuMapper.insert(menu);
        this.redisService.hset("MENU_CODE","MENU_"+menu.getMenuId(),menu);
        return 1;
    }
}
