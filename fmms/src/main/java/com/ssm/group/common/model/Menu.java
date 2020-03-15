package com.ssm.group.common.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @ClassName Menu
 * @description 菜单
 * @date 2020/1/4
 */
@Data
@EqualsAndHashCode
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;


    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单路径
     */
    private String url;
}
