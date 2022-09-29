class Airports{
	static String airportNames[]={null,null,null,null,null};
	static int index;
	static boolean addAirportName(String airportName){
		if(airportNames.length>index){
			airportNames[index]=airportName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+airportName+" cannot be added to Airport name list");
			
		}
		return false;
	}
	static void getAirportNames(){
		for(int i=0;i<airportNames.length;i++){
			String ref=airportNames[i];
			System.out.println(ref);
		}
	}
}