/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.time.*;
/**
 *
 * @author pratheeba
 */

 class LesserThanException extends RuntimeException
{
    public LesserThanException ()
    {
        System.out.println("Lesser value");
    }
}
class GreaterThanException extends RuntimeException
{
    public GreaterThanException ()
    {
        System.out.println("Greater value");
    }
}
public class Integr {
  
              
              
    public static void main(String aargs[])
    {
        Integer i=new Integer("10");
         Integer j=new Integer("10");    

         int e = Integer.compare(i, j);
           try{   if(e>0)
               {
                throw new LesserThanException();
               }
              else if(e<0)
              {
                  throw new GreaterThanException();
              }
              else
              {
                  System.out.println("equal");
              }
           }catch(LesserThanException e2) 
           {
               System.out.println("lesser");
           }
           catch(GreaterThanException e1) 
           {
               System.out.println("Greater");
           }
     finally
           {
               System.out.println("Finished_Problem_3!");
           }
         
    
}
}
