public class Single_inheritance extends Arithmetic_operation{
    public static void main(String[] args) {
        Single_inheritance obj = new Single_inheritance();
        obj.accept();
    }
    public void accept(){
        int num1, num2;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        add(num1, num2);
        mul(num1, num2);
    }
}