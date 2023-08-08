package assesment3;

import java.util.Scanner;
public class sortdict {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String dic[] = new String[n];
		for(int i=0;i<n;i++)dict[i]=sc.next();
		String order = sc.next();
		Boolean isOrdered = true;
		for(int i=1;i<k;i++) {
			int curr=-1,prev=-1;
			for(int j=0;j<n;j++) {
				if(dict[j].charAt(0)==order.charAt(i)) {
					curr=j;
				}
				else if(dict[j].charAt(0)==order.charAt(i-1)) {
					prev=j;
				}
				if(curr!=-1 && prev!=-1)
					break;
			}
			if(curr<prev) {
				System.out.println(0);
				isOrdered = false;
				break;
			}
		}
		if(isOrdered) {
			System.out.println(1);
		}
		
	}

}
