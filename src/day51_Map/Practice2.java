package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {

        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group3 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group4 = {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        Map<Integer, String[]> groups = new LinkedHashMap();

        //add all the group id and group members into the map named groups

        groups.put(1,group1);
        groups.put(2,group2);
        groups.put(3,group3);
        groups.put(4,group4);
        groups.put(5,group5);

        // display the names of each student with group id of 1

        for (String eachStudent : groups.get(1)){
            System.out.println(eachStudent);
        }

        //display the names of each student from each groups


        for (Map.Entry<Integer, String[]> eachGroup : groups.entrySet()) {
            for (String eachStudent: eachGroup.getValue()) {

                System.out.println("Group id: " + eachGroup.getKey() + "   Students name: " + eachStudent);
            }
        }

    }
}

/*
Given the following arrays that contains the names of the students from each group:
        String[] group1 = {};
        String[] group2 = {};
        String[] group3 = {};
        String[] group4 = {};
        String[] group5 = {};

    Create a map that contains group id and names of group members

            Map<Integer, String[]> groups = new LinkedHashMap();

        add all the group id and group members into the map named groups

    display the names of each student with group id of 1

    display the names of each student from each groups
 */
