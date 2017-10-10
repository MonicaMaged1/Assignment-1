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
public class Rectangle implements Shape {
   private int width;
   private int height;
   
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
   
   public double calculateArea(){
       return width * height;
   }
   
   public double calculatePerimeter(){
       return 2*(width+height);
   }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
   
}
