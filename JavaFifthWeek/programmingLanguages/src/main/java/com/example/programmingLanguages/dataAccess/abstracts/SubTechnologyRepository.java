package com.example.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.programmingLanguages.entity.concretes.SubTechnology;
@Repository
public interface SubTechnologyRepository extends JpaRepository<SubTechnology,Integer> {

}
