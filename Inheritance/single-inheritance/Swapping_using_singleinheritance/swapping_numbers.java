import java.util.Scanner;

public class swapping_numbers {
    Scanner sc = new Scanner(System.in);

    public void swapping_with_var(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping with 3rd variable: num1 = "+num1+" ,num2 = "+num2);
    }
    public void swapping_without_var(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping without 3rd variable: num1 = "+num1+" ,num2 = "+num2);
    }
}
