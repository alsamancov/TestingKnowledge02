package com.spdukraine.mvc.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private int id;

    @Column(name = "text_question")
    private String textQuestion;

    @Column(name = "level")
    private int level;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="question")
    private List<Answer> hisAnswers = new ArrayList<Answer>();

    public Question() {
    }

    public Question(String textQuestion, int level, List<Answer> hisAnswers) {
        this.textQuestion = textQuestion;
        this.level = level;
        this.hisAnswers = hisAnswers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Answer> getHisAnswers() {
        return hisAnswers;
    }

    public void setHisAnswers(List<Answer> hisAnswers) {
        this.hisAnswers = hisAnswers;
    }
}
