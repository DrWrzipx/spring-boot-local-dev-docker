package com.trantorinc.springbootlocaldevdocker;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
    
}
