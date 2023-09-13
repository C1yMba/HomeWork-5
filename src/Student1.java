class Student1 extends Cylinder {
    private String name;
    private int course;

    public Student1(String name, int course, double radius, double height) {
        super(radius, height);
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }
}