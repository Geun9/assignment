package assignment_0625_class.assignment2;

public class Teacher {
    private String name;
    private int age;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print() {
        System.out.println("이\t\t름 : " + this.name + "\t\t나\t\t이 : " + this.age + "\t\t담당과목 : " + this.subject);
    }
}
