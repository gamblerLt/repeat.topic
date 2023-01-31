package lt.code.academy.loop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[10]; //1 vaariantas kai nezinom reiksmiu
        int[] mas2 = {1, 2, 5, 6}; // 2 variantas kai zinom reiksmes

        //kaip pasiimti reiksmes

        mas[0] = 10;
        mas[3] = 1;
        int value = mas[0];

        for(int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
        System.out.println("\n");

        List<Integer> numbers = new ArrayList<>(); //dazniausiai naudojamas
        numbers.add(10);

        value = numbers.get(0);
        System.out.println(value);

        System.out.println(numbers.size());
        int size = numbers.size();
        boolean isExist = numbers.contains(20); // false
        System.out.println(isExist);

        Set<User> users = new HashSet<>();
        users.add(new User(1));
        users.add(new User(2));
        users.add(new User(1));// neprintis nes recordas, jeigu butu klase su geteriais,
        // printintu bet reiktu overaidint 31 d paskaitos pabaiga

        //setas neturi metodo, kuris leistu pasiimti viena elementa pgl
        //indeksa, todel naudojam for
        for(User user : users) {
            System.out.println(user.id());
        }

        Map<Integer, String> values = new HashMap<>();
        values.put(1, "Vardas");

        String result = values.get(1);

        System.out.println(result);

        //users.forEach(user -> System.out.println(user.getId())); // reikia kad butu ne recorde useris
    }
}
