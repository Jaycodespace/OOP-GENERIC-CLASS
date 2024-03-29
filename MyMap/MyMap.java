package MyMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter a (string) key to put: ");
        String string_to_put = scan.nextLine();
        System.out.print("Enter an (integer) value to put: ");
        int integer_to_put = scan.nextInt();
        scan.nextLine();

        MyMap<Object, Object> myMap = new MyMap<>();
        myMap.put(string_to_put, integer_to_put);

        System.out.print("Enter a (string) key to search: ");
        String key_to_search = scan.nextLine();

        Integer value_to_get = (Integer) myMap.get(key_to_search);

        if (value_to_get != null) {
            System.out.println("Value for key '" + key_to_search + "': " + value_to_get);
        } else {
            throw new IllegalArgumentException("No value found for key '" + key_to_search + "'");
        }

        System.out.print("Enter a (string) key to remove: ");
        String key_to_remove = scan.nextLine();

        Integer value_to_remove = (Integer) myMap.remove(key_to_remove);

        if (value_to_remove != null) {
            System.out.println("Removed value for key '" + key_to_remove + "': " + value_to_remove);
        } else {
            throw new IllegalArgumentException("Key '" + key_to_remove + "' not found in the map");
        }
    }
}

