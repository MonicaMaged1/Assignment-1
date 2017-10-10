package sheet1_2;
 public class ComplexNumber
{
    private double real;
    private double imaginary;
    public ComplexNumber(double real,double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public ComplexNumber()
    {
        real=0;
        imaginary=0;
    }
    public void print()
    {
        System.out.println(real+"+"+imaginary+"i");
    }
    public double getReal()
    {
        return real;
    }
    public double getImaginary()
    {
        return imaginary;
    }
    public double magnitude()
    {
        return Math.sqrt((real*real)+(imaginary*imaginary));
    }
    
    public ComplexNumber add(ComplexNumber z)
    {
        ComplexNumber h=new ComplexNumber(this.real+z.getReal(),this.imaginary+z.getImaginary());
        return h;
    }
    public ComplexNumber conjugate()
    {
        ComplexNumber y=new ComplexNumber(this.real,this.imaginary*-1);
         return y;
    }

    public ComplexNumber sub(ComplexNumber z)
    {
        ComplexNumber h=new ComplexNumber(this.real-z.getReal(),this.imaginary-z.getImaginary());
        return h;
    }
    public ComplexNumber multi(ComplexNumber z)
    {
        double NewReal=(this.real*z.getReal())+(this.imaginary*-1*z.getImaginary());
        double NewImaginary=(this.real*z.getImaginary())+(this.imaginary*z.getReal());
        ComplexNumber h=new ComplexNumber(NewReal,NewImaginary);
        return h;
    }
    public double angle(){
        return Math.atan2(imaginary, real);
    }
}
