import java.util.Scanner;

public class Stats {
	
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		
		System.out.print("Number of Collected Touchdowns:");
		double TD=input.nextDouble();
		
		System.out.print("Total yards gained:");
		double Yds=input.nextDouble();
		
		System.out.print("Number of interceptions:");
		double INT=input.nextDouble();
		
		System.out.print("Number of completed passes:");
		double Comp=input.nextDouble();
		
		System.out.print("Number of pass attempts:");
		double ATT=input.nextDouble();
		
		double PR;
		
		double a;
		double b;
		double c;
		double d;
		
		a=(((Comp/ATT)-.3)*5);
		
		b=((Yds/ATT-3)*.25);
		
		c=((TD/ATT)*20);
		
		d= (2.375-((INT/ATT)*25));
		
		PR=(((a+b+c+d)/6)*100);
		
		System.out.printf("Players PR rating is:%3.1f",PR);
		

	}
}
