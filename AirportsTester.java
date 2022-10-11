class AirportsTester{
	public static void main(String []args){
		Airports.addAirportName("Mangalore International Airport");
		Airports.addAirportName("Kempegowda International Airport");
		Airports.addAirportName("Belagavi Airport");
		Airports.addAirportName("Hubballi Airport");
		Airports.addAirportName("Kalaburagi Airport");
		Airports.getAirportNames();
		Airports.addAirportName("Mysore Airport");
		Airports.findAirportName("Hubballi Airport");
		Airports.getAirportNames();
		
		//update
		Airports.updateAirportName("Mangalore International Airport","Mangalore International Airport");
		Airports.getAirportNames();
		Airports.updateAirportName("Mangalore International irport","Mangalore International Airport");
		Airports.updateAirportName(0,"Mangalore International Airport");
		Airports.getAirportNames();
		Airports.updateAirportName("Mangalore International irport","Mangalore International Airport");
	}
}