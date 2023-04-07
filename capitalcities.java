package JavaHashMap;

import java.util.HashMap;

public class capitalcities {
    public static void main(String[] args) {


        HashMap<String, String> capitalcities = new HashMap<>();
        capitalcities.put("Kenya", "Nairobi");
        capitalcities.put("Uganda", "Kampala");
        capitalcities.put("Tanzania", "Dodoma");
        capitalcities.put("Somalia", "Mogadishu");
        capitalcities.put("Congo", "Kinshasa");
        capitalcities.put("SouthAfrica","Capetown");
        System.out.println(capitalcities);

        capitalcities.get("Kenya");
        System.out.println(capitalcities.get("Kenya"));
        capitalcities.get("Congo");
        System.out.println(capitalcities.get("Congo"));
        System.out.println(capitalcities.size());
        capitalcities.remove("Uganda");
        System.out.println(capitalcities);

        //capitalCities.clear();

        System.out.println(capitalcities.size());

        for(String i: capitalcities.keySet()) {
            System.out.println(i);
        }
            for(String i:capitalcities.values()) {
                System.out.println(i);

            }
            for (String i:capitalcities. keySet()){
                System.out.println("key:" +  i + " values: " +capitalcities.get(i));
            }
        }
    }
