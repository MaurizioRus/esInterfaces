class Assistant extends Person implements LearningPerson, TeachingPerson {
    private boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int id, boolean willBeAPhD) {
        super(name, surname, id);
        this.isGoingToBeAPhD = willBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.println("Assistant " + getName() + " is studying at home.");
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("Assistant " + getName() + " is teaching.");
    }

}
