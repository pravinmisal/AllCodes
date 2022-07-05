package stringclasspractice;

public class MethodsInString {
public static void main(String[] args) {
//equals(String s)
//1.this method returns true if both the string are exactly identical to each other
	String s1="velocity";
	String s2="vElocity";
	boolean equalto = s1.equals(s2);
	System.out.println(equalto);
//equalignorecase(String s)
//this method returns true if the content of both the strings are equal irrespective of their case
//(can be either lower /upper case) otherwise false.
	String s3="velocity";
	String s4="VeLOcity";
	boolean s5 = s3.equalsIgnoreCase(s4);
	System.out.println(s5);
//3.length():this method is returns the total no of character available inside a string
	String s6="abcdefghijklmnopqrstuvwxyz";
    int s7 = s6.length();
    System.out.println(s7);
//4.charAt(int index):This method returns character value based on the index position which we are providing
// in it of a particular character.
    String s8="abcdef";
    char s9 = s8.charAt(1);
    System.out.println(s9);
//5.replace (char old ,char new):
//this method replace old char with new character that we will provide as an input
    String s10="abcdef";
   String s11 = s10.replace('b','f');
    System.out.println(s11);
//6.replace (String old,String new): this method returns a replaced String value which we are providing as an 
//new argument.
    String s12= "constructor";
    String s13 = s12.replace("truc","tor");
    System.out.println(s13);
 //7.substring (int index):this method returns a string value which is starting from the provided index
    String s14 = "velocity";
    String s15 = s14.substring(3);
    System.out.println(s15);
    
    
}
}
