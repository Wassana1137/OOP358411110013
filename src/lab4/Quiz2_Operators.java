package lab4;

import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int x,y;
         System.out.print("Enter integer1:");
         x = sc.nextInt();
         System.out.print("Enter integer2:");
         y=sc.nextInt();
         //call methods
         System.out.println("sum ="+sumt (x,y));
         System.out.println("sub ="+subt (x,y));
         System.out.println("Mul ="+mult (x,y));
         System.out.println("Div ="+divt (x,y));
    }//main
        private static int divt (int x, int y){
            return x / y;
        }//divt
        private static int mult (int x, int y){
            return x * y;
        }//mult
        private static int subt  (int x, int y){
            return x - y;
        }//subt
        private static int sumt  (int x, int y){

        return x + y;
        }//divt



}//class
