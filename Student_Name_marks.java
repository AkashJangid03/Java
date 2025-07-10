package OOPs;
import java.util.Scanner;

public class Student_Name_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int num = sc.nextInt();

        int[] rollno = new int[num];
        int[][] marks = new int[num][5];
        char[] grades = new char[num];
        float[] percentage = new float[num];
        String[] address = new String[num];


        for (int i=0; i< num; i++){
            System.out.print("Enter the rollno: ");
            rollno[i] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the address: ");
            address[i] = sc.nextLine();

            int total_marks = 0;
            for (int j=0; j<5; j++){
                System.out.println("Enter the marks for 5 subjects: "+ (j+1));
                marks[i][j] = sc.nextInt();
                total_marks = total_marks + marks[i][j];
            }
            sc.nextLine();

            percentage[i] = total_marks / 5.0f;
            grades[i] = calgrades(percentage[i]);
        }

        System.out.println("Student Details: ");
        for(int i=0; i<num; i++){
            System.out.print("\nStudent " + (i+1));
            System.out.println("Roll no: " + rollno[i]);
            System.out.println("Address: " + address[i]);
            System.out.println("Marks: ");
            for(int j=0; j<5; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("\nPercentage: "+ percentage[i] + "%");
            System.out.println("Grade: " + grades[i]);
        }
        sc.close();
    }
    public static char calgrades(float percentage) {
        if (percentage >= 80){
           return 'A';
        } else if (percentage >= 60){
            return 'B';
        } else if (percentage >= 40){
            return 'C';
        } else {
            return 'D';
        }
    }
}
