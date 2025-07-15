package Inheritance;
import java.util.Scanner;
public class Arithmetic_operation {
    Scanner sc = new Scanner(System.in);

    public void add(int num1, int num2){
        int res = num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" = "+res);
    }
    public void sub(int num1, int num2){
        int res = num1-num2;
        System.out.println("The sub of "+num1+" and "+num2+" = "+res);
    }
    public void mul(int num1, int num2){
        int res = num1*num2;
        System.out.println("The mul of "+num1+" and "+num2+" = "+res);
    }
    public void div(int num1, int num2){
        int res = num1/num2;
        System.out.println("The div of "+num1+" and "+num2+" = "+res);
    }
}
