
package sheet1_2;

public class SecondOrderEquation {
    private int a;
    private int b;
    private int c;
    
    public SecondOrderEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double substitute(int x){
        return a*x*x+b*x+c;                
    }
    public SecondOrderEquation derivative(){
       return new SecondOrderEquation(2*this.a,this.b,0);
    }
    public ComplexNumber[] solve(){
       ComplexNumber [] cn = new ComplexNumber[2];
       double discriminant = b*b - 4*a*c;
       if(discriminant > 0){
           cn[0].setReal((-b + Math.sqrt(discriminant)) / (2*a));
           cn[0].setImaginary(0);
           cn[1].setReal((-b - Math.sqrt(discriminant)) / (2*a));
           cn[1].setImaginary(0);
           return cn;
       }
       else if(discriminant == 0){
           cn[0].setReal((-b + Math.sqrt(discriminant)) / (2*a));
           cn[0].setImaginary(0);
           cn[1].setReal((-b + Math.sqrt(discriminant)) / (2*a));
           cn[1].setImaginary(0);
           return cn;
       }
       else {
           cn[0].setReal(-b/(2*a));
           cn[0].setImaginary(Math.sqrt(-discriminant)/(2*a));
           cn[1].setReal(-b/(2*a));
           cn[1].setImaginary(-(Math.sqrt(-discriminant)/(2*a)));
           return cn;
       }
    }
    
}
