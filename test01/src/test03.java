import java.util.Scanner;


public class test03 {
	public static void main(String[] args) {
		int n=12345;
		int sum=0;
		int t;
		do{
			 t=n%10;
			 sum+=t;
			 n=n/10;			
		}while(n!=0);
		System.out.println(sum);
}
}
