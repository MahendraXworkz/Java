class TeaStall{
	static int teastallId;
	static String name;
	static String address;
	static long contactNo;
	
		//setter and getter
		
		public static void setTeastallId(int id){
			teastallId=id;
			
		}
		 static int getTeastallId(){
			return teastallId;
		}
		 static void setName(String nam){
			name=nam;
		}
		public static String getName(){
			return name;
		}
		public static void setAddress(String vilasa){
			address=vilasa;
		}
		public static String getAddress(){
			return address;
		}
		public static void setContactNo(long cNo){
			contactNo=cNo;
		}
		public static long getContactNo(){
			return contactNo;
		}
}