package com.codegym.furamaresortspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegym.furamaresortspring.entity.AttachService;

@Repository
public interface AttachServiceRepository extends JpaRepository<AttachService, Long> {

}
