package azheng;

public class azhengLib {
    //Reformats the date srting given from mm/dd/yyyy to mm - dd - yyyy
    //since it is given that the format is already mm/dd/yyyy, I used substrings based on the index of the - and the actual numbers to convert them into their new forms.
    public static String dateStr(String str) {
        String day = str.substring(0, 2);
        String month = str.substring(3, 5);
        String year = str.substring(6);
        String newDate = day + " - " + month + " - " + year;
        return (str + " reformatted is " + newDate);

    }

    //takes out the first subStr string from mainStr.
    //using substrings to maneuver around the subStr that needs to be cut out.
    //if subStr was in the beginning of mainStr, then just start the cutted string after the length of subStr
    public static String cutOut(String mainStr, String subStr) {
        int cut = mainStr.indexOf(subStr);
        String cutted = "";
        if (cut > 0) {
            cutted = mainStr.substring(0, cut) + mainStr.substring(cut + subStr.length());
        } else {
            cutted = mainStr.substring(subStr.length());
        }
        return (mainStr + "   cutted out by   " + subStr + "   is   " + cutted);
    }

    //the first line printed states the base and how many numbers will be multiplied by the base
    //the next few numbers are the multiples
    public static void multiplicationTable(int base, int range) {
        System.out.println("printed below are the multiples of " + base + " from 0 to " + range);
        for (int i = 0; i < range + 1; i++) {
            System.out.println(i * base);
        }
    }

    //the for loop adds to the variable sum to get the total sum from all the digits added before the start number
    //only the sum gets printed out
    public static void sumUpTo(int start) {
        int sum = 0;
        for (int i = 0; i < start + 1; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of all the numbers from 0 to " + start + " is " + sum);
    }

    //first the while loop flips str by going over each letter and putting it in the back of the string's line to reverse the order(this code was created together in class)
    //next I used eqauls. to compare each character in str and output to see if they are the same
    //if they are the same then str is a palindrome which would be printed out and vice versa
    public static String isPalindrome(String str) {
        String output = "";
        int x = str.length() - 1;
        while (x >= 0) {
            output = output + str.substring(x, x + 1);
            x--;
        }
        if (str.equals(output)) {
            return (str + " is a palindrome");
        } else {
            return (str + " is not a palindrome");
        }

    }
}
