public class Dog extends Animal{

  public Dog(String type, String size, double weight) {
    super(type, size, weight);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void move(String speed) {
    if(speed.equals("Slow"))
    {
      System.out.println(getEmplicitype() + "Walking");
    }
    else
    {
      System.out.println(getEmplicitype() + "Running");
    }
  }
  

  @Override
  public void makenoise() {
    if(type=="Wolf")
    {
      System.out.println("Howling!");
    }
    else
    {
      System.out.println("Woof");
    }
  }
  // @Override
  // public String getEmplicitype()
  // {
  //   return "";
  // }



  
}
