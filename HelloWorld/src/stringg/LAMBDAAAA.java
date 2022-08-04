//Create a lambda to find the even and odd value
//Create a lambda to find the largest number
//Create a lambda to find min number
//Create a lambda to print hello world
//Craete a lamda tp print the sum of 1 to 100 number

package stringg;

@FunctionalInterface
interface OdEv{
	String odEv(int n1);
}
@FunctionalInterface
interface Smal{
	int smal(int n1, int n2);
}

@FunctionalInterface
interface G1{
	int g1(int n1, int n2);
}
@FunctionalInterface
interface Sumofnas{
	int sumofnas1(int n1);
}

@FunctionalInterface
interface Pri{
	void print(String str);
}

public class LAMBDAAAA {
	public static void main(String[] args) {
		G1 g1Obj = (a,b) -> a>b?a:b;
		Smal s1rObj = (a,b) -> a<b?a:b;
		OdEv odevObj = (a) -> a%2==0?"Even":"Odd";
		Pri printttObj = (s) ->System.out.println(s);
		 Sumofnas sumN1Obj = (n) -> {
			int sum=0;
			while(n>0) sum+=n--;
			return sum;
		};
		System.out.println("The odd/even is: "+odevObj.odEv(64));
		System.out.println("The smaller among the two is: "+s1rObj.smal(30,98));
		System.out.println("the greater among the two is: "+g1Obj.g1(30,98));
		System.out.println("Sum of 100: "+sumN1Obj .sumofnas1(100));
		printttObj.print("Hello World");
		
	}
}
