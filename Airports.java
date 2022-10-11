class Airports{
	static String airportNames[]={null,null,null,null,null};
	static int index;
	static int findCount=0;
	
	static boolean addAirportName(String airportName){
		System.out.println("start of addAirportName()");
		if(airportNames.length>index){
			airportNames[index]=airportName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+airportName+" cannot be added to Airport name list");
		}
		System.out.println("end of addAirportName()");
		return false;
	}
	static void getAirportNames(){
		for(int i=0;i<airportNames.length;i++){
			String ref=airportNames[i];
			System.out.println(ref);
		}
	}
	
	static void findAirportName(String airportName){
		System.out.println("start of findAirportName()");
		if(airportName!=null && airportName!=""){
			for(int i=0;i<airportNames.length;i++){
				if(airportName==airportNames[i]){
					System.out.println(airportNames[i]);
				}else{
					findCount++;
				}
			}
		}else{
			System.out.println("Invalid Entry");
		}
		if(findCount>){
			System.out.println("Airport name not found");
			System.out.println("end of findAirportName()");
		}
	}
	
	// update
	static void updateAirportName(String oldName, String newName){
		System.out.println("start of updateAirportName()");
		 int updateCount=0;
		if(oldName!=null && oldName!="" && newName!=null && newName!="" ){
			for(int i=0;i<airportNames.length;i++){
				if(airportNames[i]==oldName){
					airportNames[i]=newName;
				}else{
				updateCount++;
				}
			}
		}else{
			System.out.println("Invalid Entry");
		}
		if(updateCount>=airportNames.length){
			System.out.println("Can't be updated");
		}
		System.out.println("end of updateAirportName()");
	}
	
	static void updateAirportName(int indexNumber, String newName){
		System.out.println("start of updateAirportName()");
		 int updateCount=0;
		if(newName!=null && newName!=""){
			for(int i=0;i<airportNames.length;i++){
				if(i==indexNumber){
					airportNames[i]=newName;
				}else{
				updateCount++;
				}
			}
		}else{
			System.out.println("Invalid Entry");
		}
		if(updateCount>=airportNames.length){
			System.out.println("Can't be updated");
	}
	System.out.println("end of updateAirportName()");
	}
}