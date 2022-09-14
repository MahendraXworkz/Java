class Truffles{
  public static void main (String[] args) {
    String hotelName = "Empire Hotel";
    String type="QSR - Quick Service Restaurant";
    String address ="Rajajinagara";
    String foodMenu[] ={"Truffles Special Cakes",
                        "\t Dutch Truffle",
                        "\t Ferrero Rocher",
                        "\t Almond and Chocolate Fudge Ring",
                        "\t Tiramisu Jar",
                        "\t Pineapple",
                        "\t Black Forest",
                        "\t Death By Chocolate (Eggless)",
                        "\t Raspberry & Chocolate Fantasy ",
                        "\t Kahlua Fantasy",
                        "\t Kitkat(EggIess)",
                        "\t Gooey Mud Cake",
                        "\t Hotch Potch",
                        "\t Red velvet",
                        "\t Orange Peach Meringue",
                        "\t Buzz(Honey Buzz)",
                        "\t Hazelnut Bomb Dark/ White ",
                        "\t Choco mousse ",
                        "\t Madagascar ",
                        "\t Strawberry Kiss",
                        "\t Mississippi Mud Pie ",
                        "\t Walnut Fudge Tart ",
                        "\t Chocolate Tart ",
                        "\t Red velvet Cup Cake ",
                        "\t Choco lava cake ",
                        "\t Marshmellows  ",
                        "Cheese Coke ",
                        "\t Baked Choco ",
                        "\t Irish Cream ",
                        "\t Blueberry  ",
                        "\t Oreo  ",
    };   
    
    String managersName[]={"Shivu M","Chethan","Varun","Ganesh","Abdul"
    };
     
    System.out.println("Hotel Name       :"+hotelName+"\n"+
                       "Address          :"+address+"\n"+
                       "Type             :"+type +"\n"+"\n"+
                       "List of Managers :");
      
    for(int i=0;i<managersName.length;i++){
      int a=i+1;
        System.out.println("Manager "+(a)+"   "+managersName[i]);
    }
    System.out.print("\n"+"Food Menu    :"+"\n");
    for(int a=0;a<foodMenu.length;a++){
        System.out.println(foodMenu[a]);
    }
    
    System.out.println("Number of Items in the food menu "+(foodMenu.length-2)); //2 Menu headings 
  }
}