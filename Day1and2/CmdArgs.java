class CmdArgs{

public static void main(String[] args){
   if(args.length>=2){
       System.out.print("Hello "+args[0]);
	   System.out.print("Hello "+args[1]);
   }
   else{
      System.out.println("pls pass minimum 2 arguments");
   }
   
}

}