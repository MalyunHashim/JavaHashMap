package JavaHashMap;

import java.util.HashMap;

public class javahashmap {

        public static void main(String[] args) {
            HashMap<String, Integer> people = new HashMap<>();
            people.put("Amina", 23);
            people.put("Aisha", 12);
            people.put("Ahmed",34);
            people.put("mohamed",25);
            people.put("ali",31);
            people.put("fatima",18);

            for (String i : people.keySet()) {
                System.out.println(("key: " + i + " value: " + people.get(i)));
            }

// write a program in java using hash maps, 30 country's and their corresponding population in africa
//  and make sure to make it dynamic for user input to look for the country and also look for the population
        }
    }

