class Television{
	static boolean isConnected;
	
public static boolean onOrOff(){
	if(isConnected==false){
		isConnected=true;
		System.out.println("TV is turned on");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("TV is turned off");	
	}
	return isConnected;
}
}