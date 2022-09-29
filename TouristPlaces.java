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
}