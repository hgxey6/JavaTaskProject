package ObjectOrientedProgrammingTask.Task6Student;

class Aspirant extends Student {
    private boolean scientificWork;

    //Конструктор для создания клона объекта
    Aspirant(Aspirant ob) {
        super(ob);
        scientificWork = ob.scientificWork;
    }

    //Конструктор
    public Aspirant(String firstName, String lastName, double averageMark, int group,
                    boolean scientificWork) {
        super(firstName, lastName, averageMark, group);
        this.scientificWork = scientificWork;
    }

    //Измененный метод суперкласса
    public int getScholarship() {
        return (getAverageMark() == 5) ? 200 : 180;
    }

    //Добавление доп. действии для метода
    public void info() {
    super.info(); // Наследуем метод суперкласса
    System.out.println("Scientific work: " + scientificWork); //
    }
}
