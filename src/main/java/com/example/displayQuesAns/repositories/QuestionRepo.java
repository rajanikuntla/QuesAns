package com.example.displayQuesAns.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.displayQuesAns.model.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
