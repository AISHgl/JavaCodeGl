//Craete a lambda to find the negative and positive number


package stringg;

@FunctionalInterface
interface NegPos{
	String negposss(int a);
}


public class Negpos {

	public static void main(String args[]) {
		
		NegPos NeggPossObj = (a) -> a>0?"PositiveNumber":"NegativeNumber";
		
		System.out.println("postive number is"+NeggPossObj.negposss());
	}
	
}
