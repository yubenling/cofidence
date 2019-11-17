package com.cloud.confidence.confidenceorder.dao;

import com.cloud.confidence.confidenceorder.entity.TLogger;
import java.util.List;

public interface TLoggerMapper {
    int insert(TLogger record);

    List<TLogger> selectAll();
}