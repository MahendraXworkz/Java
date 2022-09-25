class RailwayStation{
	static String stationName;
	static String destination;
	static boolean expressTrainAvailability;
	static boolean passengerTrainAvailability;
	static int noOfPlatforms;
		public static void setStationName(String stationNam){
			stationName=stationNam;
		}
		public static String getStationName(){
			return stationName;
		}
		public static void setDestination(String distance){
			destination=distance;
		}
		public static String getDestination(){
			return destination;
		}
		public static void setExpressTrainAvailability(boolean express){
			expressTrainAvailability=express;
		}
		public static boolean getExpressTrainAvailability(){
			return expressTrainAvailability;
		}
		public static void setPassengerTrainAvailability(boolean passenger){
			passengerTrainAvailability=passenger;
		}
		public static boolean getPassengerTrainAvailability(){
			return passengerTrainAvailability;
		}
		public static void setNoOfPlatforms(int platforms){
			noOfPlatforms=platforms;
		}
		public static int getNoOfPlatforms(){
			return noOfPlatforms;
		}
		
}