import java.util.Scanner;

public class DimondPattern {
	public static void displayPattern(int num) {
		int spacecnt=(int)(num/2);
		//it will generate string with spaces
		for(int i=1;i<=num;i=i+2) { 
			String s="";
			for(int k=0;k<spacecnt;k++) {
				s=s+"-";
			}
			//It will generate string with star
			String star="";
			for(int j=1;j<=i;j++) {
				//initialize it for spsces
				star=star+"*";
				
			}
			System.out.println(s+star);
			spacecnt=spacecnt-1;
		    System.out.println();
		}
		spacecnt=1;
		for(int i=num-2;i>=1;i=i-2) {
			String s="";
			for(int k=0;k<spacecnt;k++) {
				s=s+"-";
			}
			String star="";
			for(int j=1;j<=i;j++) {
				//initialize it for spsces
				star=star+"*";
			
		    }
			System.out.println(s+star);
			System.out.println();
			spacecnt=spacecnt+1;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows to display");
		int num=sc.nextInt();
		displayPattern(num);
         sc.close();
	}

}
