package Abstract;

public class Teacher extends Person {
    private String subject;
    private String school;
    private int age;
    private double checkIn;

    public Teacher() {
        super("Yousef");
        subject = "Math";
        school = "Abdullah Aljaber";
        age = 27;
        checkIn = 0;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getCheckIn(double checkIn) {
        this.checkIn = checkIn;
    }

    public double getCheckIn() {
        return checkIn;
    }

    public void describeRole() {
        System.out.println(super.getName() + " is a teacher that teaches " + subject + ".");
    }
}
