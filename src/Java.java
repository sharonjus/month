
public class Java {
public static void main(String[] args){
		try{
			try{
				
				System.out.println("going to multiply");
			}catch(ArithmeticException E)
			{System.out.println(E);}
			
			try{
				int a[]=new int[1];
				a[1]=2;
			}catch
			(ArrayIndexOutOfBoundsException R)
			{char[] e = null;
			System.out.println(e);}
			
			System.out.println("other statement");
		}catch(Exception e){System.out.println("handled");}
		System.out.println("normal flow..");
		}
			
			
	}
	

