//This Program is created by Aryaan Rabara 21CE112
//Github link:-https://github.com/21CE112/21CE112_JAVA_PRAC_7.git
// Create a generic method for sorting an array of Comparable objects.
public class generic {
    // generic method printArray
    public static <E> void printArray(E[] inputArray) {
   // Display array elements
    for (E element : inputArray) {
    System.out.printf("%s ", element);
    }
    System.out.println();
    }
    public static void main(String args[]) {
   // Create arrays of Integer, Double and Character
    Integer[] intArray = {13,17,19,21,23};
    Double[] doubleArray = {5.6,4.2,7.9,1.4,5.0};
    Character[] charArray = {'H','i','i'};
    System.out.println("Array integerArray contains:");
    printArray(intArray);
    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray);
    System.out.println("\nArray characterArray contains:");
    printArray(charArray);
    System.out.println("This program is created by Aryaan Rabara 21CE112");
    }
   }
   