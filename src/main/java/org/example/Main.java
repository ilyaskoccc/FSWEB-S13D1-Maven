package org.example;

public class Main {
    public static void main(String[] args) {

        /* 1. Soru Bölümü */
    // System.out.println(shouldWakeUp (true, 1));
    // System.out.println(shouldWakeUp (false, 2)); 
    // System.out.println(shouldWakeUp (true, 8)); 
    // System.out.println(shouldWakeUp (true, -1));

        /* 2. Soru Bölümü */
    // System.out.println(hasTeen(9, 99, 19));
    // System.out.println(hasTeen(23, 15, 42));
    // System.out.println(hasTeen(22, 23, 34));

        /* 3. Soru Bölümü */
    // System.out.println(isCatPlaying(true, 10));
    // System.out.println(isCatPlaying(false, 36));
    // System.out.println(isCatPlaying(false, 35));

        /* 4. Soru Bölümü */
    // System.out.println(area(5.0, 4.0));
    // System.out.println(area(-1.0, 4.0));

        /* 5. Soru Bölümü */
    System.out.println(area(5.0));
    System.out.println(area(-1));


    }

    // public static boolean shouldWakeUp(boolean isBarking, int clock) {
    //     if (isBarking) { 
    //         if (clock >= 0 && clock <= 23) { 
    //             if (clock >= 8 && clock <= 20) { 
    //                 return false;
    //             } else{
    //                 return true;
    //             }
    //         } else { 
    //             return false;
    //         }
    //     } else {
    //         return false; 
    //     }
    // }

    // public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
    //     if ((firstAge >= 13 && firstAge <= 19) || (secondAge >= 13 && secondAge <= 19) || (thirdAge >= 13 && thirdAge <= 19) ) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    // public static boolean isCatPlaying(boolean isSummer, int temp) {
    //     if (isSummer) {
    //         if (temp >= 25 && temp <= 45) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     } else {
    //         if (temp >= 25 && temp <= 35) {
    //             return true;
    //         } else {
    //             return false;
    //         }
    //     }

    //     // int sicaklikUstLimit = isSummer ? 45 : 35;
    //     // return temp >= 25 && temp <= sicaklikUstLimit;
    // }

    // public static double area(double width, double height) {
    //     if (width >= 0 && height >= 0) {
    //         return width * height;
    //     } else {
    //         return -1;
    //     }
    // }

    public static double area(double radius) {
        if (radius >= 0) {
            return radius * radius * Math.PI;
        } else {
            return -1;
        }
    }
}
