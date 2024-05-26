package IOWork;

import java.util.Map;

public class Student {
    private String name;
    private Map<Subject, Integer> marks;

    public Student(String name, Map<Subject, Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public Map<Subject, Integer> getMarks() {
        return marks;
    }
}
