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
public class Circle implements Shape{
    private int radius;
    
    public Circle(int radius) {
        this.radius = radius;
    }
    
    public double calculateArea(){
       return Math.PI*radius*radius;
   }
    public double calculatePerimeter(){
      return 2*Math.PI*radius;
   }
}
