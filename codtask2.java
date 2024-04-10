import java.util.Scanner;

public class codtask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ...........Student Grade Calculator!............");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totmarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in each subject " + i + ": ");
            int marks = scanner.nextInt();
            totmarks += marks;
        }

        double averagePercentage = (double) totmarks / numSubjects;
        char grade;
        switch ((int) (averagePercentage / 10)) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            case 5:
                grade = 'E';
                break;
            default:
                grade = 'F';
        }

        System.out.println("\nResults is:");
        System.out.println("Total Marks: " + totmarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
