package assignment_0625_class.assignment2;

public class Employee {
    private String name;
    private int age;
    private String dept;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void print() {
        System.out.println("이\t\t름 : " + this.name + "\t\t나\t\t이 : " + this.age + "\t\t부\t\t서 : " + this.dept);
    }
}
