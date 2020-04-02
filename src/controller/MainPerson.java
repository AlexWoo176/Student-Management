package controller;

import exercise.alexwoo.PersonTest;

public class MainPerson {
    public static void main(String[] args) {
        PersonTest personTest = new PersonTest();
        System.out.println("Thông tin học viên: ");
        personTest.inputData("Hoang Nam", true,"14/01/2013", "Ha Noi");
        personTest.inputData("Phuong Nguyen", false,"06/05/1986", "Ha Noi");
        personTest.displayPerson();
    }
}
