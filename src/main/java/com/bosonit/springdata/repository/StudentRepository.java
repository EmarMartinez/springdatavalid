package com.bosonit.springdata.repository;

import com.bosonit.springdata.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>,
        PagingAndSortingRepository<Student, Integer> {
}
