
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
         history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
        
    }
    public void clear(){
        this.history.clear();
        
    }
    public double maxValue(){
       if(history.isEmpty()){
           return 0.0;
       }else {
           return Collections.max(history);
       }
    }
    public double minValue(){
        if(history.isEmpty()){
            return 0.0;
        }else{
            return Collections.min(history);
        }
    }
    public double average(){
         double average =0.0;
         
         if(history.isEmpty()){
             average = 0.0;
         }else{
             double sum = 0.0;
             for (double value :history){
                 sum+=value;
             }
             average = sum / history.size();
             
         }
         return average;
    }
    @Override
    public String toString(){
        return this.history.toString();
    }
    
}
