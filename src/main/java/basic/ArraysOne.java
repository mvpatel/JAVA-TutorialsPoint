package basic;

import java.util.Arrays;

public class ArraysOne {

    public static void main(String[] args) {

        double[] myDoubleList;
        myDoubleList = new double[10];

        // following will combine declare, create and assign array to the reference.
        double[] myDoubleListOne = new double[10];

        String[] stringArray = new String[3];
        String[] stringArray1 = {"String 1", "String 2", "String 3", "String 4"};

        System.out.println(Arrays.toString(stringArray1));
        System.out.println(stringArray1[2]);
        System.out.println(stringArray1.length);
        System.out.println(stringArray.length);

        double[] myListDouble = {120.9, 1.8, 110.7, 123.6, 1.2, 11.10, 115.25};
        System.out.println(Arrays.toString(myListDouble));


        // Print all the array element

        for (int i = 0; i < myListDouble.length; i++) {
            System.out.println(myListDouble[i] + " ");
        }


        double[] myList = {1.9, 1.8, 112.7, 1.6, 1.2, 11.10};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        double total = 0;
        for (int i = 0; i < myListDouble.length; i++) {
            total += myListDouble[i];
        }
        System.out.println("Total of Array of Double is: " + total);

        // Finding the largest element
        double largeNumber = myListDouble[0];
        for (int i = 0; i < myListDouble.length; i++) {
            largeNumber = myListDouble[i] > largeNumber ? myListDouble[i] : largeNumber;
            if (myListDouble[i] > largeNumber) largeNumber = myListDouble[i];
        }
        System.out.println("Large number in double list array is: " + largeNumber);

        double[] myListOne = {1.9, 2.9, 3.8, 7.7};

//        print all the array elements by foreach loop for array - array foreach loop
        for(double eachVal: myListOne) {
            System.out.println(eachVal);
        }

        System.out.println("Total Value of double Array by method is here: " + getTotalvalue(myListOne));

        System.out.println("reverese array of myListOne is here: " + Arrays.toString(getReverseArray(myListOne)));
    }

    public static double getTotalvalue(double[] myListOne) {
        double totalVal = 0;
        for(double element: myListOne) {
            totalVal += element;
        }
        return totalVal;

    }

    public static double[] getReverseArray(double[] myListOne) {
        double[] revereseMyListOne = new double[myListOne.length]; // length of myListone

        for(int i = 0, j = revereseMyListOne.length - 1; i < myListOne.length; i++, j--) {
            revereseMyListOne[j] = myListOne[i];
        }
        return revereseMyListOne;

    }
}
