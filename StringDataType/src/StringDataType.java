
public class StringDataType {

	public static void main(String[] args) {
		
		String myString = "This is first String";
		System.out.println(myString);
		
		// concat two string 
		String anotherString = ", This is second string";
		
		System.out.println(myString + anotherString);
		
		//concat with unicode
		System.out.println(myString + " \u00A92015");

	}

}
