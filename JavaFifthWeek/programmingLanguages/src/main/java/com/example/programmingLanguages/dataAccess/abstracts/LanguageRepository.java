package com.example.programmingLanguages.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.programmingLanguages.entity.concretes.ProgrammingLanguage;

public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {

}
