class Mobile{
	static boolean isConnected;
	
public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("Mobile is turned on");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Mobile is turned off");	
	}
	return isConnected;
}
}