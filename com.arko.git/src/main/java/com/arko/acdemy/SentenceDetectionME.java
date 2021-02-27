package com.arko.acdemy;

import java.io.FileInputStream; 
import java.io.InputStream;  

import opennlp.tools.sentdetect.SentenceDetectorME; 
import opennlp.tools.sentdetect.SentenceModel;  

public class SentenceDetectionME { 
  
   public static void main(String args[]) throws Exception { 
   
      String sentence = "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@id='app']/div/div[2]/form/div[3]/div[2]/button[contains(text(),'Send Password Reset Link')] (tried for 5 second(s) with 500 MILLISECONDS interval)"; 
       
      //Loading sentence detector model 
      InputStream inputStream = new FileInputStream("D:/Study Material/jars/en-sent.bin"); 
      SentenceModel model = new SentenceModel(inputStream); 
       
      //Instantiating the SentenceDetectorME class 
      SentenceDetectorME detector = new SentenceDetectorME(model);  
    
      //Detecting the sentence
      String sentences[] = detector.sentDetect(sentence); 
    
      //Printing the sentences 
      for(String sent : sentences)        
         System.out.println(sent);  
   } 
}