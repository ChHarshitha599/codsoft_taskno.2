import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        float sum = 0.0f; // Change sum to float
        char grade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        String[] subjectName = new String[n];
        float[] marks = new float[n]; // Change marks to float

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of subject and marks scored out of 100: ");
            subjectName[i] = scanner.next();
            marks[i] = scanner.nextFloat(); // Change to nextFloat()
        }

        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        System.out.println("Total marks scored: " + sum);

        float maxMarks = n * 100.0f; // Change to float
        float percentage = (sum / maxMarks) * 100.0f; // Change to float
        System.out.println("Average percentage scored: " + percentage);

        if (percentage >= 90) {
            grade = 'O';
        } else if (percentage >= 80 && percentage < 90) {
            grade = 'A';
        } else if (percentage >= 70 && percentage < 80) {
            grade = 'B';
        } else if (percentage >= 60 && percentage < 70) {
            grade = 'C';
        } else if (percentage >= 50 && percentage < 60) {
            grade = 'D';
        } else if (percentage >= 40 && percentage < 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}
