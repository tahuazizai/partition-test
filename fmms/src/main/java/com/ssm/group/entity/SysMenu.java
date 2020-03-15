package com.ssm.group.entity;

import com.ssm.group.entity.base.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menu")
public class SysMenu extends BaseEntity implements Serializable {
    /**
     * 菜单标识
     */
    @Id
    @Column(name = "MENU_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String menuId;

    /**
     * 菜单名称
     */
    @Column(name = "MENU_NAME")
    private String menuName;

    /**
     * 菜单编码
     */
    @Column(name = "MENU_CODE")
    private String menuCode;

    /**
     * 菜单类型
     */
    @Column(name = "MENU_TYPE")
    private String menuType;

    /**
     * 链接地址
     */
    @Column(name = "URL")
    private String url;

    /**
     * 链接目标
     */
    @Column(name = "TARGET")
    private String target;

    /**
     * 显示图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 父级标识。根节点的父级ID为0
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 父级路径
     */
    @Column(name = "PARENT_IDS")
    private String parentIds;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 层级
     */
    @Column(name = "LEVEL")
    private Integer level;

    /**
     * 备注信息
     */
    @Column(name = "REMARKS")
    private String remarks;

    /**
     * 创建人
     */
    @Column(name = "CREATE_BY")
    private String createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 创建者
     */
    @Column(name = "UPDATE_BY")
    private String updateBy;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    /**
     * 删除标识。0：正常；1：已删除
     */
    @Column(name = "DEL_FLAG")
    private Byte delFlag;

    private static final long serialVersionUID = 1L;

    /**
     * 获取菜单标识
     *
     * @return MENU_ID - 菜单标识
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单标识
     *
     * @param menuId 菜单标识
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * 获取菜单名称
     *
     * @return MENU_NAME - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * 获取菜单编码
     *
     * @return MENU_CODE - 菜单编码
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单编码
     *
     * @param menuCode 菜单编码
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    /**
     * 获取菜单类型
     *
     * @return MENU_TYPE - 菜单类型
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * 设置菜单类型
     *
     * @param menuType 菜单类型
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * 获取链接地址
     *
     * @return URL - 链接地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置链接地址
     *
     * @param url 链接地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 获取链接目标
     *
     * @return TARGET - 链接目标
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置链接目标
     *
     * @param target 链接目标
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * 获取显示图标
     *
     * @return ICON - 显示图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置显示图标
     *
     * @param icon 显示图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取父级标识。根节点的父级ID为0
     *
     * @return PARENT_ID - 父级标识。根节点的父级ID为0
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父级标识。根节点的父级ID为0
     *
     * @param parentId 父级标识。根节点的父级ID为0
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * 获取父级路径
     *
     * @return PARENT_IDS - 父级路径
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * 设置父级路径
     *
     * @param parentIds 父级路径
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取层级
     *
     * @return LEVEL - 层级
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置层级
     *
     * @param level 层级
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取备注信息
     *
     * @return REMARKS - 备注信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注信息
     *
     * @param remarks 备注信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 获取创建人
     *
     * @return CREATE_BY - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATE - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建者
     *
     * @return UPDATE_BY - 创建者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置创建者
     *
     * @param updateBy 创建者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_DATE - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取删除标识。0：正常；1：已删除
     *
     * @return DEL_FLAG - 删除标识。0：正常；1：已删除
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识。0：正常；1：已删除
     *
     * @param delFlag 删除标识。0：正常；1：已删除
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuCode=").append(menuCode);
        sb.append(", menuType=").append(menuType);
        sb.append(", url=").append(url);
        sb.append(", target=").append(target);
        sb.append(", icon=").append(icon);
        sb.append(", parentId=").append(parentId);
        sb.append(", parentIds=").append(parentIds);
        sb.append(", sort=").append(sort);
        sb.append(", level=").append(level);
        sb.append(", remarks=").append(remarks);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", delFlag=").append(delFlag);
        sb.append("]");
        return sb.toString();
    }
}