Student Name: Nandini

Email: nandinikothapalli2@gmail.com

Team Number: 7

GitHub Username: NandiniKothapalli

Assigned Requirement Number: 5 

Project Title: Student Marks and Grade Report

UNDERSTANDING OF THE REQUIREMENT

In this program, I have to evaluate the marks of a student in five subjects. I need to calculate the total marks, average, percentage, number of passed and failed subjects, overall result, grade, next-level eligibility, and display a final message based on the student's performance.

HARD-CODED VALUES SELECTED

I have hard-coded the student name as Nandini. I used two different sets of subject marks to test the program. For the FAIL case, I selected the marks 90, 66, 82, 32, and 71, where one subject mark is below the passing mark of 35. For the PASS case, I selected the marks 90, 66, 82, 80, and 71, where all five subject marks are above the passing mark.

VARIABLES AND DATA TYPES PLANNED

I used String to store the student name, result, grade, and eligibility. I used int to store the subject marks, total marks, pass count, fail count, and loop counter. I used double to store the average and percentage.

OUTPUTS EXPECTED

The program should display the student name, total marks, average, percentage, passed subject count, failed subject count, overall result, grade, next-level eligibility, and a final message.

ARITHMETIC OPERATORS PLANNED

I used + to calculate the total marks, / to calculate the average, and * and / to calculate the percentage.

ASSIGNMENT OPERATORS PLANNED

I used = to assign values to variables and += to add each subject mark to the total marks.

RELATIONAL OPERATORS PLANNED

I used >= to check the passing marks and grade conditions, <= to control the loop, and == to identify the subject marks inside the loop.

LOGICAL OPERATORS PLANNED

I planned to use && if I need to combine more than one condition while checking validations.

UNARY OPERATORS PLANNED

I used ++ to increase the loop counter and to count the passed and failed subjects.

TERNARY OPERATOR USAGE

I used the ternary operator to display whether the student is Eligible or Not Eligible for the next level.

CONDITIONS REQUIRED

I used conditions to check whether each subject is passed or failed, whether the student has failed in any subject, and to decide the grade based on the percentage.

LOOP SELECTED

I selected the while loop.

REASON FOR SELECTING THE LOOP

I selected the while loop because I wanted to process all five subject marks using the same logic without writing the same code repeatedly.

VALIDATION RULES

The subject marks should be between 0 and 100. The passing mark for each subject is 35. If a student scores 35 or above in all five subjects, the overall result is PASS. If any one subject mark is below 35, the overall result is FAIL. The percentage is calculated out of 500 marks, and the grade is assigned according to the given grading rules.

TEST VALUE SETS PLANNED

I tested the program with different hard-coded marks. One test case contains all passing marks to verify the PASS result, and another test case contains one failing mark to verify the FAIL result, grade, and eligibility.