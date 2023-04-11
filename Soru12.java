
public class Soru12 {

	public static void main(String[] args) {
		
		
		int j=0;
		System.out.print("Numbers searched: ");
		for(int i = 100; i<=999;i++) {
			int a = i/100;
			int b = ((i-(i/100)*100))/10;
			int c = i%10;
			if((a*b*c)*(a+b+c)==i) {
				System.out.print(i+",");
				j++;
			}
		}
		System.out.println();
		System.out.printf("There are %d three-digit numbers with this feature.",j);
	}


	}

