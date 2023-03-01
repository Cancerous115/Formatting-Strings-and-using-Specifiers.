class Main {
  public static void main(String[] args) {
    String name = "johnathan.";//%s
    String job = "Software Engineer";//%s
    int age = 32;//%d
    String company = "Microsoft.";//%s

    //Instead of using System.out.printl("Hi,I am"+name+"I am a"+job+"and work for"+copmany+"I am"+age+"years old");we can format it and then insert that into our System.out.println. 
    //identify Strings as "%s"
    //integers as "%d"
    //Floats as "%f"
    //Character "%c"
    //Boolean "%b"
    String formattedString= String.format("HI, I am %s. I am a %s.I am %d years old and work for %s.",name,job,age,company);
    System.out.println(formattedString);
  }   
         
}