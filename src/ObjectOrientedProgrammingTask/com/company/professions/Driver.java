package ObjectOrientedProgrammingTask.com.company.professions;

public class Driver extends Person {

    private int experience; //Стаж с годами растет

    public Driver (String fullName, int age, int experience) {
        super(fullName, age); //наследует из Person
        this.experience = experience;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }


}
