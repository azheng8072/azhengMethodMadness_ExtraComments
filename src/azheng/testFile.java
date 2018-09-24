package azheng;

public class testFile {

    public static void main(String[] args) {
	// write your code here
        System.out.println(azhengLib.dateStr("04/16/2011"));
        //tested dateStr method by putting in different dates
        System.out.println(azhengLib.cutOut("Happycat Happy", "Happy"));
        //tested cutOut method by putting different words in different places and using different subStr
        azhengLib.multiplicationTable(5, 10);
        //tested out multiplicationTable method by using different bases and ranges
        azhengLib.sumUpTo(5);
        //tested out sumUpTo method by putting in different numbers and adding using a calculator
        System.out.println(azhengLib.isPalindrome("plolp"));
        //tested out isPalindrome method by adding iin different words

    }
}
