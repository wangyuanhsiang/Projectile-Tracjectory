/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectile.tracjectory;

import java.util.Scanner;

/**
 *
 * @author Shawn
 */
public class ProjectileTracjectory {

    /**
     * @param args the command line arguments
     */
    
    private  static final double Acceleration = -9.81;
    private static Scanner console = new Scanner(System.in);
    private static double velocity;
    private static double angle;
    private static int steps;
    private static double xVelocity;
    private static double yVelocity;
    private static double totalTime;
    private static double timeincrement;
    private static double xIncrement;
    
    
    public static void main(String[] args) {
       method_1();
       method_2();
       method_3();
       method_4();
        
        
    }
    
    public static void method_1(){
     System.out.println("this program computes the");
     System.out.println("tracjectory of a projectile given");
     System.out.println("angle relative to the horizontal");
        System.out.println();
    
    }
    
    public static void method_2(){
      System.out.println("velocity(meters/second)?");
      velocity = console.nextDouble();
      System.out.println("angle(degrees )?");
      angle = Math.toRadians(console.nextDouble());
      System.out.println("number of steps to dusplay?");
      steps = console.nextInt();
        System.out.println();
    }
    
    public static void method_3(){
       xVelocity = velocity * Math.cos(angle);
       yVelocity = velocity * Math.sin(angle);
       totalTime = -2.0 * yVelocity /  Acceleration;
       timeincrement = totalTime / steps;
       xIncrement = xVelocity * timeincrement;
    }
    
    public static void method_4(){
       double x = 0.0;
       double y = 0.0;
       double t = 0.0;
       System.out.println("step\tx\ty\ttime");
       System.out.println("0\t0.0\t0.0\t0.0");
       for(int i = 1; i <= steps; i++){ 
         t += timeincrement;
         x += xIncrement;
         y = yVelocity * t + 0.5 * Acceleration * t *t;
         System.out.println(i + "\t" + round2(x) + "\t" + round2(y) + "\t" + round2(t));
       
       }
    }
    
    public static double round2(double n){
    
      return Math.round( n * 100.0)/100.0;
    }
      
}
