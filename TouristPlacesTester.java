class TouristPlacesTester{
	public static void main(String []args){
		TouristPlaces.addTouristPlacesName("Manali");
		TouristPlaces.addTouristPlacesName("Coorg");
		TouristPlaces.addTouristPlacesName("Andaman");
		TouristPlaces.addTouristPlacesName("Goa");
		TouristPlaces.addTouristPlacesName("Munnar");
		TouristPlaces.getTouristPlacesNames();
		TouristPlaces.addTouristPlacesName("Srinagar");
		TouristPlaces.getTouristPlacesNames();
		TouristPlaces.updateTouristPlaces(4,"Malnad");
		TouristPlaces.getTouristPlacesNames();
		TouristPlaces.updateTouristPlaces("Munnar","Malnad");
		TouristPlaces.getTouristPlacesNames();
		
		
		
	}
}