package com.cashlink.pkg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cashlink.pkg.entity.Docter;

public interface DocterRepository extends JpaRepository<Docter, Integer> {

}
