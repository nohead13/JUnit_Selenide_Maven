package util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CountryIdCodeGenerator {

    private static Random random = new Random();

    public static String getDay() {
        String day = String.format("%02d",random.nextInt(28) + 1);
        return day;
    }

    public static String getMonth() {
        String month = String.format("%02d", random.nextInt(12) + 1);
        return month;
    }

    public static String getYear() {
        String year = String.format("%02d",  ThreadLocalRandom.current().nextInt(60, 90));
        return year;
    }

    public static String getIndividualNumber() {
        String individualNumber = String.format("%03d", random.nextInt(898) + 2); //range is 002–899, to satisfy Finland
        return individualNumber;
    }

    /*
    Estonian ID - GYYMMDDSSSC
    - G show sex
    - SSS the individual number
    - C a checksum order (1,2,3,4,5,6,7,8,9,1), if C = 10, order (3,4,5,6,7,8,9,1,2,3)
     */

    public static String estonianIdGenerate() {
        int genderIndex = random.nextInt(4) + 3;
        String year = getYear();
        String month = getMonth();
        String day = getDay();
        String individualNumber = getIndividualNumber();
        String idCode;

        int controlNumber = (genderIndex + year.indexOf(0) * 2 + year.indexOf(1) * 3 + month.indexOf(0) * 4 + month.indexOf(1) * 5 + day.indexOf(0) * 6 + day.indexOf(1) * 7 + individualNumber.indexOf(0) * 8 + individualNumber.indexOf(1) * 9 + individualNumber.indexOf(2))/11;
        if (controlNumber == 10){
            controlNumber = (genderIndex * 3 + year.indexOf(0) * 4 + year.indexOf(1) * 5 + month.indexOf(0) * 6 + month.indexOf(1) * 7 + day.indexOf(0) * 8 + day.indexOf(1) * 9 + individualNumber.indexOf(0) + individualNumber.indexOf(1) * 2 + individualNumber.indexOf(2) * 3)/11;
        }
        idCode = genderIndex + year + month + day + individualNumber + controlNumber;
        return idCode;
    }

    public static String latviaIdGenerate() {
        return String.valueOf(32 + random.nextInt(999999999));
    }

    public static String defaultIdGenetate() {
        String number = "asd";
        System.currentTimeMillis();
        return number;
    }
}
