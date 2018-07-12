package com.codecool.interview_app.controller;

import com.codecool.interview_app.model.QuestionAnswer;
import com.codecool.interview_app.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@Controller
public class IndexController {

    @Autowired
    QuestionAnswerService questionAnswerService;

    Random random = new Random();

    @GetMapping(value = "/")
    public String index() {
        return "homepage";
    }

    @GetMapping(value = "/random")
    public String getRandom(Model model) {
        List<QuestionAnswer> allQuestionAnswer = questionAnswerService.getAllQuestionAnswer();
        int randomNumber = random.nextInt(allQuestionAnswer.size());
        model.addAttribute("questionAnswer", allQuestionAnswer.get(randomNumber));
        return "randomqa";
    }
}
