public class Fish extends Animal{

  public Fish(String type, String size, double weight) {
    super(type, size, weight);
    //TODO Auto-generated constructor stub
  }

  @Override
  public void move(String speed) {
    if(speed.equals("Slow"))
    {
      System.out.println(getEmplicitype()+"Lazily swimming");
    }
    else
    {
      System.out.println(getEmplicitype() + "Darting frantially");
    }
  }

  @Override
  public void makenoise() {
    if(type=="Goldfish")
    {
      System.out.println("Swish");
    }
    else
    {
      System.out.println("Splash");
    }
  }



  
}
