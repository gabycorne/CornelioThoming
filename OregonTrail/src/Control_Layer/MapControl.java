/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control_Layer;

import Control_Layer.GameControl.SceneType;
import oregontrail.InterviewQuestion;
import oregontrail.QuestionScene;
import oregontrail.Scene;

/**
 *
 * @author mthoming
 */
public class MapControl {
    
    public static InterviewQuestion[] createQuestions(){
        System.out.println("******createQuestions[] called*****");
        
        int noOfQuestions = 5;
        InterviewQuestion[] questions = new InterviewQuestion[noOfQuestions];
        
        InterviewQuestion buySupplies = new InterviewQuestion();
        buySupplies.setDescription("Do you want to buy supplies?");
        buySupplies.setQuestionType("yes or no");
        questions[QuestionType.buySupplies.ordinal()] = buySupplies;
        
        InterviewQuestion whenToStart = new InterviewQuestion();
        whenToStart.setDescription("When do you want to start your journey?");
        whenToStart.setQuestionType("multiple choice");
        questions[QuestionType.whenToStart.ordinal()] = whenToStart; 
        
        InterviewQuestion travelerIsSick = new InterviewQuestion();
        travelerIsSick.setDescription("A member of your party is ill. How do you want to proceed?");
        travelerIsSick.setQuestionType("multiple choice");
        questions[QuestionType.travelerIsSick.ordinal()] = travelerIsSick; 
        
        InterviewQuestion riverCrossing = new InterviewQuestion();
        riverCrossing.setDescription("Do you want to cross the river?");
        riverCrossing.setQuestionType("multiple choice");
        questions[QuestionType.riverCrossing.ordinal()] = riverCrossing; 
        
        InterviewQuestion whichRoute = new InterviewQuestion();
        whichRoute.setDescription("There is a fork in the trail. Which direction do you want to go?");
        whichRoute.setQuestionType("multiple choice");
        questions[QuestionType.whichRoute.ordinal()] = whichRoute;                   
        
        return questions;
    }
    
    public static void assignQuestionsToScenes(InterviewQuestion[] questions, Scene[] scenes){
        System.out.println("******assignQuestionsToScenes[] called*****");
//    MT started building in lesson 10 and then removed since it doesn't really fit within the concept of our game    
//        int noOfQuestions = 5;
//        QuestionScene questionScene = (QuestionScene) scenes[SceneType.question_Scene.ordinal()];
//         
//        questionsInScene[0] = questions[QuestionType.buySupplies.ordinal()];
//        questionsInScene[1] = questions[QuestionType.whenToStart.ordinal()];
//        questionsInScene[2] = questions[QuestionType.travelerIsSick.ordinal()];
//        questionsInScene[3] = questions[QuestionType.riverCrossing.ordinal()];
//        questionsInScene[4] = questions[QuestionType.whichRoute.ordinal()];            
//         
//        QuestionScene resourceScene = (QuestionScene) scenes[SceneType.resource_Scene.ordinal()];
//        
//        questionsInScene[0] = questions[QuestionType.buySupplies.ordinal()];
//        questionsInScene[1] = questions[QuestionType.whenToStart.ordinal()];
//        questionsInScene[2] = questions[QuestionType.travelerIsSick.ordinal()];
//        questionsInScene[3] = questions[QuestionType.riverCrossing.ordinal()];
//        questionsInScene[4] = questions[QuestionType.whichRoute.ordinal()];
    }  
    
    
    public static double calcWagonVolume(double width, double height, double depth) {
                
        if (width < 1 || height < 1 || depth < 1) {
          return -1;
        }
    
        if (width > 12 || width < 6) {
            return -1;
        }

        if (depth > 18 || depth < 6) {
            return -1;
        }
        double wagonVolume = width * height * depth;
            return wagonVolume;
    }    
    
}
