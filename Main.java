public class Main {
    public static void main(String[] args) {

        Student student = new Student("Maurizio", "Covelli", 1721, 2);
        Professor professor = new Professor("Jonh", "Bonh", 201, "Computer science");
        Assistant assistant = new Assistant("Michele", "Accio", 45, false);

        System.out.println("Student Details:");
        student.goToCollege();
        student.studyAtHome();

        System.out.println("\nProfessor Details:");
        professor.goToCollege();
        professor.teachToOtherPeople();

        System.out.println("\nAssistant Details:");
        assistant.goToCollege();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
