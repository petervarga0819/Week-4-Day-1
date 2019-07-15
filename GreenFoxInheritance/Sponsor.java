package GreenFoxInheritance;

public class Sponsor extends Person {
    String company = "Google";
    int hiredStudents = 0;

    public Sponsor(){}
    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = this.company;
        this.hiredStudents = hiredStudents;
    }
    public void introduce() {
        String toPrint = "Hi, I'm"+ name+ "a" +age+ "year old"+ gender+ "who represents"+ company+ "and hired" +hiredStudents+ "students so far.";
        System.out.println(toPrint);
    }
    public void hire(){
        this.hiredStudents++;
    }
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }


}
