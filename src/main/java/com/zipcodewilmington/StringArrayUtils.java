package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        Integer lastElementPosition = array.length - 1;
        return array[lastElementPosition];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        Integer secondLastElementPosition = array.length - 2;
        return array[secondLastElementPosition];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        Boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                result = true;
                break;
            } else {
                result = false;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        Integer counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[counter] = array[i];
            counter++;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        Integer counter = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[counter] = array[i];
            counter++;
        }
        return Arrays.toString(reverseArray).equals(Arrays.toString(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String ofArray = "";
        Integer index;

        for (int i = 0; i < array.length; i++){
            ofArray += array[i];
        }
        ofArray = ofArray.replace(" ", "");
        ofArray = ofArray.toLowerCase();
        System.out.println(ofArray);
        Boolean[] alphabet = new Boolean [26];

        if (ofArray.length() < alphabet.length) {
            return false;
        }

        for (int j = 0; j < ofArray.length(); j++) {
            if (ofArray.charAt(j) >= 'a' && ofArray.charAt(j) <= 'z') {
                index = ofArray.charAt(j) - 'a';
                alphabet[index] = true;
            }
        }
        for (int k = 0; k < alphabet.length; k++) {
            if (alphabet[k] != true) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        Integer counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length];
        Integer counter = 0;
        Integer counter2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[counter] = array[i];
                counter++;
            } else {
                counter2++;
            }
        }
        String[] newArray2 = new String[newArray.length - counter2];
        for (int i = 0; i < newArray2.length; i++) {
            newArray2[i] = newArray[i];
        }

        return newArray2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> removed = new ArrayList<String>();
        removed.add(array[0]);
        for(int i = 1; i < array.length; i++){
            if(array[i] != array[i-1]){
                removed.add(array[i]);
            }
        }
        return removed.toArray(new String[removed.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String placeHolder = array[0];
        String temp = "";
        for(int i = 0; i < array.length; i++){
            if(placeHolder.equals(array[i])){
                temp += array[i];
            }else{
                placeHolder = array[i];
                temp += " " + array[i];
            }
        }
        String[] array2 = temp.split(" ");

        return array2;
    }


}
