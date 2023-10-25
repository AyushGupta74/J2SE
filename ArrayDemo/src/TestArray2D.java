
public class TestArray2D {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		ArrayService2D.acceptData2D(arr);
		ArrayService2D.displayData(arr);
		
		/*int[][] a1=new int[3][];
		//int[][][] a2=new int[3][4][];  //--//error
		ArrayService2D.acceptDataDyanmic(a1);
		ArrayService2D.displayData(a1);*/
		int[] ans=ArrayService2D.sumRowWise(arr);
		System.out.println("row wise sum");
		for(int v:ans) {
			System.out.println(v);
		}
		int[] ans1=ArrayService2D.sumColumnWise(arr);
		System.out.println("Column wise sum");
		for(int v:ans1) {
			System.out.println(v);
		}
		
		//write a menu driven program for the following
		/*
		 * 1. add two array
		 * 2. find transpose
		 * 3. find minimum number from 2D array
		 * 4. find maximum number from 2D array
		 * 5. display array
		 * 6. check a particular number appears how many times in 2D array
		 * 7. exit
		 *  System.exit(0);
		 * 
		 * */
	}

}
