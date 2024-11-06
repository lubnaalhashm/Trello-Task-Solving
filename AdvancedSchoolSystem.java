import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvancedSchoolSystem {
    static Map<String, Map<Integer, Map<String, Object>>> schoolData = new HashMap<>();

    public static void main(String[] args) {

        //* taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the schools: ");
        int numOfSchools = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < numOfSchools) {
            System.out.print("School Name: ");
            String schoolName = sc.nextLine();
            System.out.print("School Address: ");
            String schoolAddress = sc.nextLine();
            addSchool(schoolName, schoolAddress);

            System.out.print("Enter the number of the students " + schoolName);
            int numOfStudents = sc.nextInt();
            sc.nextLine();

            int j = 0;
            while (j < numOfStudents) {
                System.out.print("Student ID: ");
                int studentId = sc.nextInt();
                sc.nextLine();
                System.out.print("Student Name: ");
                String studentName = sc.nextLine();
                System.out.print("Grade: ");
                char grade = sc.next().charAt(0);
                System.out.print("Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                addStudent(schoolName, studentId, studentName, grade, age);

                System.out.print("Enter number of subjects " + studentId);
                int numOfSubjects = sc.nextInt();
                sc.nextLine();

                int S = 0;
                while (S < numOfSubjects) {
                    System.out.print("Subject Name: ");
                    String subjectName = sc.nextLine();
                    System.out.print("Teacher Name: ");
                    String teacherName = sc.nextLine();
                    System.out.print("Credit Hours: ");
                    int creditHours = sc.nextInt();
                    System.out.print("Marks: ");
                    int marks = sc.nextInt();
                    System.out.print("Grade: ");
                    char subjectGrade = sc.next().charAt(0);
                    sc.nextLine();
                    addSubjectAndMarks(schoolName, studentId, subjectName, teacherName, creditHours, marks, subjectGrade);
                    S++;
                }
                j++;
            }
            i++;
        }

        System.out.print("Enter School Name: ");
        String schoolName = sc.nextLine();
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Subject Name: ");
        String subjectName = sc.nextLine();

        Map<String, Object> marksDetails = getMarks(schoolName, studentId, subjectName);
        System.out.println("Marks Detail: " + marksDetails);

        double averageMarks = calculateAverage(schoolName, studentId);
        System.out.println("Average Marks for Student " + studentId + ": " + averageMarks);
    }

    public static void addSubjectAndMarks(String schoolName, int studentId, String subjectName, String teacherName, int creditHours, int marks, char subjectGrade) {
    }

    //* Method for adding schools to system
    public static void addSchool(String schoolName, String address) {

        schoolData.put(schoolName, new HashMap<>());
        System.out.println("Added school: " + schoolName);
    }

    //* Method for adding students to a specific school
    public static void addStudent(String schoolName, int studentId, String studentName, char grade, int age) {
        //* Checking if the school is there or not
        if (!schoolData.containsKey(schoolName)) {
            System.out.println("School not found.");
            return;
        }

        //* Creating a hashmap for student
        Map<Integer, Map<String, Object>> students = schoolData.get(schoolName);
        Map<String, Object> studentInfo = new HashMap<>();
        studentInfo.put("name", studentName);
        studentInfo.put("grade", grade);
        studentInfo.put("age", age);
        studentInfo.put("subjects", new HashMap<String, Map<String, Object>>());
        students.put(studentId, studentInfo);
        System.out.println("Added student " + studentName + " to school " + schoolName);
    }

    public static void addSubjectAndMarks(String schoolName, int studentId, String subjectName, String teacherName, int creditHours, int marks, char grade, String comments) {
        if (!schoolData.containsKey(schoolName)) {
            System.out.println("School not found.");
            return;
        }

        Map<Integer, Map<String, Object>> students = schoolData.get(schoolName);
        if (!students.containsKey(studentId)) {
            System.out.println("Student not found.");
            return;
        }

        Map<String, Object> studentInfo = students.get(studentId);
        Map<String, Map<String, Object>> subjects = (Map<String, Map<String, Object>>) studentInfo.get("subjects");
        Map<String, Object> subjectInfo = new HashMap<>();
        subjectInfo.put("teacher", teacherName);
        subjectInfo.put("creditHours", creditHours);
        subjectInfo.put("marks", marks);
        subjectInfo.put("grade", grade);
        subjectInfo.put("comments", comments);
        subjects.put(subjectName, subjectInfo);
        System.out.println("Added subject " + subjectName + " for student " + studentId);
    }

    public static Map<String, Object> getMarks(String schoolName, int studentId, String subjectName) {
        Map<Integer, Map<String, Object>> students = schoolData.get(schoolName);
        if (students == null) {
            System.out.println("Data not found.");
            return null;
        }

        Map<String, Object> studentInfo = students.get(studentId);
        Map<String, Map<String, Object>> subjects = (Map<String, Map<String, Object>>) studentInfo.get("subjects");
        return subjects.getOrDefault(subjectName, null);
    }
    //* Method for calculating the average
    public static double calculateAverage(String schoolName, double studentId) {
        Map<Integer, Map<String, Object>> students = schoolData.get(schoolName);

        if (students == null) {
            System.out.println("Student with iD " + studentId + " in " + schoolName + " not exist");
            return 0;
        }

        Map<String, Object> studentInfo = students.get(studentId);
        Map<String, Map<String, Object>> subjects = (Map<String, Map<String, Object>>) studentInfo.get("subjects");

        int marks = 0;
        int subjectNum = subjects.size();

        for (Map<String, Object> subjectInfo : subjects.values()) {
            marks += (int) subjectInfo.get("marks");
        }

        if (subjectNum > 0) {
            return (int) marks / subjectNum;
        } else {
            return 0;
        }
    }
}
