package util;

public class Pet {

    public int age;

   public boolean isRescue;

   public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
        this.age = age;
    }

    public Pet(boolean isRescue) {
        this.isRescue = isRescue;
    }

    public Pet(String name) {
        this.name = name;
    }
}
