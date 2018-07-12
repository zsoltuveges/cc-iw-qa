package com.codecool.interview_app.repository;

import com.codecool.interview_app.model.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {
}
