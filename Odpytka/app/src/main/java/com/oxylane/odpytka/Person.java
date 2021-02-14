package com.oxylane.odpytka;

public class Person {
    private String name,lastAnswerDate,userIdKey;
    private Float percentOfAnswers;
    private Integer doneQuestions;



    //constructor

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String userIdKey) {
        this.name = name;
        this.userIdKey = userIdKey;

    }

    public Person(Float percentOfAnswers, Integer doneQuestions, String lastAnswerDate) {
        this.percentOfAnswers = percentOfAnswers;
        this.doneQuestions = doneQuestions;
        this.lastAnswerDate = lastAnswerDate;
    }

    public Person(String name, Float percentOfAnswers, Integer doneQuestions, String lastAnswerDate) {
        this.name = name;
        this.percentOfAnswers = percentOfAnswers;
        this.doneQuestions = doneQuestions;
        this.lastAnswerDate = lastAnswerDate;
    }


    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getLastAnswerDate() {
        return lastAnswerDate;
    }

    public void setLastAnswerDate(String lastAnswerDate) {
        this.lastAnswerDate = lastAnswerDate;
    }

    public String getUserIdKey() {
        return userIdKey;
    }

    public void setUserIdKey(String userIdKey) {
        this.userIdKey = userIdKey;
    }
}
