class NumberService{
   public static int factorial(int num){
	   int f=1;
	   for(int i=2;i<=num;i++){
	       f=f*i;
	   }
	   return f;
   }
   public static int addition(int num1,int num2){
	   return num1+num2;
	   
   }
   public static int add_digits(int num1){
	   int s=0;
	   while(num1!=0){
		   int d=num1%10;  
		   s=s+d;
		   num1=(int)(num1/10);  
	   }
	   return s;
	   
   }
}