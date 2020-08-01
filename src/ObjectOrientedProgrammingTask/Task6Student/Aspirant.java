package ObjectOrientedProgrammingTask.Task6Student;

class Aspirant extends Student {
    private boolean scientificWork;

    public int getScholarship(double averageMark) {
        return (averageMark <= 5) ? 180 : 200;
    }
}
