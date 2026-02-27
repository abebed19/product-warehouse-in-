/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
import java.util.Scanner;

public class PlusOperation extends Operation {
    
    public PlusOperation(){
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner) {
          System.out.print("First number:");
          int first = Integer.valueOf(scanner.nextLine());
          System.out.println("Second number: ");
          int second = Integer.valueOf(scanner.nextLine());
          System.out.println("The sum of the numbers is "+ (first + second));
    }
    
}
