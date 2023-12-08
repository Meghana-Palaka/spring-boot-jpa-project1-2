package com.edubridge.app2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app2.model.Flower;
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
