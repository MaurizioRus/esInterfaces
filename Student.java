
class Student extends Person implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int id, int year) {
        super(name, surname, id);
        this.academicYear = year;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Student " + getName() + " is studying at home.");
    }

    public int getAcademicYear() {
        return academicYear;
    }
}
