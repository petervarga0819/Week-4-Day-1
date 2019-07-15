package GreenFoxInheritance;

public class Person {

    String name = "Jane Doe";
    int age = 30;
    String gender = "female";
    public Person(){}
    public Person(String name, int age, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void introduce(){

        String toPrint = "Hi, I'm," + name+ "a" + age+ "year old" + gender;
        System.out.println(toPrint);
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }

}
