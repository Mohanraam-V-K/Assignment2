package Assessment3;
import java.util.*;
interface AdvancedArithmetic{
	int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyCalculator a1=new MyCalculator();
		System.out.println(a1.divisor_sum(n));
	}
	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		int s=0;
		ArrayList<Integer> ar=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) s+=i;
		}
		return s;
	}
}