public class swapping_single_inheritance extends swapping_numbers{
    public static void main(String[] args) {
        swapping_single_inheritance obj = new swapping_single_inheritance();
        obj.swap();
    }
    public void swap(){
        int num1, num2;
        System.out.println("Enter two numbers to be swapped: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        swapping_with_var(num1, num2);
        swapping_without_var(num1, num2);
    }
}
