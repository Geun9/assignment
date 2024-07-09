package assignment_0709.assignment1;

import java.util.Objects;

public class Vehicle {
    private Owner owner;
    private int price;

    public Vehicle() {

    }

    public Vehicle(Owner owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(owner, vehicle.owner);
    }

    @Override
    public String toString() {
        return "소유주정보 : 이름은 " + this.owner.getName() + "이고, " +
            "핸드폰 번호는 " + this.owner.getCellPhone() + "입니다.\n" +
            "차량정보 : 가격은 " + this.price + "입니다.";
    }
}
