class ShowRoomTester{
	public static void main(String []args){
		System.out.println("Inside menu()");
		String[] bikes={"Top 10 Budget bikes","Hero HF100",
		"Bajaj CT 100",
		"Hero HF Deluxe","Bajaj CT110",
		"Bajaj Platina 100",
		"TVS Sport",
		"Bajaj CT110X",
		"TVS Radeon",
		"Hero Splendor Plus","Bajaj Platina 110"};
	ShowRoom.getBestBudgetBikes(bikes);
	
		String[] cars={"Top 10 Budget Cars","Bajaj Qute",
		"Datsun Redi-GO",
		"Renault Kwid","Maruti Alto 800",
		"Maruti S-Presso",
		"Maruti Eeco",
		"Maruti Celerio",
		"Maruti Wagon R",
		"Hyundai Santro","Tata Tiago"};
	ShowRoom.getBestBudgetCars(cars);
	System.out.println("Outside menu()");
	}
	
}