package controller;

import exercise.alexwoo.StudentManagement;

public class MainStudent {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent();
        studentManagement.displayStudentList();
//        studentManagement.deleteElement(1);
//        studentManagement.findScholarship();
//        studentManagement.getFemaleList();
//        studentManagement.searchByID(1);
//        studentManagement.editStudent(1);
    }
}
