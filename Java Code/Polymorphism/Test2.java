class Test2{
    void show(String a, int a)//same argunmet in same order
    //void show(int a)//no.ofargunment same
    {
        System.out.println("Test method calling");
    }

}
class xyz extends Test2{
    void show(String a, int a)//same argunmet in same order
    //void show(int a)//no.ofargunment same
    {
        System.out.println("xyz method calling");
    }
    public static void main(String[] args) 
    {
        Test2 t= new Test2();
        t.show();
        xyz x = new xyz();
        x.show();
    }
}