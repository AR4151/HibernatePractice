package org.map;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    private int answerId;
    private String answer;
    @OneToOne(mappedBy = "ans")
    @JoinColumn(name = "Question_Id")
    private Question que;

    public Answer() {
    }

    public Answer(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQue() {
        return que;
    }

    public void setQue(Question que) {
        this.que = que;
    }
}
