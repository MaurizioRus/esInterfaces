class Professor extends Person implements TeachingPerson {
    private String teachingSubject;

    public Professor(String name, String surname, int id, String subject) {
        super(name, surname, id);
        this.teachingSubject = subject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Professor " + getName() + " is teaching " + teachingSubject);
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }
}
