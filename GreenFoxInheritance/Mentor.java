package GreenFoxInheritance;

public class Mentor extends Person{
    public Mentor(){}
    public String level ="senior";
    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = this.level;

    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {

        String toPrint= ("Hi, I'm" + name +"a" + age + "year old" + gender + level + "mentor.");
        System.out.println(toPrint);
    }
}
