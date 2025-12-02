
package studentinfosystem;

public class Student implements Display {

    String name;
    String studentId;
    String gender;
    int age;
    String contactNumber;
    String email;
    int yearLevel;
    String course;

    Student(String name, String studentId, String gender, int age, String contactNumber,
            String email, int yearLevel, String course) {
        this.name = name;
        this.studentId = studentId;
        this.gender = gender;
        this.age = age;
        this.contactNumber = contactNumber;
        this.email = email;
        this.yearLevel = yearLevel;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getCourse() {
        return course;
    }

    public void updateInfo(String newCourse, int newYearLevel) {
        this.course = newCourse;
        this.yearLevel = newYearLevel;
    }

    public String getInfo() {
        return "ID: " + studentId + ", Gender: " + gender + ", Age: " + age
                + ", Contact: " + contactNumber + ", Email: " + email
                + ", Year Level: " + yearLevel + ", Course: " + course;
    }

    @Override
    public void Display() {
        System.out.println(getInfo());

    }

}

