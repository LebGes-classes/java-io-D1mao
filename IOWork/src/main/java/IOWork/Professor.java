package IOWork;

public class Professor {
    private String name;
    private Subject subject;

    public Professor(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public Subject getSubject() {
        return subject;
    }

}
