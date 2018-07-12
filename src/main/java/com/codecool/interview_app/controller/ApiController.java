package com.codecool.interview_app.controller;

import com.codecool.interview_app.model.QuestionAnswer;
import com.codecool.interview_app.service.QuestionAnswerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    QuestionAnswerService questionAnswerService;

    public ApiController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }

    @PostMapping(value = "/add")
    public HttpStatus addQuestionAnswer(@ModelAttribute QuestionAnswer questionAnswer) {
        questionAnswerService.add(questionAnswer);
        return HttpStatus.OK;
    }

    @GetMapping(value = "/getall")
    public List<QuestionAnswer> getAllQuestionAnswer() {
        return questionAnswerService.getAllQuestionAnswer();
    }
}
