package com.behl.pilotrun.programs.test;

    //    11, true, 2 =>  "1 PM"
      //  11, true, 24 => "11 AM"
       // 11, true, 26 => "1 PM"
        //11, false, 2 => "1 AM"

public class Date24HourFormat {

    public static void main(String[] args) {
        checkDate(11, true, 2);
    }

    private static String checkDate(int time, boolean format, int addToTime) {
        int result = time + addToTime;
        if (format) { // AM
            int offset = result % 24;  // 40 - -- 40 % 24  --> 16
            if (offset > 12) { // 16 > 12
                result = offset - 12;   // 16 - 12 --- 4 PM
                return result + " PM";
            }
            return result + " AM";

        } // its AM
        return  "0";
    }
}

//lists the number of customers in each country.
//include countries with more than 5 customers.


  //      select count(c.names) , c.country from table c group by c.country;

//select c.country from table c group by c.country having c.names > 5

