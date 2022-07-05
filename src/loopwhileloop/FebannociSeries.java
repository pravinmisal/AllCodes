package loopwhileloop;

public class FebannociSeries {
public static void main(String[] args) {
	int i=0;
	int j=1;
	int num=12;
     int L=1;
	while(L<=num) {
		int o=i+j;
		i=j;
		j=o;
		
		L++;
		System.out.println(o);
		 
		
	}
}
}
