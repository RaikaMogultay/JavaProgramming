package day51_Map;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        //1. Display the names of the employee who were hired before 2015
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if (entry.getValue().isBefore(LocalDate.of(2015, 1, 1))) {
                System.out.println("Employees hired before 2015 = " + entry.getKey());
            }
        }

        //2. display the name of the employee who were hired on 5/15/2020
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            if (entry.getValue().isEqual(LocalDate.of(2020, 5, 15))) {
                System.out.println("Employee hired on 5/15/2020 =" + entry.getKey());
            }
        }

        //3. How many people were hired after 2014
        int count = 0;
        for (Map.Entry<String, LocalDate> dataEntry : map.entrySet()) {
            if (dataEntry.getValue().isAfter(LocalDate.of(2014, 12, 31))) {
                count++;

            }
        }
        System.out.println("After 2014 were hired a total of :  " + count);

        //4. display the name and hire date of the employee
        for (Map.Entry<String, LocalDate> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            //System.out.println(entry);

        }

    }
}

/*
1.  Given the following map that contains the names and hired date of employees:
         Map<String, LocalDate> map = new LinkedHashMap<>();
            map.put("John", LocalDate.of(2018, 9, 5));
            map.put("Antony", LocalDate.of(2012, 7, 29));
            map.put("Jimmy", LocalDate.of(2014, 4, 1));
            map.put("James", LocalDate.of(2016, 11, 2));
            map.put("Josh", LocalDate.of(2020, 5, 15));
            map.put("Cory", LocalDate.of(2015, 6, 19));
            map.put("Anderson", LocalDate.of(2013, 8, 24));
            map.put("Steven", LocalDate.of(2017, 10, 2));

        1. Display the names of the employee who were hired before 2015
                    Hint: You can use isBefore method of LocalDate

        2. display the name of the employee who were hired on 5/15/2020
                    Hint: You can use isEqual method of LocalDate

        3. How many people were hired after 2014?
                    Hint: You can use isAfter method of LocalDate

        4. display the name and hire date of the employee
 */
