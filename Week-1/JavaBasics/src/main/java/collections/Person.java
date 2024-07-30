package collections;

import java.util.Comparator;

public class Person implements Comparable<Person> {

    private String name;
    private int height;
    private int age;

    public static HeightComparator hc = new HeightComparator();

    public static Comparator<Person> nameComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    };

    public Person() {
    }

    public Person(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        // person1.compareTo(person2)
        // Sort By Age
        // if(this.age < p.age) {
        // return -1;
        // } else if(this.age > p.age) {
        // return 1;
        // } else {
        // return 0;
        // }

        return this.age - p.age;

    }
}