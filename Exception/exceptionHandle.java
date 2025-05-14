import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exceptionHandle 
{
        public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try 
        {
            System.out.println("Please enter the first number...");
            int datal = Integer.parseInt(br.readLine());
            
            System.out.println("Please enter the first number...");
            int data2 = Integer.parseInt(br.readLine());

            //the try block to enclose the statements which can throw exceptions
            int result = datal / data2; //a number divided by 0 is illegal
            System.out.println("result = " + result);
        }
            catch(ArithmeticException arithEx) 
            {//catch the exception and handle it in correct way 
              System.out.println("Dividing by 0 is not allowed.");
              System.out.println("The exception is: "+ arithEx);

            }
            catch (NumberFormatException nfe)
            {
             System.out.println("NumberFormatException has taken place...");
             }
             catch (IOException ice) 
             {
              System.out.println("IOException has taken place...");
              }
             
            //   catch (Exception e) 
            //  {
            //   System.out.println("Exception has taken place...");
            //   }
             
              finally 
              { //the finally block always executes
              System.out.println("Operation performed...");      
            }
            System.out.println("Close..");      
            }
        }
    