/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaron
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    
    public ProductWarehouseWithHistory(String productName, double capacity,double initialBalance){
        super(productName,capacity);
        this.history = new ChangeHistory();
        super.addToWarehouse(initialBalance);
        this.history.add(this.getBalance());
      
        
    }
    public String history(){
        return history.toString();
    }
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);              // do the normal add
        this.history.add(this.getBalance()); // record new balance
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);  // do the normal take
        this.history.add(this.getBalance());       // record new balance
        return taken;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + String.format("%.1f", this.history.average()));
    }
       
}
