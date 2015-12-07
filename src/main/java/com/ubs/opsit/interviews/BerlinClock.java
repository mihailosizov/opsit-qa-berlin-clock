package com.ubs.opsit.interviews;

public class BerlinClock implements TimeConverter{
    public String convertTime(String givenTime) {
        String result = "";

        Integer[] timeArray = stringToIntArrayConverter(givenTime.split(":"));
        int hours = timeArray[0];
        int minutes = timeArray[1];
        int seconds = timeArray[2];

        result += printSeconds(seconds);
        result += printHours(hours);
        result += printMinutes(minutes);

        return result;
    }

    private String printSeconds(int seconds) {
        if ((seconds % 2) == 0) {
            return "Y\r\n";
        } else {
            return "O\r\n";
        }
    }

    private String printHours(int hours) {
        String result = "";
        int fives = hours / 5;
        int ones = hours % 5;
        int blankFives = 4 - fives;
        int blankOnes = 4 - ones;
        for (int i = 0; i < fives; i++) {
            result += "R";
        }
        for (int i = 0; i < blankFives; i++) {
            result += "O";
        }
        result += "\r\n";
        for (int i = 0; i < ones; i++) {
            result += "R";
        }
        for (int i = 0; i < blankOnes; i++) {
            result += "O";
        }
        result += "\r\n";
        return result;
    }

    private String printMinutes(int minutes) {
        String result = "";
        int fives = minutes / 5;
        int ones = minutes % 5;
        int blankFives = 11 - fives;
        int blankOnes = 4 - ones;
        for (int i = 0; i < fives; i++) {
            if (i == 2 || i == 5 || i == 8) {
                result += "R";
                continue;
            }
            result += "Y";
        }
        for (int i = 0; i < blankFives; i++) {
            result += "O";
        }
        result += "\r\n";
        for (int i = 0; i < ones; i++) {
            result += "Y";
        }
        for (int i = 0; i < blankOnes; i++) {
            result += "O";
        }
        return result;
    }

    private Integer[] stringToIntArrayConverter(String[] stringArray) {
        Integer[] intArray = new Integer[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.valueOf(stringArray[i]);
        }
        return intArray;
    }
}
