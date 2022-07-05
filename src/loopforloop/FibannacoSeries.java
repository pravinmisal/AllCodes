package loopforloop;

public class FibannacoSeries {
public static void main(String[] args) {
	int i=0;
	int j=1;
	int num=12;
	for (int I=1;I<=num;I++) {
		int o=i+j;
		System.out.println(o);
	i=j;
	j=o;
		
	}
}
}
