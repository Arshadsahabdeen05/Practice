package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.Children;


@Repository
public interface ChildrenRepo extends JpaRepository<Children,Integer>{
}