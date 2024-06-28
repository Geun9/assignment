package assignment_0627.assignment2;

public class Student {
    private String name;
    private String subject;
    private int fee;
    private double returnFee;

    public Student() {}

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public void calcReturnFee() {
        if (this.subject.equals("javaprogram")) {
            this.returnFee = fee * 0.25;
        } else if (this.subject.equals("jspprogram")) {
            this.returnFee = fee * 0.2;
        } else {
            System.out.println("그런 과정명은 없습니다.");
        }
    }

    public void print() {
        System.out.println(this.name + " 씨의 과정명은 " + this.subject + "이고 교육비는 " + this.fee + " 이며 환급금은 " + this.returnFee + " 입니다.");
    }
}
