class Test{
    void show()
    {
        System.out.println("1");
    }
}
class xyz extends Test{
    void show()
    {
        super.show();//calling the method of parent class with the help of chid class
        System.out.println("2");
    }
    public static void main(String[] args) {
        xyz x= new xyz();
        x.show();

    }
}


