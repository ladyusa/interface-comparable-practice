package practice;

public class Animal implements Comparable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public void makeNoise() {
        System.out.println(name + " is making noise ");
    }

    @Override
    public String toString() {
        return "[Animal] " + name + " is " + age + " years old.";
    }

    @Override
    public int compareTo(Object other) {
        Animal otherAnimal = (Animal) other;
        return this.age - otherAnimal.age;
    }
}
