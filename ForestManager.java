package Assessment3;
import java.util.*;
interface DigitalTree
{
	int absorbSunlight(int hours);
	String getTreeDetails();
}
public class ForestManager implements DigitalTree {
	static ForestManager f1=new ForestManager();
	static int[] arr=new int[3];
	static int c=0;
	static Scanner sc=new Scanner(System.in);
	public static int produceEnergyForHours(int hours)
	{
		int s=0,c=hours;
		for(int i=0;i<3;i++)
		{
			s+=arr[i];
		}
		return s;
	}
	public static String getForestReport()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(f1.getTreeDetails()+"Energy-"+f1.absorbSunlight(c));
		}	
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours=sc.nextInt();
		String[] ar=new String[3];
		for(int i=0;i<3;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println(produceEnergyForHours(hours));
		getForestReport();
	}
	int c2=0;
	@Override
	public int absorbSunlight(int hours) {
		// TODO Auto-generated method stub
		if(ar[c2].indexOf("B")==0) {arr[c2]=2*hours;c2++;return 2*hours;}
		else if(ar[c2].indexOf("Q")==0) {arr[c2]=3*hours*hours;c2++;return 3*hours*hours;}
		else if(ar[c2].indexOf("N")==0) {arr[c2]=hours*hours*hours;c2++;return hours*hours*hours;}
		else return 0;
	}
	int c1=-1;
	@Override
	public String getTreeDetails() {
		// TODO Auto-generated method stub
		c1++;
		return ar[c1];
	}
}