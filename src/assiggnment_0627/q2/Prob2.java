package assiggnment_0627.q2;

public class Prob2 {

    public static void main(String[] args) {
        Student student1 = new Student("홍길동", "javaprogram", 1000000);

        student1.calcReturnFee(student1);
        student1.print();
    }
}
