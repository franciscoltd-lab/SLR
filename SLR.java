package examples.handson;

public class SLR {
    
    public SLR(double [] data){
        this.n = data.length;
    }

    private int n;
    private double a; //ordered with the x-axis
    private double b; //slope of the line

    private double sumXsqr;
    private double sumYsqr;
    private double sumXY;
    private double sumY;

    private double avrgX;
    private double avrgY;
    // double error; //Standar Error

    //Getters
    public double getA(){
        return this.a;
    }

    public double getB(){
        return this.b;
    }

    public double getSumXsqr(){
        return this.sumXsqr;
    }

    public double getSumYsqr(){
        return this.sumYsqr;
    }

    public double getSumXY(){
        return this.sumXY;
    }

    public double getSumY(){
        return this.sumY;
    }

    public double getAvrgX(){
        return this.avrgX;
    }

    public double getAvrgY(){
        return this.avrgY;
    }

    // Setters

    public void setSumXSqr(double sumXsqr){
        this.sumXsqr = sumXsqr;
    }

    public void setSumYSqr(double sumYsqr){
        this.sumYsqr = sumYsqr;
    }

    public void setSumXY(double sumXY){
        this.sumXY = sumXY;
    }

    public void setSumY(double sumY){
        this.sumY = sumY;
    }

    public void setAvrgX(double avrgX){
        this.avrgX = avrgX;
    }

    public void setAvrgY(double avrgY){
        this.avrgY = avrgY;
    }
  

    //Methods

    public void calculateB(){

        System.out.println(this.sumXsqr);
        System.out.println(this.sumYsqr);
        System.out.println(this.sumY);
        System.out.println(this.sumXY);
        System.out.println(this.avrgX);
        System.out.println(this.avrgY);

        this.b = (this.sumXY - (this.n * this.avrgX * this.avrgY)) / (this.sumXsqr - this.n * (this.avrgX * this.avrgX));
    }

    public void calculateA(){
        this.a = this.avrgY - this.b * this.avrgX;
    }

    public double predecir(int numero){

        double predecir;

        predecir = this.a + this.b * numero;
        
        return predecir;
    }

    // public void calculateError(){
    //     this.error = Math.sqrt((this.sumYsqr - this.a * this.sumY - b * sumXY) / this.n - 2);
    // }
}
