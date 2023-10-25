import java.util.Scanner;

public class ArrayService2D {
  public static void acceptData2D(int[][] a) {
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a[0].length;j++) {
			  System.out.println("enetr the value "+i+"---"+j);
			  a[i][j]=sc.nextInt();
		  }
	  }
  }
  public static void displayData(int[][] a) {
	  for(int i=0;i<a.length;i++) {
		  for(int j=0;j<a[i].length;j++) {
			  System.out.print(a[i][j]+"\t");
		  }
		  System.out.println();
	  }
  }
  
  public static void acceptDataDyanmic(int[][] a1) {
	  Scanner sc=new Scanner(System.in);
	  for(int i=0;i<a1.length;i++) {
		  System.out.println("enetr number of columns");
		  int c=sc.nextInt();
		  a1[i]=new int[c];
		  for(int j=0;j<c;j++) {
			  System.out.println("enter data "+i+"---"+j);
			  a1[i][j]=sc.nextInt();
		  }
	  }
	  
  }
  
  public static int[] sumRowWise(int[][] arr) {
	  int[] temp=new int[arr.length];
	 
	  for(int i=0;i<arr.length;i++) {
		  
		  for(int j=0;j<arr[i].length;j++) {
			  temp[i]=temp[i]+arr[i][j];
		  }
		  
	  }
	  return temp;
  }
  
  public static int[] sumColumnWise(int[][] arr) {
	  int[] temp=new int[arr[0].length];
      for(int i=0;i<arr[0].length;i++) { //0,1,2
		  
		  for(int j=0;j<arr.length;j++) {  //0,1,2,3
			  temp[i]=temp[i]+arr[j][i];
		  }
		  
	  }
	  return temp;
  }
}








