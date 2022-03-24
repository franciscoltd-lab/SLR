package examples.handson;

import javax.xml.crypto.Data;

public class DataSet {
    private double [] x;
    private double [] y;

    public DataSet(double [] x, double [] y){
        this.x = x;
        this.y = y;
    }

    //Setters

    //Getters
    public double [] getX(){
        return this.x;
    }

    public double [] getY(){
        return this.y;
    }

}
