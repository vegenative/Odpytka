package com.oxylane.odpytka;

public class Person {
    private String name;
    private Float percentOfAnswers;
    private Integer numberOfQuestions;
    private String lastAnswerDate;


    //constructor

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(Float percentOfAnswers, Integer numberOfQuestions, String lastAnswerDate) {
        this.percentOfAnswers = percentOfAnswers;
        this.numberOfQuestions = numberOfQuestions;
        this.lastAnswerDate = lastAnswerDate;
    }

    public Person(String name, Float percentOfAnswers, Integer numberOfQuestions, String lastAnswerDate) {
        this.name = name;
        this.percentOfAnswers = percentOfAnswers;
        this.numberOfQuestions = numberOfQuestions;
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

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getLastAnswerDate() {
        return lastAnswerDate;
    }

    public void setLastAnswerDate(String lastAnswerDate) {
        this.lastAnswerDate = lastAnswerDate;
    }
}
