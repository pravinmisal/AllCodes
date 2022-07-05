package stringclasspractice;

public class StringClassDiscussion {
public static void main(String[] args) {
	String s= new String("abc");
	String s1=new String ("def");
	String ss="jkl";
	String ss1="jkl";
	String s2=new String("jkl");
	String s3=new String("abc");
    String ss2="abc";
    
    boolean pointing = ss==ss1;
    System.out.println(pointing);
    boolean pointing1 = ss==s2;
    System.out.println(pointing1);
    boolean isequal = s.equals(s3);
    System.out.println(isequal);
    boolean isequal1 = ss.equals(s2);
    System.out.println(isequal1);
    
    String var1="velocity";
     var1.concat("corporate");
  System.out.println("output of string is :"+var1);
  StringBuffer sb=new StringBuffer("velocity");
  sb.append("corporate");
  System.out.println("output of string is "+sb);
  
}
}
