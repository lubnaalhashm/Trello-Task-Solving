
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdvancedSchoolSystem {
    static Map<String, Map<Integer, Map<String, Object>>> schoolData = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of schools: ");
        int numOfSchools = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < numOfSchools) {
            System.out.print("School Name: ");
            String schoolName = sc.nextLine();
            System.out.print("School Address: ");
            String address = sc.nextLine();
            addSchool(schoolName, address);

            System.out.print("Enter the number of the students for " + schoolName + ": ");
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

                System.out.print("Enter number of subjects for Student " + studentId + ": ");
                int numOfSubjects = sc.nextInt();
                sc.nextLine();

                int k = 0;
                while (k < numOfSubjects) {
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
                    k++;
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

        float averageMarks = calculateAverage(schoolName, studentId);
        System.out.println("Average Marks for Student " + studentId + ": " + averageMarks);
    }

    private static void addSubjectAndMarks(String schoolName, int studentId, String subjectName, String teacherName, int creditHours, int marks, char subjectGrade) {
    }

    public static void addSchool(String schoolName, String address) {

        schoolData.put(schoolName, new HashMap<>());
        System.out.println("Added school: " + schoolName);
    }

    public static void addStudent(String schoolName, int studentId, String studentName, char grade, int age) {
        if (!schoolData.containsKey(schoolName)) {
            System.out.println("School not found.");
            return;
        }

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
        if (students == null || !students.containsKey(studentId)) {
            System.out.println("Data not found for the provided school or student.");
            return null;
        }

        Map<String, Object> studentInfo = students.get(studentId);
        Map<String, Map<String, Object>> subjects = (Map<String, Map<String, Object>>) studentInfo.get("subjects");
        return subjects.getOrDefault(subjectName, null);
    }

    public static float calculateAverage(String schoolName, int studentId) {
        Map<Integer, Map<String, Object>> students = schoolData.get(schoolName);

        if (students == null || !students.containsKey(studentId)) {
            System.out.println("Student with ID " + studentId + " in " + schoolName + " not exist");
            return 0;
        }

        Map<String, Object> studentInfo = students.get(studentId);
        Map<String, Map<String, Object>> subjects = (Map<String, Map<String, Object>>) studentInfo.get("subjects");

        int totalMarks = 0;
        int numOfSubjects = subjects.size();

        for (Map<String, Object> subjectDetails : subjects.values()) {
            totalMarks += (int) subjectDetails.get("marks");
        }

        if (numOfSubjects > 0) {
            return (float) totalMarks / numOfSubjects;
        } else {
            return 0;
        }
    }
}
