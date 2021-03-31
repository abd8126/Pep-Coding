// overridden and abstract method
abstract class que4{
    abstract void display();
    void show()
    {
        System.out.println("abstract method");
    }
}
class xyz extends que4{
    void display()
    {
        System.out.println("display method");
    }
    void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        //que4 is not abstract and does not override abstract method display() in que4
        //que4 q = new que4();
        //q.show();

        xyz x = new xyz();
        x.show();//2
        x.display();//display method
        //abstract do not need to call
    }
}