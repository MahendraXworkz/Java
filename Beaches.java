class Beaches{
	static String beachNames[]={null,null,null,null,null};
	static int index;
	static boolean addBeachName(String beachName){
		if(beachNames.length>index){
			beachNames[index]=beachName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+beachName+" cannot be added to beach name list");
			
		}
		return false;
	}
	static void getBeachNames(){
		for(int i=0;i<beachNames.length;i++){
			String ref=beachNames[i];
			System.out.println(ref);
		}
	}
}