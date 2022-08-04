//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
package stringg;

public class UmbrellaCheck {
	
	public static void main(String args[]) {
		
		String str="umbrella";
		for(int i =0;i<=str.length();i++) {
			
			if(str.charAt(i)== 'e') {
				System.out.println("Character e is found");
			}
		}
	}

}

//Create a Student with with 5 paramters and make this class generic
//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print
