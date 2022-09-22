class EmpireHotel{
  public static void main (String[] args) {
    String hotelName = "Empire Hotel";
    String type="5 Star Hotel";
    String address ="Rajajinagara";
    String foodMenu[] ={"Tawa Chicken","Chicken Tandoori Masala","Kadai Chicken","Kadai Chicken Boneless","Kadai Mutton","Kadai Mutton Boneless","Kadai Prawns","Hyderabadi Chicken","Hyderabadi Chicken Boneless","Mutton Varutharachathu","Mutton Varutharachathu Boneless","Mutton Coconut Fry","Mutton Coconut Fry Boneless","Mutton Onion Roast","Mutton Onion Roast Boneless","Kadai Fish","Chicken Mughlai"
    };   
    
    String managersName[]={"Shivu M","Chethan","Varun","Ganesh","Abdul"
    };
     
    System.out.println("Hotel Name       :"+hotelName+"\n"+ "Address          :"
      +address+"\n"+"Type             :"+type +"\n"+"\n"+"List of Managers :");
      
    for(int i=0;i<managersName.length;i++){
      int a=i+1;
        System.out.println("Manager "+(a)+"   "+managersName[i]);
    }
    System.out.println("Number of Managers ="+managersName.length);
    System.out.print("\n"+"Food Menu    :"+"\n");
    for(int a=0;a<foodMenu.length;a++){
        System.out.println(foodMenu[a]);
    }
  }
}