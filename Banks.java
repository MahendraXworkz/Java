class Banks{
	static String bankNames[]={null,null,null,null,null};
	static int index;
	static boolean addBanksName(String bankName){
		if(bankNames.length>index){
			bankNames[index]=bankName;
			index++;
		
		}else{
			System.out.println("Max data limit reached "+bankName+" cannot be added to bank name list");
			
		}
		return false;
		}
	static void getBanksNames(){
		for(int i=0;i<bankNames.length;i++){
			String ref=bankNames[i];
			System.out.println(ref);
		}
	}
	static void findBankName(String bankName){
		int findCount=0;
		if(bankName!=null && bankName!=""){
			for(int i=0;i<bankNames.length;i++){
				if(bankNames[i]==bankName){
					System.out.println("Data is in the index no : "+i+" \n"+bankNames[i]);
				}else{
				findCount++;
			}
			}
			if(findCount>0){
				System.out.println("No data to show");
			}
		}
	}
	
	static void updateBankName(String oldName,String newName){
		if(oldName!=null && oldName!="" && newName!=null && newName!="" ){
			for(int i=0;i<bankNames.length;i++){
				if(bankNames[i]==oldName){
					bankNames[i]=newName;
				}else{
					System.out.println("No such data to update");
				}
			}
		}else{
			System.out.println("Invalid Input");
		}
	}
	
	static void updateBankName(int indexNumber,String bankName){
		int updateCount=0;
		if(bankName!=null && bankName!=""){
			for(int i=0;i<bankNames.length;i++){
				if(indexNumber==i){
					bankNames[i]=bankName;
				}else{
					updateCount++;
				}
			}
		}else{
			System.out.println("Invalid entry");
		}
	}
	
	
}