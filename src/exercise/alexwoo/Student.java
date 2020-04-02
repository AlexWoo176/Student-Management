package exercise.alexwoo;

public class Student extends Person {
    private int idStudent;
    private double GPA;
//    Grade Point Average = GPA
    private String email;

    public Student() {
    }

    public Student(int idStudent, double GPA, String email) {
        this.idStudent = idStudent;
        this.GPA = GPA;
        this.email = email;
    }

    public Student(int idStudent, String name, boolean isMan, String dateOfBirth, String adress, double GPA, String email) {
        super(name, isMan, dateOfBirth, adress);
        this.idStudent = idStudent;
        this.GPA = GPA;
        this.email = email;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isScholarship() {
        if (this.GPA >= 8)
            return true;
        else
            return false;
    }

    public String checkScholarship() {
        if (isScholarship())
            return "Bạn đủ điểm nhận học bổng!";
        else
            return "Cố gắng lên nhé bạn!";
    }

    public void editStudent(String name, String dateOfBirth, String adress, double GPA, String email) {
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setAdress(adress);
        this.GPA = GPA;
        this.email = email;
    }

    public void display() {
        System.out.println("id Sinh Viên: " + idStudent
                + " Họ Tên: " + getName()
                + " Ngày Sinh: " + getDateOfBirth()
                + " Giới Tính: " + gender()
                + " Điểm Trung Bình: " + GPA
                + " Email cá nhân: " + email
                + " Địa chỉ hiện tại: " + getAdress());
    }
}
