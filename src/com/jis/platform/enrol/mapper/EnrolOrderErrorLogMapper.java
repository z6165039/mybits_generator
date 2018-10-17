package com.jis.platform.enrol.mapper;

import com.jis.platform.enrol.entity.EnrolOrderErrorLog;

public interface EnrolOrderErrorLogMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(EnrolOrderErrorLog record);

    int insertSelective(EnrolOrderErrorLog record);

    EnrolOrderErrorLog selectByPrimaryKey(String orderNo);

    int updateByPrimaryKeySelective(EnrolOrderErrorLog record);

    int updateByPrimaryKey(EnrolOrderErrorLog record);
}