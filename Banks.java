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
}