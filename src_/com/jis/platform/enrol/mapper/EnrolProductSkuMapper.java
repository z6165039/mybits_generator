package com.jis.platform.enrol.mapper;

import com.jis.platform.enrol.entity.EnrolProductSku;

public interface EnrolProductSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EnrolProductSku record);

    int insertSelective(EnrolProductSku record);

    EnrolProductSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EnrolProductSku record);

    int updateByPrimaryKey(EnrolProductSku record);
}