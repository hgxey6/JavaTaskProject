package ObjectOrientedProgrammingTask.com.company.details;

public class Engine {
    private final int power;
    private final String company;

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public int getPower() {
        return power;
    }

    public String getCompany() {
        return company;
    }
}
