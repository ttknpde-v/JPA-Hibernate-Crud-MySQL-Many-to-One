package com.ttknpdev.manytoone.springbootcrudmanytoone.service;

import java.util.List;
import java.util.Map;

public interface ProgrammerService <T> {
    T createProgrammer(T obj);
    List<T> readsProgrammer();
    T readProgrammer(Long id);
    Map<?,?> update(Long id, T obj);
    Map<?,?> delete(Long id);
}
