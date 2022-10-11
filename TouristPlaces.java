class TouristPlaces{
	static String touristPlacesNames[]={null,null,null,null,null};
	static int index;
	static boolean addTouristPlacesName(String touristPlacesName){
		if(touristPlacesNames.length>index){
			touristPlacesNames[index]=touristPlacesName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+touristPlacesName+" cannot be added to touristPlaces name list");
			
		}
		return false;
	}
	static void getTouristPlacesNames(){
		for(int i=0;i<touristPlacesNames.length;i++){
			String ref=touristPlacesNames[i];
			System.out.println(ref);
		}
	}
	
	static void findTouristPlacesNames(String placeName){
		System.out.println("Start of findTouristPlacesNames()");
		if(placeName!=null && placeName!=""){
			for(int i=0;i<touristPlacesNames.length;i++){
				if(touristPlacesNames[i]==placeName){
				System.out.println("Index         Tourist Places \n"+
									i+"           "+touristPlacesNames[i]);
				}
			}
		}
		System.out.println("end of findTouristPlacesNames()");
	}
	static void updateTouristPlaces(String oldPlace,String newPlace){
		int updateCount=0;
		System.out.println("Start of updateTouristPlacesNames()");
		if(oldPlace!=""&&oldPlace!=null){
			
			for(int i=0;i<touristPlacesNames.length;i++){
				if(oldPlace==touristPlacesNames[i]){
					touristPlacesNames[i]=newPlace;
				}else{
					updateCount++;
				}
			}
		}else{
				System.out.println("Invalid entry");
				}
				
				if(touristPlacesNames.length>=updateCount){
					System.out.println("Not updated");
				}
	System.out.println("end of updateTouristPlacesNames()");
	}
	
	static void updateTouristPlaces(int indexNumber,String newName){
		System.out.println("Start of updateTouristPlacesNames()");
		int updateCount=0;
		if(newName!=null && newName!=""){
			for(int i=0;i<touristPlacesNames.length;i++){
				if(i==indexNumber){
					touristPlacesNames[i]=newName;
				}else{
					updateCount++;
				}
			}
			}else{
			System.out.println("Invalid entry");
			}
			System.out.println("end of updateTouristPlacesNames()");
	}
	
}