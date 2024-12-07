package f;

public class fact {
	

		public static void main(String[] args)
		 {
			
			 int i, nbEntiers=0, factorielle=1;
			 int ancien;
			 try{
				
			 nbEntiers= Integer.parseInt(args[0]);
			 if(nbEntiers<0) {
				 throw new NegativeException();
			 }
			 else {
				 if(nbEntiers>=20)
				 {
					 throw new BignumberException();
				 }
				 else {
					 for (i=2;i<= nbEntiers;i++)
					 {
					 ancien=factorielle;
					 factorielle *= i;
					 }
					 System.out.println(" Voila la factorielle des "+ nbEntiers +
					 " premiers entiers : "+ factorielle );
					 }}
				 
			 }
			
			 catch(ArrayIndexOutOfBoundsException e){
				 System.out.println("veuillez donner un nombre");
			 }
			 catch(BignumberException e1)
			 {
				 System.out.println("donner un nombre inferieur a 20");
			 }
			 catch(NegativeException e2){
				 System.out.println("donner un nombre positive ");
				 
			 }
			 catch(NumberFormatException e3)
			 {
				 System.out.println("veuillez donner un nomber !!");
			 }
			 
			 }
		}
	



