package com.pentagono.pentagono.repository;

import com.pentagono.pentagono.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface IEmployeeRepository extends IGenericRepository<Employee, Long>{

    @Query(value="SELECT * FROM employee where enterprise_idEnterprise= ?1", nativeQuery=true)
    public abstract ArrayList<Employee> findByEnterprise(Long id);


}
