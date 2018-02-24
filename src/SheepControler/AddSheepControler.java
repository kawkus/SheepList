/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheepControler;

import SheepListView.AddSheep;
import SheepModel.Sheep;


/**
 *
 * @author Użytkownik
 */
public class AddSheepControler {
   private AddSheep AddSheepView;
   

    public AddSheepControler(AddSheep add) {
        this.AddSheepView = add;
    }
    public void addSheepToArrayList ()
    {
        //String Id = AddSheepView.getjTextField1().getText();
        Sheep sh = new Sheep(AddSheepView.getjTextField1().getText());
       boolean add;
       add = Sheep.getListSheep().add(sh);
        
    }
   
    /**
     * @return the add
     */
    public AddSheep getAdd() {
        return AddSheepView;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(AddSheep add) {
        this.AddSheepView = add;
    }

 
   
    
}
