package com.fbugraaydin.multitenancy.repository;

import com.fbugraaydin.multitenancy.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends JpaRepository<Data,Long> {

}
