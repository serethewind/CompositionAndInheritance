package StringBuilder;

import java.util.*;

public class SbTest {
    public static void main(String[] args) {
//        String firstName = "Afogu";
//        firstName.toLowerCase();
//        System.out.println(firstName);

//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb1 = new StringBuilder("You are welcome to iAcademy");
//        StringBuilder sb2 = new StringBuilder(10);
//        System.out.println(sb1);
////        sb1.toString().toUpperCase();
////        System.out.println(sb1);
//        System.out.println(sb1.length());
//        System.out.println(sb1.capacity());
////        sb1.setLength(50);
//        System.out.println(sb1);
//        System.out.println(sb1.charAt(8));
//        sb1.setCharAt(8, 'z');
//        System.out.println(sb1);
//
//        char[] characterArray = new char[sb1.length()];
//        sb1.getChars(4, 11, characterArray, 9);
//        System.out.println(Arrays.toString(characterArray));

//        System.out.println(reverseString("Noah"));
//        System.out.println(reverseString2("iacademy"));
//        System.out.println(reverseStringUsingArrayList("java"));
//        System.out.println(reverseStringUsingStack("sarah"));
        System.out.println(pallindromicSequence("acbbtyca"));
        System.out.println(pallindromicString("racecar"));
    }

    public static String test() {
        StringBuilder sb = new StringBuilder("iAcademy");
        return sb.toString();
    }

    public static String reverseString(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString();
    }

    public static String reverseString2(String inputString) {
        String reversedString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }
        return reversedString;
    }

    public static String reverseStringUsingArrayList(String inputString) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            list.add(inputString.charAt(i));
        }
        Collections.reverse(list);
        return list.toString();
    }

    public static String reverseStringUsingStack(String inputString) {
        Stack<Character> list = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
//            list.add(inputString.charAt(i));
            list.push(inputString.charAt(i));
        }
//        Collections.reverse(list);
//        return list.toString();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.pop());
        }
        return sb.toString();
    }

    public static boolean pallindromicSequence(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean pallindromicString(String inputString) {
        StringBuilder sb = new StringBuilder(inputString);
        sb.reverse();
//        return inputString.equalsIgnoreCase(sb.toString());
        return sb.toString().equalsIgnoreCase(inputString);
        //return inputString.contentEquals(sb.toString());
    }

    public static boolean isPallindrome(String str) {
        int front = 0;
        int back = str.length() - 1;
        boolean result = false;
        while (front < back) {
            if (str.charAt(front) != str.charAt(back)) {
                result = false;
            }
            front++;
            back--;
            result = true;
        }
        return result;
    }

    public static boolean isPallindromeUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < stack.size(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
        return str.equalsIgnoreCase(sb.toString());
    }

//    public static boolean pallindromicSequence (String str){
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//
//
//    }
}
