package com.oxylane.odpytka.activities;

public class model {
    private String name,lastAnswerDate;
    private Float percentOfAnswers;
    private Integer doneQuestions;
    public model(){}

    public model(String name, String lastAnswerDate, Float percentOfAnswers, Integer doneQuestions) {

        this.name = name;
        this.lastAnswerDate = lastAnswerDate;
        this.percentOfAnswers = percentOfAnswers;
        this.doneQuestions = doneQuestions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastAnswerDate() {
        return lastAnswerDate;
    }

    public void setLastAnswerDate(String lastAnswerDate) {
        this.lastAnswerDate = lastAnswerDate;
    }

    public Float getPercentOfAnswers() {
        return percentOfAnswers;
    }

    public void setPercentOfAnswers(Float percentOfAnswers) {
        this.percentOfAnswers = percentOfAnswers;
    }

    public Integer getDoneQuestions() {
        return doneQuestions;
    }

    public void setDoneQuestions(Integer doneQuestions) {
        this.doneQuestions = doneQuestions;
    }





}
