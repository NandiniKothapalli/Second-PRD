
public class Main {

    public static void main(String arg[]) {
        String name = "Nandini";
        int Subject1marks = 90;
        int Subject2marks = 66;
        int Subject3marks = 82;
        int Subject4marks = 80;
        int Subject5marks = 71;

        int TotalMarks = 0;
        double average;
        double percentage;
        int passed_subjectcount = 0;
        int failed_subjectcount = 0;
        int count = 1;
        int marks = 0;
        while (count <= 5) {
            if (count == 1) {
                marks = Subject1marks;
            } else if (count == 2) {
                marks = Subject2marks;
            } else if (count == 3) {
                marks = Subject3marks;
            } else if (count == 4) {
                marks = Subject4marks;
            } else {
                marks = Subject5marks;
            }
            TotalMarks += marks;
            if (marks >= 35) {
                passed_subjectcount++;
            } else {
                failed_subjectcount++;
            }

            count++;
        }
        average = (double) TotalMarks / 5;
        percentage = (double) TotalMarks / 500 * 100;
        String result;
        if (failed_subjectcount == 0) {
            result = "PASS";
        } else {
            result = "FAIL";
        }
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Needs Improvement";
        }
        String eligibility = (result.equals("PASS")) ? "Eligible" : "Not Eligible";
        System.out.println("STUDENT MARKS REPORT");
        System.out.println();
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + TotalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println();
        System.out.println("Passed Subjects: " + passed_subjectcount);
        System.out.println("Failed Subjects: " + failed_subjectcount);
        System.out.println();
        System.out.println("Overall Result: " + result);
        System.out.println("Grade: " + grade);
        System.out.println("Next-Level Eligibility: " + eligibility);
        if (result.equals("PASS")) {
            System.out.println("Final Message: Congratulations! You have passed.");
        } else {
            System.out.println("Final Message: Better luck next time.");
        }
    }
}
