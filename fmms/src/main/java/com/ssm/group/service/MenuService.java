package com.ssm.group.service;

import com.ssm.group.entity.SysMenu;
import com.ssm.group.service.base.BaseService;

public interface MenuService extends BaseService<SysMenu> {

    int addMenu();
}
