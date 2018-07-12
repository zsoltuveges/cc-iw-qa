package com.codecool.interview_app.controller;

import com.codecool.interview_app.model.QuestionAnswer;
import com.codecool.interview_app.service.QuestionAnswerService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class ApiController {

    QuestionAnswerService questionAnswerService;

    public ApiController(QuestionAnswerService questionAnswerService) {
        this.questionAnswerService = questionAnswerService;
    }

    @PostMapping(value = "/add")
    public HttpStatus addQuestionAnswer(@RequestBody QuestionAnswer questionAnswer) {
        questionAnswerService.add(questionAnswer);
        return HttpStatus.OK;
    }

    @GetMapping(value = "/getall")
    public List<QuestionAnswer> getAllQuestionAnswer() {
        return questionAnswerService.getAllQuestionAnswer();
    }
}
