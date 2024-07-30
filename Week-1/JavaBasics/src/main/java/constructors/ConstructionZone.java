package constructors;

public class ConstructionZone {

    public static void main(String[] args) {

        Building b1 = new Building();
        Building b2 = new Building(1000);

        System.out.println(b1.area);
        System.out.println(b1.walls);
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("--------------");

        House h1 = new House();

        System.out.println(h1);
        System.out.println(h1.area);
        System.out.println(h1.walls);
        System.out.println(h1.bedrooms);
        System.out.println(h1.color);


        House h2 = new House(750);
        h2.color = "Blue";
        h2.walls = 1;

        House h3 = new House(1500, 4);
        System.out.println(h3);

        System.out.println("--------------");

        House h4 = h3;
        System.out.println(h3);
        System.out.println(h4);

        h3.color = "Red";
        h4.walls = 12;

        System.out.println("--------------");
        System.out.println(h3);
        System.out.println(h4);

        House h5 = new House(h3);
        System.out.println("--------------");
        System.out.println(h3);
        System.out.println(h5);

        h3.walls++;
        h5.bedrooms--;
        System.out.println("--------------");
        System.out.println(h3);
        System.out.println(h5);



    }

}