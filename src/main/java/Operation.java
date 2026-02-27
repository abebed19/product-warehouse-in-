
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public abstract class Operation {
    private String name;
    
    public Operation(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    public abstract void execute(Scanner scanner);
    
    
}
