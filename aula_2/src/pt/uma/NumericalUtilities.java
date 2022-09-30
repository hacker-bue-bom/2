package pt.uma;

public class NumericalUtilities {

    static double powerOf(double value, int power) {
        if (power < 0) {
            return -1.0;
        }
        return (value*value)*power;
    }

    static int sumOfNaturalNumbersUpTo(int value) {
        if(value < 0) {
            return -1;
        }
        int res = 0;
        for (int i = 1; i< value; i++) {
            res += i;
        }
        return res;
    }

    static int sumOfNaturalNumbersBetween(int value1, int value2) {
        if(value1 >= value2) {
            return -1;
        }
        int res = 0;
        for (int i = value1; i < value2; ) {
            res += i;
        }
        return res;
    }

    static int sumOfEvenNumbersBetween(int value1, int value2) {
        int res = 0;
        for (int i = value1; i < value2; ) {
            if (i % 2 == 0) {
                res += i;
            }
        }
        return res;
    }
}
