import java.util.Scanner;
public class function_demo {
    public static void main(String[] args) {
        function_demo obj = new function_demo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int b = sc.nextInt();
        obj.arith_demo(a, b);

        obj.swapping(a,b);
        obj.reverse(a);
        obj.palindrom(a);
    }
    public void arith_demo(int a, int b){
        System.out.println("\nArithmetic program");
        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
    }
    public void swapping(int a, int b){
        System.out.println("\nSwapping process");
        int temp = a;
        a=b;
        b=temp;
        System.out.println(a+","+b);
    }
    public void reverse(int a){
        System.out.println("\nReverse processs");
        int reversed = 0;
        while (a!=0){
            int num = a %10;
            reversed = reversed * 10 + num;
            a = a/10;
        }
        System.out.println("Reserved of 1st number: " + reversed);
    }
    public void palindrom(int a){
        System.out.println("\nThe process of palindrom");
        int original = a;
        int reversed = 0;
        while (a!=0){
            int num = a%10;
            reversed = reversed*10+num;
            a = a/10;
        }
        if (original==reversed){
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }

    }
}
