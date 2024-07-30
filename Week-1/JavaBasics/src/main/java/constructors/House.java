package constructors;

public class House extends Building {

    int bedrooms;
    String color;


    public House() {
        super(); //This line of code is executed whether you specifically add it or not (AND FIRST!)
    }

    public House(int area) {
        super(area);
        System.out.println("More useful print outs!");
    }

    public House(int area, int bedrooms) {
        this(area);
//        this.area = area;
        this.bedrooms = bedrooms;
    }

    //Copy Constructor - taking all of the values from one house and using them to build a new House.
    public House(House old) {
        this(old.area, old.bedrooms);
        this.walls = old.walls;
        this.color = old.color;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", walls=" + walls +
                ", bedrooms=" + bedrooms +
                ", color='" + color + '\'' +
                '}';
    }
}