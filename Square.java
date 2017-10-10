/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet1_3;

/**
 *
 * @author Lenovo
 */
public class Square extends Rectangle {

    public int getWidth() {
       return super.getWidth();
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public int getHeight() {
        return super.getHeight();
    }

    public void setHeight(int height) {
        super.setHeight(height);
    }
    
    public Square(int width) {
        super(width, width);
    }
    
   
}