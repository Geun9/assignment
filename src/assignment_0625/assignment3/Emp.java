package assignment_0625.assignment3;

public class Emp {
    private String id;
    private String name;
    private int baseSalry;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalry() {
        return baseSalry;
    }

    public void setBaseSalry(int baseSalry) {
        this.baseSalry = baseSalry;
    }

    public double getSalary(double bonus) {
        return this.baseSalry + this.baseSalry * bonus;
    }

    public String toString() {
        return this.name + "(" + this.id + ")" + "사원의 기본급은 " + this.baseSalry + "원 입니다.";
    }
}
