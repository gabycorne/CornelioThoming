/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail;

/**
 *
 * @author mthoming
 */
public class QuestionScene extends Scene{
    private InterviewQuestion[] questions;

    public QuestionScene() {
    }
    
    public InterviewQuestion[] getQuestions() {
        return questions;
    }
    
    public void setQuestions(InterviewQuestion[] questions) {
        this.questions = questions;
    }
    
}
