package com.codecool.interview_app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuestionAnswer {

    @Id
    long id;
    String question;
    @Lob
    String answer;


    public QuestionAnswer() {
    }

    public QuestionAnswer(long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
