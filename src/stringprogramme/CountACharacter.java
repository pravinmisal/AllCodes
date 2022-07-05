package stringprogramme;

public class CountACharacter {
public static void main(String[] args) {
	String s1="aabbaaccd";
	int count=0;
	for(int i=0;i<s1.length();i++) {
		
		char c = s1.charAt(i);
		if(c=='a') {
			count++;
		}
	}System.out.println("character a is present for "+count+"times");
}
}
