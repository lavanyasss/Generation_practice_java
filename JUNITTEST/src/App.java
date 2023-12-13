import static org.junit.Assert.assertEquals;

import java.beans.Transient;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("calculator test");
    }
        public static int Add(int a,int b){
            return (a+b);
        }
        public static int sub(int a,int b){
            return (a-b);
        }
         public static int multiply(int a,int b){
            return (a*b);
        }
         public static int divide(int a,int b){
            return (a/b);
         }
        @Test
        public void TestAdd(){
            
    
            assertEquals("ok", 100, Add(50, 50));
    
        }
         @Test
        public void TestSub(){
            
           assertEquals("ok", 20, sub(70, 50));
        }
        @Test
        public void Testmultiply(){
            
    
            assertEquals("ok", 150, multiply(3, 50));

       }
        @Test
        public void Testdivide(){
            
    
            assertEquals("ok", 10, divide(500, 50));

       } 
    }


