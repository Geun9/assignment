package assignment_0625_class.assignment2;

public class Student {
    private String name;
    private int age;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void print() {
        System.out.println("이\t\t름 : " + this.name + "\t\t나\t\t이 : " + this.age + "\t\t학\t\t번 : " + this.id);
    }
}
