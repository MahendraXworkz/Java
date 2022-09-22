class ShowRoom{

	static void getBestBudgetBikes(String[] bikes){
		System.out.println("Inside getBestBudgetBikes()");
		for(int i=0;i<bikes.length;i++){
			System.out.println(i+" "+bikes[i]);
		}
		System.out.println("Outside getBestBudgetBikes()\n");
	}
	static void getBestBudgetCars(String[] cars){
		System.out.println("Inside getBestBudgetCars()");
		for(int i=0;i<cars.length;i++){
			System.out.println(i+" "+cars[i]);
		}
		System.out.println("Outside getBestBudgetCars()");
	}
	
}