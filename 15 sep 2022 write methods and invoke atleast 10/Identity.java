class Identity{
  public static String name(String name){
	  return "Name :"+name+"\n";
  }
  public static String nameAndEmail(String name,String email){
	  return "Name :"+name+"   \nEmail:"+email+"\n";
  }
    public static String nameAndMobile(String name,long mobile){
	  return "Name :"+name+"   \nMobile:"+mobile+"\n";
  }
  /* if we provide return type as long 
  this error will come 
  error: incompatible types: String cannot be converted to long
          return name+"   Mobile :"+mobile;
                                   ^
1 error*/
  public static String nameAndAge(String name,int age){
	  return "Name :"+name+"   \nAge:"+age+"\n";
  }
  public static String nameAndAddress(String name,String address){
	  return "Name :"+name+"    \nAddress:"+address+"\n";
  }
  public static String nameAndEmailAndAddressAndAge(String name,
													String email,
													String address,
													int age){
	  return "Name :"+name+"  \nEmail:"+email+"    \nAddress:"+address+"\nAge:"+age+"\n";
  }
  public static String nameAndGender(String name,char gender){
	  return "Name :"+name+"    \nGender:"+gender+"\n";
  }
  public static String nameAndWorking(String name,boolean working){
	  return "Name :"+name+"    \nWorking:"+working+"\n";
  }
  public static String nameAndShirtSize(String name,char shirtSize){
	  return "Name :"+name+"    \nShirt Size:"+shirtSize+"\n";
  }
  public static String nameAndPantSize(String name,int pantSize){
	  return "Name :"+name+"   \nPant Size:"+pantSize+"\n";
  }
  public static String nameAndWeightAndHeight(String name,double weight,double height){
	  return "Name :"+name+"   \nWeight:"+weight+" kg   \nHeight:"+height+"cm \n";
  }
}