package ru.geekbrains;

public class ProgramTwo {
    public static void main(String[] args) {
        byte a1 = 125;
        short b = 255;
        int c = 560;
        long d = 1000000;

        float e = 1234.56f;
        double f = 0.00000000002;

        boolean g = true;

        char h = 'A';


        System.out.println(checkValue(10));
        System.out.println(helloMethod("Vasya"));
    }

    public static float calcFloat(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean checkSum(int a, int b) {
        return ((a + b) >= 20) && ((a + b) <= 20) ? true : false;
    }

    public static String checkValue(int a) {
        return a>=0 ? "Число положительное" : "Число отрицательное";
    }

    public static boolean checkValueBoolean (int a) {
        return a>=0 ? true : false;
    }

    public static String helloMethod (String name) {
        return "Привет, " + name + "!";
    }

    public static boolean checkYear (int year) {
        if (year%4 == 0)
        {
            if (year%100 == 0)
            {
                if (year%400 == 0)
                {
                    return false;
                }
                else return true;
            }
            else return true;
        }
        else return false;
    }

}
