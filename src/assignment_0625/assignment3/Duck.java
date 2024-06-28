package assignment_0625.assignment3;

public class Duck {
    private String name;
    private int legs = 4;
    private String length = "90cm";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println("오리(" + this.name + ")는 날지 않습니다.");
    }

    public void sing() {
        System.out.println("오리(" + this.name + ")가 소리내어 웁니다.");
    }

    public String toString() {
        return "오리의 이름은 " + this.name + " 입니다.";
    }
}
