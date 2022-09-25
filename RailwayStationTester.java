class RailwayStationTester{
	public static void main(String args[]){
		RailwayStation.setStationName("Chinnadagudihundi");
		RailwayStation.setDestination("200 km");
		RailwayStation.setExpressTrainAvailability(false);
		RailwayStation.setPassengerTrainAvailability(true);
		RailwayStation.setNoOfPlatforms(5);
			System.out.println(RailwayStation.getStationName() +" "+RailwayStation.getDestination() +" "+RailwayStation.getExpressTrainAvailability() +" "+RailwayStation.getPassengerTrainAvailability() +" "+RailwayStation.getNoOfPlatforms());
	}
}