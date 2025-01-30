package org.map;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    private int questionId;
    private String question;

    @OneToOne
    @JoinColumn(name = "Answer_Id")
    private Answer ans;

    public Question() {

    }

    public Question(int questionId, String question, Answer ans) {
        this.questionId = questionId;
        this.question = question;
        this.ans = ans;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAns() {
        return ans;
    }

    public void setAns(Answer ans) {
        this.ans = ans;
    }
}

