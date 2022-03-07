/**
 * 
 */
package test.logics;

/**
 * @author husenaiah
 *
 */

public class ClassForName 
{
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
    {
          
            Class clasz = Class.forName("test.logics.Test");
            Object obj = clasz.newInstance();
            // clasz.ge
      
    }
}