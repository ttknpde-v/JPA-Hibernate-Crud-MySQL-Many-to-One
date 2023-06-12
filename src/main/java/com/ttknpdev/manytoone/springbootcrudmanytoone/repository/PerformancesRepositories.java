package com.ttknpdev.manytoone.springbootcrudmanytoone.repository;

import com.ttknpdev.manytoone.springbootcrudmanytoone.entity.Performance;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PerformancesRepositories extends CrudRepository<Performance,String> {
    /* create native query */
    @Query(value = "select * from performances where project_pgm_id = :id ; " , nativeQuery = true) // we always use native query , only return result set
    List<Performance> readsPerformanceByIdProgrammer(@Param("id") Long id);
    @Transactional
    Integer deleteByProgrammer_PgmId(@Param("id") Long id); // Hibernate: delete from performances where project_name=?

    /* JPA Native Query Update */
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update performances set project_name = :name , project_charge = :charge , member_amount =:amount where project_name = :defaultName ;" , nativeQuery = true)
    Integer updatePerformanceByPrimaryKey(@Param("name") String name , @Param("charge") Double charge ,@Param("amount") Short amount , @Param("defaultName") String defaultName );

}
