package exercise.alexwoo;

public class Person {
    private String name;
    private boolean isMan;
    private String dateOfBirth;
    private String adress;

    public Person() {
    }

    public Person(String name, boolean isMan, String dateOfBirth, String adress) {
        this.name = name;
        this.isMan = isMan;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String gender() {
        if (isMan)
            return "Man";
        else
            return "Women";
    }

    public String toString() {
        return  " Họ Tên: " + getName()
                + " Ngày Sinh: " + getDateOfBirth()
                + " Giới Tính: " + gender()
                + " Địa chỉ hiện tại: " + getAdress();
    }
}

