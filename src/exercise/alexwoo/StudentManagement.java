package exercise.alexwoo;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static final int DEFAULT_SIZE = 30;
    ArrayList<Student> studentArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Nhập Id Sinh Viên: ");
        int idStudent = scanner.nextInt();
        System.out.println("Nhập Tên Sinh Viên: ");
        String name = scanner.next();
        System.out.println("Giới Tính: Nam=True><Nu=False: ");
        boolean isMan = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Date of birthday: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Địa chỉ hiện tại: ");
        String adress = scanner.nextLine();
        System.out.println("Grade Point Average(Điểm trung bình cuối kỳ): ");
        double GPA = scanner.nextDouble();
        System.out.println("Nhập Email cá nhân: ");
        String email = scanner.next();
        Student student = new Student(idStudent, name, isMan, dateOfBirth, adress, GPA, email);
        studentArrayList.add(student);
    }

    public void displayStudentList() {
        for (int i = 0; i <studentArrayList.size() ; i++) {
            Student student = (Student) studentArrayList.get(i);
            student.display();
        }
    }

    public void deleteElement(int idStudent) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getIdStudent() == idStudent) {
                studentArrayList.remove(i);
            }
            else {
                System.out.println("Không có sinh viên trong danh sách!");
            }
        }
    }

    public void editStudent(int index) {
        for (int i = 0; i < studentArrayList.size() ; i++) {
            Student student = (Student) studentArrayList.get(i);

            if (student.getIdStudent() == index) {
                System.out.println("Edit Student ID: " + student.getIdStudent() + " Information: ");
                System.out.println("Nhập Tên Sinh Viên: ");
                String name = scanner.nextLine();
                System.out.println("Date of birthday: ");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Địa chỉ hiện tại");
                String adress = scanner.nextLine();
                System.out.println("Grade Point Average(Điểm trung bình cuối kỳ): ");
                double GPA = scanner.nextDouble();
                System.out.println("Nhập Email cá nhân: ");
                String email = scanner.nextLine();
                student.editStudent(name, dateOfBirth, adress, GPA, email);
            }
        }
    }

    public void searchByID(int idStudent) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = (Student) studentArrayList.get(i);
            if (student.getIdStudent() == idStudent) {
                student.display();
            }
        }
    }

    public void searchByName(String name) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = (Student) studentArrayList.get(i);
            if (student.getName() == name) {
                student.display();
            }
        }
    }

    public void findScholarship() {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = (Student) studentArrayList.get(i);
            if (student.isScholarship())
                student.display();
            else
                System.out.println("Không có Sinh Viên đạt yêu cầu!");
        }
    }

    public void getFemaleList() {
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = (Student) studentArrayList.get(i);
            if (student.isMan() == false)
                student.display();
            else
                System.out.println("Không có sinh viên nữ đâu nhé!");
        }
    }
}
