class Person {
    private String name;
    private String surname;
    private int collegeId;

    public Person(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public void goToCollege() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("ID: " + collegeId);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getCollegeId() {
        return collegeId;
    }
}
