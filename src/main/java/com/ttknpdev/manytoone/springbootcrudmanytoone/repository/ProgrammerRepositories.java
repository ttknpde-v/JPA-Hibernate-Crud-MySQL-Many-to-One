package com.ttknpdev.manytoone.springbootcrudmanytoone.repository;

import com.ttknpdev.manytoone.springbootcrudmanytoone.entity.Programmer;
import org.springframework.data.repository.CrudRepository;

public interface ProgrammerRepositories extends CrudRepository<Programmer , Long> { }
