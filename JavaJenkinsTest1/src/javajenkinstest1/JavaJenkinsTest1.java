/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajenkinstest1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author USER
 */
public class JavaJenkinsTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        nameTimes();
    }
    
    public static void nameTimes() throws InterruptedException{
        Scanner read = new Scanner(System.in).useDelimiter("\n"); 
        String name = read.next();
        
        for (int i = 0; i < 15; i++)
        {
            int sleepNum =(int) (Math.random()*5+1);
            System.out.println("Hello, I am "+ name+ " and I am printing the number "+(i+1));
            System.out.println("segundos: "+sleepNum);
            TimeUnit.SECONDS.sleep(sleepNum);
        }
    }
    
}
