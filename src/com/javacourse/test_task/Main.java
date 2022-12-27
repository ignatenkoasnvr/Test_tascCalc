package com.javacourse.test_task;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String tempString = in.nextLine();
        in.close();

        System.out.println(calc(tempString));
    }

    public static boolean arabic = true;

    public static String calc(String input) {
        if (!input.contains(" ")) {
            System.out.println("throws Exception // т.к. строка не является математической операцией");
            System.exit (1);
        }

        String[] strings = input.split(" ");
        String str1= null, str2= null, str3 = null;
        try {
            str1 = strings[0];
            str2 = strings[1];
            str3 = strings[2];
        }catch (Exception e){
            System.out.println("throws Exception // т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }


        int [] mas = {0 , 0 };
        mas = number(str1, str3);
        //int b = number( arabic);
        int result = 0;
        String res = null;

        if (str2.equals("+"))
            result = mas[0] + mas[1];
        else if (str2.equals("-"))
            result = mas[0] - mas[1];
        else if (str2.equals("*"))
            result = mas[0] * mas[1];
        else if (str2.equals("/"))
            result = mas[0] / mas[1];

        else {
            System.out.println("throws Exception // т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit (1);
        }
        if (result <=0 && !arabic){
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            System.exit (1);
        }

        if (!arabic){
            res = toRomul(result);
        }
        else {
            res = String.valueOf(result);
        }
        return res;
    }
    public static int[] number(String str1, String str3) {
        int[] mas = {0, 0};
        switch (str1) {
            case "0":
                mas[0] = 0;
                break;
            case "1":
                mas[0] = 1;
                break;
            case "2":
                mas[0] = 2;
                break;
            case "3":
                mas[0] = 3;
                break;
            case "4":
                mas[0] = 4;
                break;
            case "5":
                mas[0] = 5;
                break;
            case "6":
                mas[0] = 6;
                break;
            case "7":
                mas[0] = 7;
                break;
            case "8":
                mas[0] = 8;
                break;
            case "9":
                mas[0] = 9;
                break;
            case "10":
                mas[0] = 10;
                break;
            case "I":
                mas[0] = 1;
                arabic = false;
                break;
            case "II":
                mas[0] = 2;
                arabic = false;
                break;
            case "III":
                mas[0] = 3;
                arabic = false;
                break;
            case "IV":
                mas[0] = 4;
                arabic = false;
                break;
            case "V":
                mas[0] = 5;
                arabic = false;
                break;
            case "VI":
                mas[0] = 6;
                arabic = false;
                break;
            case "VII":
                mas[0] = 7;
                arabic = false;
                break;
            case "VIII":
                mas[0] = 8;
                arabic = false;
                break;
            case "IX":
                mas[0] = 9;
                arabic = false;
                break;
            case "X":
                mas[0] = 10;
                arabic = false;
                break;

        }
        switch (str3) {
            case "0":
                mas[1] = 0;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "1":
                mas[1] = 1;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "2":
                mas[1] = 2;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "3":
                mas[1] = 3;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "4":
                mas[1] = 4;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "5":
                mas[1] = 5;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "6":
                mas[1] = 6;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "7":
                mas[1] = 7;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "8":
                mas[1] = 8;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "9":
                mas[1] = 9;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "10":
                mas[1] = 10;
                if (!arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "I":
                mas[1] = 1;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "II":
                mas[1] = 2;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "III":
                mas[1] = 3;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "IV":
                mas[1] = 4;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "V":
                mas[1] = 5;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "VI":
                mas[1] = 6;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "VII":
                mas[1] = 7;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "VIII":
                mas[1] = 8;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "IX":
                mas[1] = 9;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;
            case "X":
                mas[1] = 10;
                if (arabic) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    System.exit (1);
                }
                break;

            default: // catch trow
        }

        return mas;
    }
    public static String toRomul(int res){
        String tempStr = null;
        int tempArray[] = {res/10, res % 10};
        switch (tempArray[0]) {
            case 1:
                tempStr = "X";
                break;
            case 2:
                tempStr = "XX";
                break;
            case 3:
                tempStr = "XXX";
                break;
            case 4:
                tempStr = "XL";
                break;
            case 5:
                tempStr = "L";
                break;
            case 6:
                tempStr = "LX";
                break;
            case 7:
                tempStr = "LXX";
                break;
            case 8:
                tempStr = "XLLL";
                break;
            case 9:
                tempStr = "XC";
                break;
            case 10:
                tempStr = "C";
                break;
        }
        switch (tempArray[1]) {
            case 0:
                break;
            case 1:
                tempStr = tempStr + "I";
                break;
            case 2:
                tempStr = tempStr + "II";
                break;
            case 3:
                tempStr = tempStr + "III";
                break;
            case 4:
                tempStr = tempStr + "IV";
                break;
            case 5:
                tempStr = tempStr + "V";
                break;
            case 6:
                tempStr = tempStr + "VI";
                break;
            case 7:
                tempStr = tempStr + "VII";
                break;
            case 8:
                tempStr = tempStr + "VIII";
                break;
            case 9:
                tempStr = tempStr + "IX";
                break;
        }
        return tempStr;
    }
}
