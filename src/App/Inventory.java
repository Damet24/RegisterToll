/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.ArrayList;

/**
 *
 * @author CBN
 */
public class Inventory {
    private ArrayList<Vehicle> inventory;
    
    public Inventory(){
        inventory = new ArrayList();
    }
    
    public void addItem(Vehicle item){
        inventory.add(item);
    }
    
    public ArrayList<Vehicle> getList(){
        return inventory;
    }
}
