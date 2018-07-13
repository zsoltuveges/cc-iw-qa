package com.codecool.interview_app.controller;

import com.codecool.interview_app.model.QuestionAnswer;
import com.codecool.interview_app.service.QuestionAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

@Controller
public class IndexController {

    @Autowired
    QuestionAnswerService questionAnswerService;

    Random random = new Random();

//    @GetMapping(value = "/")
//    public String index() {
//        return "homepage";
//    }

    @GetMapping(value = "/")
    public String getRandom(Model model) {
        List<QuestionAnswer> allQuestionAnswer = questionAnswerService.getAllQuestionAnswer();
        int questionNumber = 1 + random.nextInt(allQuestionAnswer.size());
        model.addAttribute("questionAnswer", allQuestionAnswer.get(questionNumber - 1));
        return "questionanswer";
    }

    @GetMapping(value = "/{id}")
    public String getById(@PathVariable("id") String id, Model model) {
        QuestionAnswer result;
        try {
            result = questionAnswerService.getQuestionAnswerById(id);
            model.addAttribute("questionAnswer", result);
            return "questionanswer";
        } catch (NoSuchElementException e) {
            return "404";
        }
    }
}
