package com.ssm.group.service.impl.base;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.group.common.model.GridQo;
import com.ssm.group.dao.base.BaseMapper;
import com.ssm.group.service.base.BaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @ClassName BaseServiceImpl
 * @description 基类接口实现
 * @date 2020/1/4
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    protected BaseMapper<T> baseMapper;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return this.baseMapper.deleteByPrimaryKey(o);
    }

    @Override
    public PageInfo<T> selectGridData(GridQo query) {
        Page<T> page = PageHelper.startPage(query.getPageNum(), query.getPageSize(), true);
        page.setReasonable(false);
        Type t = getClass().getGenericSuperclass();
        ParameterizedType p1 = (ParameterizedType) t ;
        Class<T> modelClass = (Class) p1.getActualTypeArguments()[0];
        Example cnd = new Example(modelClass, false);
        Example.Criteria criteria = cnd.createCriteria();
        String filerVal = query.getFilterVal();
        if (StringUtils.isNotBlank(filerVal)) {
            String filerCol = query.getFilterCol();
            String[] aCol = StringUtils.split(filerCol, ",");
            String[] var9 = aCol;
            int var10 = aCol.length;

            for(int var11 = 0; var11 < var10; ++var11) {
                String col = var9[var11];
                criteria.orLike(col, '%' + filerVal + "%");
            }
        }

        this.addOrderBy(query, cnd);
        Map<String, Object> anyProperties = query.getAnyProperties();
        if (anyProperties != null) {
            Iterator itProps = anyProperties.entrySet().iterator();

            label38:
            while(true) {
                while(true) {
                    String p;
                    Object v;
                    do {
                        if (!itProps.hasNext()) {
                            break label38;
                        }

                        Map.Entry<String, Object> e = (Map.Entry)itProps.next();
                        p = e.getKey();
                        v = e.getValue();
                    } while(v == null);

                    if (v instanceof String) {
                        criteria.andEqualTo(p, (String)v);
                    } else if (!(v instanceof Integer) && !(v instanceof Long)) {
                        if (Iterable.class.isAssignableFrom(v.getClass())) {
                            criteria.andIn(p, (Iterable)v);
                        }
                    } else {
                        criteria.andEqualTo(p, v);
                    }
                }
            }
        }

        this.baseMapper.selectByExample(cnd);
        return page.toPageInfo();
    }

    private void addOrderBy(GridQo query, Example cnd) {
        if (StringUtils.isNotBlank(query.getSortName())) {
            if ("asc".equalsIgnoreCase(query.getSortOrder())) {
                cnd.orderBy(query.getSortName()).asc();
            } else if ("desc".equalsIgnoreCase(query.getSortOrder())) {
                cnd.orderBy(query.getSortName()).desc();
            }
        }

    }

    /**
     * 根据实体属性作为条件进行删除，查询条件使用等号
     */
    @Override
    public int delete(T t) {
        return this.baseMapper.delete(t);
    }

    /**
     * 保存一个实体，null属性也会保存
     *
     * @param t
     * @return
     */
    @Override
    public int insert(T t) {
        return this.baseMapper.insert(t);
    }

    /**
     * 保存一个实体，null属性不会保存
     *
     * @param t
     * @return
     */
    @Override
    public int insertSelective(T t) {
        return this.baseMapper.insertSelective(t);
    }

    /**
     * 查询全部结果，select(null)方法能达到同样的效果
     */
    @Override
    public List<T> selectAll() {
        return this.baseMapper.selectAll();
    }

    /**
     * 根据主键查询对象的值
     */
    @Override
    public T selectByPrimaryKey(Object o) {
        return this.baseMapper.selectByPrimaryKey(o);
    }

    /**
     * 根据实体中的属性查询总数，查询条件使用等号
     */
    @Override
    public int selectCount(T t) {
        return this.baseMapper.selectCount(t);
    }

    /**
     * 根据实体中的属性值进行查询，查询条件使用等号
     */
    @Override
    public List<T> select(T t) {
        return this.baseMapper.select(t);
    }

    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
     */
    @Override
    public T selectOne(T t) {
        return this.baseMapper.selectOne(t);
    }

    /**
     * 根据主键更新属性的值
     */
    @Override
    public int updateByPrimaryKey(T t) {
        return this.baseMapper.updateByPrimaryKey(t);
    }

    /**
     * 根据主键更新属性不为null的值
     */
    @Override
    public int updateByPrimaryKeySelective(T t) {
        return this.baseMapper.updateByPrimaryKeySelective(t);
    }


    /**
     * 根据主键@Id进行删除，多个Id以逗号,分割
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(String ids) {
        return this.baseMapper.deleteByIds(ids);
    }

    /**
     * 根据主键@Id进行查询，多个Id以逗号,分割
     * @param ids
     * @return
     */
    @Override
    public List<T> selectByIds(String ids) {
        return this.baseMapper.selectByIds(ids);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return this.baseMapper.existsWithPrimaryKey(o);
    }

    @Override
    public int deleteByCondition(Object o) {
        return this.baseMapper.deleteByCondition(o);
    }

    @Override
    public List<T> selectByCondition(Object o) {
        return this.baseMapper.selectByCondition(o);
    }

    @Override
    public int selectCountByCondition(Object o) {
        return this.baseMapper.selectCountByCondition(o);
    }

    @Override
    public int updateByCondition(T t, Object o) {
        return this.baseMapper.updateByCondition(t,o);
    }

    @Override
    public int updateByConditionSelective(T t, Object o) {
        return this.baseMapper.updateByConditionSelective(t,o);
    }

    @Override
    public int deleteByExample(Object o) {
        return this.baseMapper.deleteByExample(o);
    }

    @Override
    public List<T> selectByExample(Object o) {
        return this.baseMapper.selectByExample(o);
    }

    @Override
    public int selectCountByExample(Object o) {
        return this.baseMapper.selectCountByExample(o);
    }

    @Override
    public int updateByExample(T t, Object o) {
        return this.baseMapper.updateByExample(t,o);
    }

    @Override
    public int updateByExampleSelective(T t, Object o) {
        return this.baseMapper.updateByExampleSelective(t,o);
    }

    @Override
    public int insertList(List<T> list) {
        return this.baseMapper.insertList(list);
    }

    @Override
    public int insertUseGeneratedKeys(T t) {
        return this.baseMapper.insertUseGeneratedKeys(t);
    }
}
