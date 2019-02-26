class vehicle
{
 int passangers;
 int fuelcap;
 int mpg;
 
 int range()
 {
	 return fuelcap*mpg;
 }
}

public class AddMeth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle minivan = new vehicle();
		vehicle sportcar = new vehicle();
		
		minivan.passangers=7;
		minivan.fuelcap=16;
		minivan.mpg=21;
		
		sportcar.passangers=2;
		sportcar.fuelcap=14;
		sportcar.mpg=12;
		
		System.out.println("minivan passanger capicity is "+minivan.passangers+" and minivan range is "+minivan.range());
		System.out.println("sportacr passanger capicity is "+sportcar.passangers+" and sportcar range is "+sportcar.range());
		
			
	}

}
