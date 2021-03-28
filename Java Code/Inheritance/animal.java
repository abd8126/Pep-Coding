class animal
{
    public void eat(){
        System.out.println("eat is working");
    }
}
public class dog extends animal{
    public void run(){
        System.out.println("run is working");
    }
   public static void main (String[] args) {
        dog d = new dog();
        d.eat();
        d.run();
        System.out.println("Inheritance is woring");
    }
}