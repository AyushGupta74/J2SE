import java.util.Scanner;

public class TestArray1 {
	
	public static void main(String[ ] args) {
	  int x=12;	
	  int[] arr=new int[5]; 
	  ArrayService.acceptData(arr);
	  ArrayService.displayData(arr);
	  int sum=ArrayService.findSum(arr);
	  int val=5;
	  int[] arr1=ArrayService.findAllGreaterVal(arr,val);
	  ArrayService.displayData(arr1);
	  val=13;
	  int pos=ArrayService.searchValue(arr,val);
	  if(pos!=-1)
	  {
		  System.out.println("found at "+pos);
	  }
	  else {
		  System.out.println("not found ");
	  }
	}

}
