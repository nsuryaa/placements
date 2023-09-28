abstract class Mammal extends Animal
{
  public Mammal(String type, String size, double weight) {
    super(type, size, weight);
    //TODO Auto-generated constructor stub
  }

  public abstract void shedHair();
  
}
public abstract class Animal
{
  protected String type;
  private String size;
  private double weight;
  public Animal(String type, String size, double weight) {
    this.type = type;
    this.size = size;
    this.weight = weight;
  }
  public abstract void move(String speed);
  // {
  //   System.out.println(getEmplicitype()+"");
  //   System.out.println(speed.equals(Slow)?"Walk":"Runs");
  // }


  public abstract void makenoise();
  public String getEmplicitype()
  {
    return getClass().getSimpleName()+"("+type+")";

  }


}