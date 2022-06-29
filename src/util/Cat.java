package util;

public class Cat extends Pet {

    private String color;


    public Cat(int age) {
        super();
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color, int age, boolean isRescue) {
        super(name);
        this.name = name;
        this.age = age;
        this.color = color;
        this.isRescue = isRescue;
    }

    public static void main(String[] args) {
    Cat nyla = new Cat("Nyla", "calico", 10, true);
}

}
