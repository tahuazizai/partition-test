package com.ssm.group.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.group.common.model.GridQo;
import com.ssm.group.common.model.Menu;
import com.ssm.group.controller.base.BaseController;
import com.ssm.group.entity.SysMenu;
import com.ssm.group.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MainController
 * @description 主页控制器
 * @date 2020/1/4
 */
@RestController
@RequestMapping("/gmms/main")
public class MainController extends BaseController<SysMenu> {

    @Autowired
    private MenuService menuService;
    @GetMapping("/queryAllMenu")
    public List<Menu> queryAllMenu() {
        List<Menu> menuList = new ArrayList<>();
        Menu menu = new Menu();
        menu.setId(1L);
        menu.setName("字典管理");
        menu.setUrl("gmms/main/views/SysMenuMainView");
        menuList.add(menu);
        return menuList;
    }

    @PostMapping("/queryPageMenu")
    public PageInfo<Menu> queryPageGrid(@RequestBody GridQo gridQo){
        PageHelper.startPage(gridQo.getPageNum(),gridQo.getPageSize());
        PageInfo<Menu> pageInfo = new PageInfo<>();
        return pageInfo;
    }
}
