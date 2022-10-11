class Beaches{
	static String beachNames[]={null,null,null,null,null};
	static int index;
	static boolean addBeachName(String beachName){
		System.out.println("Inside addBeachName()");
		if(beachNames.length>index && beachName!=null && beachName!=""){
			beachNames[index]=beachName;
			index++;
		return true;
		}else{
			System.out.println("Max data limit reached "+beachName+" cannot be added to beach name list");
			
		}
		System.out.println("Outside addBeachName()");
		return false;
	}
	static void getBeachNames(){
		for(int i=0;i<beachNames.length;i++){
			String ref=beachNames[i];
			System.out.println(ref);
		}
	}
	static void findBeachName(String beachName){
		if(beachName!=null && beachName!=""){
		for(int i=0;i<beachNames.length;i++){
			if(beachNames[i]==beachName){
			String ref=beachNames[i];
			System.out.println(ref);	
			}else{
				System.out.println("Beach not found");
			}
			
		}
		}
	}
	
	static boolean updateBeachName(String oldBeachName, String newBeachName){
		if(oldBeachName!=null && newBeachName!=null){
			for(int i=0;i<beachNames.length;i++){
				if(oldBeachName==beachNames[i]){
				beachNames[i]=newBeachName;
				return true;
			}
			}
			
		}
		return false;
	}
	
	/*static boolean updateBeachName(String newBeachName, int existingIndex){
		if(existingIndex<0 || existingIndex>=beachNames.length){
			System.out.println("No such index available in the array");
			return true;
		}else{
			if(newBeachName!="" && newBeachName!=null){
			beachNames[existingIndex]=newBeachName;
			return true;
		}else{
			System.out.println("Invalid input");
			return false;
		}
		}
		//return false;
	}
	*/
	static boolean updateBeachName(String newBeachName, int existingIndex){
		if(newBeachName!=null && newBeachName!=""){
			for(int i=0;i<beachNames.length;i++){
				if(i==existingIndex){
					beachNames[i]=newBeachName;
					return true;
				}
			}
		}
		return false;
	}
	// Delete 
	/*
	static boolean deleteBeachName(String beachName){
		if(beachName!=null && beachName!=""){
			for(int i=0;i<beachNames.length;i++){
				if(beachNames[i]==beachName){
					beachNames[i]=null;
				return true;
				}else{
				System.out.println("Beach not found");
				}
			}
		}
	return false;
	}
	
	static boolean deleteBeachName(int existingIndex){
			for(int i=0;i<beachNames.length;i++){
				if(i==existingIndex){
					beachNames[i]=null;
					return true;
				}
			}
		return false;
	} */
}