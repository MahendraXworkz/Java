class Stadiums{
	static String stadiumNames[]={null,null,null,null,null};
	static int index;
	static boolean addStadiumName(String stadiumName){
		if(stadiumNames.length>index){
			stadiumNames[index]=stadiumName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+stadiumName+" cannot be added to stadium name list");
			
		}
		return false;
	}
	static void getStadiumNames(){
		for(int i=0;i<stadiumNames.length;i++){
			String ref=stadiumNames[i];
			System.out.println(ref);
		}
	}
}