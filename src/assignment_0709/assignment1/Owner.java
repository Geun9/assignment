package assignment_0709.assignment1;

import java.util.Objects;

public class Owner {

    private String name;
    private String cellPhone;

    public Owner() {

    }

    public Owner(String name, String cellPhone) {
        this.name = name;
        this.cellPhone = cellPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Owner owner = (Owner) o;
        return Objects.equals(name, owner.name);
    }

    @Override
    public String toString() {
        return "이름은 " + this.name + "이고, " + "핸드폰 번호는 " + this.cellPhone + "입니다";
    }
}
