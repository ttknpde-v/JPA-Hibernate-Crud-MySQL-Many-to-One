package com.ttknpdev.manytoone.springbootcrudmanytoone.service;

import java.util.List;
import java.util.Map;

public interface PerformanceService <T>{
    T createPerformanceByPrimaryKeyProgrammer(Long id , T obj);
    List<T> readsPerformanceByIdProgrammer(Long id);
    T readPrimaryKeyPerformance(String projectName);
    Map<?,?> deletePerformanceAllByIdProgrammer(Long id);
    Map<?,?> updatePerformanceByPrimaryKey(String projectName,T obj);

}
