package com.jis.platform.enrol.mapper;

import com.jis.platform.enrol.entity.EnrolProduct;

public interface EnrolProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnrolProduct record);

    int insertSelective(EnrolProduct record);

    EnrolProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnrolProduct record);

    int updateByPrimaryKey(EnrolProduct record);
}