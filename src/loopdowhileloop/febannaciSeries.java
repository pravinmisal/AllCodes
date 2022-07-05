package loopdowhileloop;

public class febannaciSeries {
public static void main(String[] args) {
	int i=0;
	int j=1;
	int num=12;
	int L=1;
	do {int o=i+j;L++;
	
		System.out.println(o);
		i=j;
		j=o;
		
	}
	while(L<=num);
}
}
