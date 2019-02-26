
public class FloatAndDouble {

	public static void main(String[] args) {
		
		// width of 32 byte
		int myIntegerValue = 5/3;
		
		//width of 32 byte
		float myFloatValue = (float) (5/3);  // or (5f / 3f)

		//width of 64 byte
		double myDoubleValue = (double) (5/3); // or (5d / 3d);
		
		// float has precision upto 7 decimal and double has precision upto 32 decimal
		
		
		//excercise
		//Convert pounds to kilograms
		
		double pounds = 200d;
		double kilograms = pounds * 0.45359237d;
		
		System.out.println("Converted Kilogams :"+kilograms);
		
	}

}
