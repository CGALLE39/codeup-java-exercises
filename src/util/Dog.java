package util;

public class Dog extends Pet {

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(boolean isRescue, String name, int age, String breed) {
        super();
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.isRescue = isRescue;

    }

    public static void main(String[] args) {
        Dog nico = new Dog(true, "Nico", 6, "German Shepard");
    }

}
