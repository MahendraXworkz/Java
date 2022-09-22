class GarageTester{
 public static void main(String []args){
	 System.out.println("Inside menu()");
	 String[] vehicles={
			"AP 05 V 9444",
			"AP 05 TU 9307",
			"AP 05 TA 7013",
			"AP 05 W 9365",
			"AP 05 W 3080",
			"AP 05 V 5162",
			"AP 05 TX 4016",
			"AP 05 TB 3121",
			"AP 27 TV 1381",
			"AP 05 W 7956",
			"AP 05 TA 0806",
			"AP 37 TB 8981",
			"AP 31 TW 8944",
			"AP 05 W 1283",
			"KA 03 EY 0198",
			"AP 05 AF 2743",
			"AP 31 AP 4718",
			"AP 05 TX 5933",
			"AP 05 TB 3887",
			"AP 37 X 8068"};
	Garage.getVehicleNos(vehicles);
	System.out.println("Outside menu()");
 }
}