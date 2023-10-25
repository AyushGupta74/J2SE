import java.util.Scanner;

public class ArrayService {
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			  System.out.println("Enetr number "+(i+1));
			  arr[i]=sc.nextInt();
		  }
	}
	public static void displayData(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			  System.out.println((i+1)+": "+arr[i]);
		  }
		
	}
	public static int findSum(int[] arr) {
		int s=0;
		/*for(int i=0;i<arr.length;i++) {
			 s=s+arr[i];
		}*/
		for(int val:arr) {
			s=s+val;
		}
		return s;
	}
	
	//find all values from array a which are > v
	public static int[] findAllGreaterVal(int[] a,int v) {
		int[] temp=new int[a.length];
		//add data in temp array at cnt
		int cnt=0;
		for(int val:a) {
			if(val>v) {     //[11,12,10,6,8,13,-1 , , , , ]
				temp[cnt]=val;
				cnt++;
			}
		}
		for(int i=cnt;i<temp.length;i++) {
			temp[cnt]=-1;
		}
		return temp;
		
	}
	
	public static int searchValue(int[] arr,int v) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v) {
				return i;
			}
		}
		return -1;
	}
}
