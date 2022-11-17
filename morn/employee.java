package morn;
import java.util.Scanner;
public class employee {
	public static void main(String args[]) {
		double gs,it,pt,pf,netsalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gross salary:");
		gs=sc.nextDouble();
		System.out.println("Enter Income tax %");
		it=sc.nextDouble();
		System.out.println("Enter professional Tax%");
		pt=sc.nextDouble();
		System.out.println("Enter Provident fund%");
		pf=sc.nextDouble();
		pf=pf*(gs/100);
		it=it*(gs/100);
		pt=pt*(gs/100);
		netsalary=gs-it-pt-pf;
		System.out.println("Net Salary is="+netsalary);
		
		
		
	}

}
