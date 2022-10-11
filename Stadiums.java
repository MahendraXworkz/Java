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
		System.out.println("Inside getStadiumNames()");
		for(int i=0;i<stadiumNames.length;i++){
			String ref=stadiumNames[i];
			System.out.println(ref);
		}
		System.out.println("Outside getStadiumNames()");
	}
	static void findStadium(String stadiumName){
		int findCount=0;
		if(stadiumName!=null && stadiumName!=""){
			for(int i=0;i<stadiumNames.length;i++){
				if(stadiumNames[i]==stadiumName){
				System.out.println("Index     Stadium Name\n"+                   i+"       "+stadiumNames[i]);
				}else{
					findCount++;
				}
			}
		if(findCount>=stadiumNames.length){
			System.out.println("No data found");
		}
		}else{
			System.out.println("Invalid entry");
		}
	}
	static void updateStadium(int indexNumber,String newName){
		int updateCount=0;
		if(newName!=null && newName!=""){
			for(int i=0;i<stadiumNames.length;i++){
				if(i==indexNumber){
					stadiumNames[i]=newName;
					}else{
						updateCount++;
					}
				}
				if(updateCount>=stadiumNames.length){
					System.out.println("Not updated");
				}
			}else{
				System.out.println("Invalid Entry");
			}
			
		}
	static void updateStadium(String oldName,String newName){
		System.out.println("start of updateStadium()");
		int updateCount=0;
		if(newName!="" && newName!=null){
			for(int i=0;i<stadiumNames.length;i++){
				if(oldName==stadiumNames[i]){
					stadiumNames[i]=newName;
				}
			}
		}else{System.out.println("Invalid entry");}
		System.out.println("end of updateStadium()");
	}
	
	
}