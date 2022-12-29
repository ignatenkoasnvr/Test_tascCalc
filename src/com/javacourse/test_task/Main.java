//package com.javacourse.test_task;
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
    public static int firstNumber = 0;
    public static int secondNumber = 0;
    public static String calc(String input) {
        if (!input.contains(" ")) {
            System.out.println("throws Exception // т.к. строка не является математической операцией");
            System.exit (1);
        }
        
        String[] strings = input.split(" ");
        if(strings.length < 2) {
            System.out.println("throws Exception // т.к. строка не является математической операцией");
            System.exit (1);
        }
        
        if(strings.length > 3) {
            System.out.println("throws Exception // т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit (1);
        }        
        
        String str1 = strings[0];
        String str2 = strings[1];
        String str3 = strings[2];

        try {
            firstNumber =  Integer.parseInt(str1);
            if ( firstNumber < 1 || firstNumber > 10){
                System.out.println("throws Exception  // т.к. калькулятор может принимать на вход числа от 1 до 10 включительно");
                System.exit (1);       
            } 
        }
        catch (NumberFormatException a) {
            firstNumber = toNumber(str1); 
            arabic = false;
        }
        try {
            secondNumber =  Integer.parseInt(str3);
            if (!arabic){
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit (1);
            }
            if (secondNumber < 1 || secondNumber > 10){
                System.out.println("throws Exception  // т.к. калькулятор может принимать на вход числа от 1 до 10 включительно ");
                System.exit (1);       
            }
        }
        catch (NumberFormatException a) {
            secondNumber = toNumber(str3); 
            if (arabic){
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit (1);
            }
        }       
        
        int resInt = 0;
        String resStr = null;

        if (str2.equals("+"))
            resInt = firstNumber + secondNumber;
        else if (str2.equals("-"))
            resInt = firstNumber - secondNumber;
        else if (str2.equals("*"))
            resInt = firstNumber * secondNumber;
        else if (str2.equals("/"))
            resInt = firstNumber / secondNumber;
        else {
            System.out.println("throws Exception // т.к. строка не является математической операцией");
            System.exit (1);
        }
        if (resInt <=0 && !arabic){
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            System.exit (1);
        }

        if (!arabic){
            resStr = toRomul(resInt);
        }
        else {
            resStr = String.valueOf(resInt);
        }
        return resStr;
    }
    public static int toNumber(String str) {
        int temp = 0;
        switch (str) {
            case "I":
                temp = 1;
                break;
            case "II":
                temp = 2;
                break;
            case "III":
                temp = 3;
                arabic = false;
                break;
            case "IV":
                temp = 4;
                arabic = false;
                break;
            case "V":
                temp = 5;
                arabic = false;
                break;
            case "VI":
                temp = 6;
                arabic = false;
                break;
            case "VII":
                temp = 7;
                arabic = false;
                break;
            case "VIII":
                temp = 8;
                arabic = false;
                break;
            case "IX":
                temp = 9;
                arabic = false;
                break;
            case "X":
                temp = 10;
                arabic = false;
                break;
            default:
                System.out.println("throws Exception //т.к. калькулятор может принимать на вход числа от 1 до 10 включительно");
                System.exit (1);
        }
        return temp;
    }
    public static String toRomul(int res){
        String tempStr = "";
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
