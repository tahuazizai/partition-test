package com.ssm.group.service.base;

import com.github.pagehelper.PageInfo;
import com.ssm.group.common.model.GridQo;
import com.ssm.group.dao.base.BaseMapper;

public interface BaseService<T> extends BaseMapper<T> {
    PageInfo<T> selectGridData(GridQo var1);
}
