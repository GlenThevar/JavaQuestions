package experiment2;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Grade Calculation (Task 1)");
            System.out.println("2. Print 'Hello' n times (Task 2)");
            System.out.println("3. Multiplication Table (Task 3)");
            System.out.println("4. Factorial (Task 4)");
            System.out.println("5. Series Sum (Task 5)");
            System.out.println("6. Salary & Tax Calculation (Task 6 & 9)");
            System.out.println("7. Store marks of 10 students (Task 7)");
            System.out.println("8. Sum and Average of Marks (Task 8)");
            System.out.println("9. Max Marks in 3 Subjects for 5 Students (Task 9)");
            System.out.println("10. Print Hello up to 5 times (Task 10)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    int[] marks = new int[5];
                    int total = 0;
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Enter marks for subject " + (i + 1) + ": ");
                        marks[i] = sc.nextInt();
                        total += marks[i];
                    }
                    double avg = total / 5.0;
                    System.out.println("Average: " + avg);
                    if (avg >= 80)
                        System.out.println("Grade: A");
                    else if (avg >= 73)
                        System.out.println("Grade: B+");
                    else if (avg >= 65)
                        System.out.println("Grade: B");
                    else if (avg >= 55)
                        System.out.println("Grade: C");
                    else
                        System.out.println("Grade: F");
                    break;

                case 2: 
                    System.out.print("Enter n: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Hello");
                    }
                    break;

                case 3: 
                    System.out.print("Enter number: ");
                    int num = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(num + " x " + i + " = " + (num * i));
                    }
                    break;

                case 4: 
                    System.out.print("Enter a number: ");
                    int f = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= f; i++) {
                        fact *= i;
                    }
                    System.out.println("Factorial: " + fact);
                    break;

                case 5: 
                    System.out.print("Enter n: ");
                    int sn = sc.nextInt();
                    double sum1 = 0;
                    int sum2 = 0;
                    for (int i = 1; i <= sn; i++) {
                        sum1 += 1.0 / i;
                        sum2 += i * i;
                    }
                    System.out.println("Sum1 = " + sum1);
                    System.out.println("Sum2 = " + sum2);
                    break;

                case 6: 
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Basic Salary: ");
                    double basic = sc.nextDouble();
                    System.out.print("Enter Allowance: ");
                    double allowance = sc.nextDouble();
                    double gross = basic + allowance;
                    double tax;

                    if (gross <= 5000)
                        tax = 0;
                    else if (gross <= 10000)
                        tax = gross * 0.10;
                    else if (gross <= 20000)
                        tax = gross * 0.20;
                    else
                        tax = gross * 0.30;

                    double net = gross - tax;
                    System.out.println("Gross: " + gross);
                    System.out.println("Tax: " + tax);
                    System.out.println("Net Pay: " + net);
                    break;

                case 7: 
                    int[] studentMarks = new int[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Enter marks for student " + (i + 1) + ": ");
                        studentMarks[i] = sc.nextInt();
                    }
                    System.out.println("Marks stored successfully.");
                    break;

                case 8: 
                    int[] marks10 = new int[10];
                    int totalMarks = 0;
                    System.out.println("Enter marks for 10 students:");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        marks10[i] = sc.nextInt();
                        totalMarks += marks10[i];
                    }
                    System.out.println("Sum: " + totalMarks);
                    System.out.println("Average: " + (totalMarks / 10.0));
                    break;

                case 9: 
                    int[][] matrix = new int[5][3];
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Enter marks for Student " + (i + 1) + ":");
                        for (int j = 0; j < 3; j++) {
                            System.out.print("Subject " + (j + 1) + ": ");
                            matrix[i][j] = sc.nextInt();
                        }
                    }
                    for (int i = 0; i < 5; i++) {
                        int max = matrix[i][0];
                        for (int j = 1; j < 3; j++) {
                            if (matrix[i][j] > max)
                                max = matrix[i][j];
                        }
                        System.out.println("Max marks for student " + (i + 1) + ": " + max);
                    }
                    break;

                case 10: 
                    System.out.print("Enter n: ");
                    int times = sc.nextInt();
                    for (int i = 0; i < Math.min(times, 5); i++) {
                        System.out.println("Hello");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
