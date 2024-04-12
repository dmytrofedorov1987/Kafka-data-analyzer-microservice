package com.example.dataanalyzermicroservice.repository;

import com.example.dataanalyzermicroservice.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
