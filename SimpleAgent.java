package examples.handson;

import java.util.Arrays;
import java.util.Scanner;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;

public class SimpleAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");

    addBehaviour(new CyclicBehaviour(this) {
      public void action() {
      } 
    });

    addBehaviour(new StepBehaviour());
  } 

  private class StepBehaviour extends Behaviour {
    private int step = 1;
    Scanner read = new Scanner(System.in);

    double [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
    double [] x = {23,26,30,34,43,48,52,57,58};

    SLR slr = new SLR(x);
    DataSet dataSet = new DataSet(x, y);
    Arithmetics arithmetics = new Arithmetics();

    public void action() {
      switch (step) {
          case 1:        
            break;
          case 2:
            //  arithmetics.calculateN(dataSet.getX());
            break;
          case 3:

          slr.setSumXSqr(arithmetics.sum(arithmetics.sqr(dataSet.getX())));
          System.out.println("x cuadrada " + slr.getSumXsqr());
            //  arithmetics.calculateSumXsqr(dataSet.getX());
            break;
          case 4:
          slr.setSumXY(arithmetics.sum(dataSet.getX(), dataSet.getY()));
          System.out.println("Sumatoria de x por Y: "+ slr.getSumXY());
              // arithmetics.calculateSumXY(dataSet.getX(), dataSet.getY());
            break;
          case 5:
          slr.setSumY(arithmetics.sum(dataSet.getY()));
          System.out.println("Sumatoria de Y: "+ slr.getSumY());
            //  arithmetics.calculateSumY(dataSet.getY());
            break;
          case 6:
          slr.setSumYSqr(arithmetics.sum(arithmetics.sqr(dataSet.getY())));
          System.out.println("Sumatoria cuadrada de Y: "+ slr.getSumYsqr());
              // arithmetics.calculateSumYsqr(dataSet.getY());
            break;
          case 7:
          slr.setAvrgX(arithmetics.avrg(dataSet.getX()));
          System.out.println("Promedio de X: "+ slr.getAvrgX());
          //  arithmetics.calculateAvrX(dataSet.getX());
          break;
          case 8:
          slr.setAvrgY(arithmetics.avrg(dataSet.getY()));
          System.out.println("Promedio de Y: "+ slr.getAvrgY());
              // arithmetics.calculateAvrY(dataSet.getY());      
            break;
          case 9:
              slr.calculateB();
              System.out.println("Beta 0: " + slr.getB());
            break;
          case 10:
              slr.calculateA();
              System.out.println("Beta 1: " + slr.getA());
          break;
          case 11:
              System.out.println("Teclea el numero que deseas predecir: ");
              int predecir = read.nextInt();
              System.out.println("El resultado es es: "+slr.predecir(predecir));
          break;
      }
      step++;
    } 

    public boolean done() {
      return step == 12;
    } 

    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }    // END of inner class StepBehaviour
}
