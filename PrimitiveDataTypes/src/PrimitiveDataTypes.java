
public class PrimitiveDataTypes {

	public static void main(String[] args) {
	
		int integerValue = 10;   // 2^31
		
		byte byteValue =20;      // 2^7
		
		short shortValue = 30;   // 2^15
		
		long longValue = 40L;    //   2^63  // we put L or l ate the end of Long values 
		
		
		byte anotherByteValue = (byte) (10 + byteValue);  //casted integer value into byte
		
		short anotherShortValue = (short) (10 + shortValue);  // casted integer value into short 
		
		long anotherLongValue = 10 + longValue;   // long doesnt need casting 

	}

}
