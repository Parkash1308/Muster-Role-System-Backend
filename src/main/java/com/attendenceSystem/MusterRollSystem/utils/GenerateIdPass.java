package com.attendenceSystem.MusterRollSystem.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GenerateIdPass {
    private static Random random = new Random();

    private static String generateRandomNumber(int number) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < number; i++) {
            digits.append(random.nextInt(10));
        }
        return "_" + digits.toString();
    }// generate the four random numbers

    private static String suffleCnicNumbers(String cnic) {

        List<Character> fourCnicNumbers = new ArrayList<>();

        for (int i = 6; i < 10; i++) {
            fourCnicNumbers.add(cnic.charAt(i));
        }

        Collections.shuffle(fourCnicNumbers);
        StringBuilder shuffledNumbers = new StringBuilder();
        for (char number : fourCnicNumbers) {
            shuffledNumbers.append(number);
        }
        return shuffledNumbers.toString();
    }// extract the four numbers from cnic at indexs,6,7,8,9

    public static String generateAreaId(String areaName) {
        String prefix = areaName.length() >= 3 ? areaName.substring(0, 3).toUpperCase()
                : areaName.toUpperCase();

        return prefix + generateRandomNumber(4);
    }// generate the areaId

    public static String generateSubAreaId(String areaName, String subAreaName) {
        String areaPrefix = areaName.length() >= 2 ? areaName.substring(0, 2).toUpperCase()
                : areaName.toUpperCase() + "_";
        String subAreaPrefix = subAreaName.length() >= 3 ? subAreaName.substring(0, 3)
                : subAreaName.toUpperCase();
        return areaPrefix + subAreaPrefix + generateRandomNumber(4);
    }

    public static String generateSiteAreaId(String subAreaName, String siteAreaName) {
        String subAreaPrefix = subAreaName.length() >= 3 ? subAreaName.substring(0, 2).toUpperCase()
                : subAreaName.toUpperCase() + "_";
        String siteAreaPrefix = siteAreaName.length() >= 3 ? siteAreaName.substring(0, 3).toUpperCase()
                : siteAreaName.toUpperCase();
        return subAreaPrefix + siteAreaPrefix + generateRandomNumber(4);
    }

    public static String generateUserID(String hireDate, String cnic, String siteAreaName) {
        String hireYearLastTwoDigit = "_" + hireDate.split("-")[0].substring(2);
        String siteAreaPrefix = siteAreaName.length() >= 3 ? siteAreaName.substring(0, 3).toUpperCase()
                : siteAreaName.toUpperCase() + "_";

        return siteAreaPrefix + suffleCnicNumbers(cnic) + hireYearLastTwoDigit;
    }

    public static String generatePassword(String hireDate, String cnic, String siteAreaName) {
        String hireYearLastTwoDigit = hireDate.split("-")[0].substring(2);
        String siteAreaPrefix = siteAreaName.length() >= 3 ? siteAreaName.substring(0, 3).toUpperCase()
                : siteAreaName.toUpperCase();

        return siteAreaPrefix + suffleCnicNumbers(cnic) + hireYearLastTwoDigit + generateRandomNumber(3);

    }

}
