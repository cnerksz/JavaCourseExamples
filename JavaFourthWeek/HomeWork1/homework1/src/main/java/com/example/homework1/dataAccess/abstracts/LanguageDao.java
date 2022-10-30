package com.example.homework1.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.homework1.entities.concretes.Language;

@Repository
public interface LanguageDao {
List<Language> getAll();
Language add(Language language);
void delete(int id);
void update(Language language,int id);
Language getById(int id);
}
