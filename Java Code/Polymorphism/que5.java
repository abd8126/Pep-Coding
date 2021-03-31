// overridden and abstract method and interface
inferface l1{
    void show()
}//no need to write inteface keyword like abstraction
abstract class Test{
    abstract void display();
    void show() throws Runtime Exception
    {
        System.out.println("1");
    }
}
class xyz implements l1{
    public void show()
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        //que5 is not abstract and does not override abstract method display() in que4
        Test t = new Test();
        t.show();

        xyz x = new xyz();
        x.show();//2
        //x.display();//display method
        //abstract do not need to call
    }
}