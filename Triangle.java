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
public class Triangle implements Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double a = Math.sqrt((x1-x2)^2 + (y1-y2)^2);
    private double b = Math.sqrt((x2-x3)^2 + (y2-y3)^2);
    private double c = Math.sqrt((x1-x3)^2 + (y1-y3)^2);

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    
    
    public double calculateArea(){
        
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
     public double calculatePerimeter(){
         return a+b+c;
     }
}
