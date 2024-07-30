package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListFactory {

    public static List getList(int choice) {

        switch (choice) {

            case 1: {
                System.out.println("Created ArrayList");
                return new ArrayList();
            } case 2: {
                System.out.println("Created LinkedList");
                return new LinkedList();
            } case 3: {
                System.out.println("Created Vector");
                return new Vector();
            } default: {
                System.out.println("Defaulting to creating ArrayList");
                return new ArrayList();
            }
        }

    }

}