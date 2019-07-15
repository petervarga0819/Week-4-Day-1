package GreenFoxInheritance;

public class Student extends Person {

    public String previousOrganization = "TheSchoolOfLife";
    public int skippedDays = 0;
    public Student(){}
    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
    public void introduce() {
        String toPrint = ("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " +
                previousOrganization + " who skipped " + skippedDays + " days from the course already.");
        System.out.println(toPrint);
    }
    public void skippedDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
}

