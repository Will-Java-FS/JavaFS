package constructors;

public class Building {

    int area;
    int walls;

    //Constructor - a special method designated for initializing our objects.
    public Building() {
        area = 500;
        walls = 8;
        System.out.println("I will provide my own value for the area and walls.");
    }

    public Building(int area) {
        this.area = area;
        System.out.println("Making a new building with area: " + area);
        System.out.println(this);
    }

    //Creative way to potentially pass in an area OR a number of walls
    public Building(int value, boolean forWalls) {
        if(forWalls) {
            walls = value;
        } else {
            area = value;
        }
    }

    @Override
    public String toString() {
        return "Building{" +
                "area=" + area +
                ", walls=" + walls +
                '}';
    }
}