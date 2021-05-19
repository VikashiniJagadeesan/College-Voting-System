/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpage;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author user
 */
public class Mainpage {

    int seconds=0;
    
    
    Timer time=new Timer();
    TimerTask task=new TimerTask(){
    public void run(){
    seconds++;
    System.out.println("seconds"+seconds);
    
    }
    };
    
    public void start(){
    time.scheduleAtFixedRate(task,1000,1000);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Mainpage m=new Mainpage();
        m.start();
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
