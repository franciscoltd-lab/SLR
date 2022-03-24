package examples.handson;

import java.util.Arrays;

public class Arithmetics {

    // Methods
    public double sum(double [] data){
        
        double summation = 0;
        
        for(int i=0;i<data.length;i++){
            summation += data[i];
        }

        return summation;
    }

    public double sum(double[] x, double [] y){
        
        double summation = 0;

        for(int i=0;i<x.length;i++){
            summation += (x[i] * y[i]);
        }

        return summation;
    }

    public double [] sqr(double [] data){

        double [] otroArreglo = Arrays.copyOf(data, data.length);;

        for(int i=0;i<otroArreglo.length;i++){
            otroArreglo[i] = Math.pow(otroArreglo[i], 2);
        }

        return otroArreglo;
    }

    public double avrg(double [] data){
        double summation = 0;

        for(int i=0;i<data.length;i++){
            summation += data[i];
        }

        return summation / data.length;
    }



//     private int n; //Number of data

//     private double sumY; //Summation of Y
//     private double sumXY; //Summation of XY
//     private double sumXsqr; //Summation of x^2
//     private double sumYsqr; //Summation of y^2
    
//     private double avrgX; //Average of X
//     private double avrgY; //Average of Y

//     //Getters

//     public int getN(){
//         return this.n;
//     }

//     public double getSumY(){
//         return this.sumY;
//     }

//     public double getSumXY(){
//         return this.sumXY;
//     }

//     public double getSumXsqr(){
//         return this.sumXsqr;
//     }

//     public double getSumYsqr(){
//         return this.sumYsqr;
//     }

//     public double getAvrgX(){
//         return this.avrgX;
//     }

//     public double getAvrgY(){
//         return this.avrgY;
//     }

//     //Setters

//     //Methods

//     public void calculateN(double [] x){
//         this.n = x.length;
//     }

//     public void calculateAvrX(double [] x){
//         for(int i=0;i<this.n;i++){
//             this.avrgX += x[i];
//         }
//         this.avrgX /= this.n;
//     }

//     public void calculateAvrY(double [] y){
//         for(int i=0;i<this.n;i++){
//             this.avrgY += y[i];
//         }
//         this.avrgY /= this.n;
//     }

//     public void calculateSumYsqr(double [] y){
//         for(int i=0;i<this.n;i++){
//             this.sumYsqr += Math.pow(y[i],2);
//         }
//     }

//     public void calculateSumY(double [] y){
//         for(int i=0;i<this.n;i++){
//             this.sumY += y[i];
//         }
//     }

//     public void calculateSumXsqr(double [] x){
//         for(int i=0;i<this.n;i++){
//             this.sumXsqr += Math.pow(x[i],2);
//         }
//     }

//     public void calculateSumXY(double [] x, double [] y){
//         for(int i=0;i<this.n;i++){
//             this.sumXY += x[i] * y[i];
//         }
//     }

}
