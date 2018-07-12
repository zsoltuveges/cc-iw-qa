package com.codecool.interview_app.service;

import com.codecool.interview_app.model.QuestionAnswer;
import com.codecool.interview_app.repository.QuestionAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionAnswerService {

    private QuestionAnswerRepository questionAnswerRepository;

    @Autowired
    public QuestionAnswerService(QuestionAnswerRepository questionAnswerRepository) {
        this.questionAnswerRepository = questionAnswerRepository;
    }

    public void add(QuestionAnswer questionAnswer) {
        questionAnswerRepository.save(questionAnswer);
    }

    public List<QuestionAnswer> getAllQuestionAnswer() {
        return questionAnswerRepository.findAll();
    }

    public QuestionAnswer getQuestionAnswerById(long id) {
        return questionAnswerRepository.findById(id).get();
    }

}

