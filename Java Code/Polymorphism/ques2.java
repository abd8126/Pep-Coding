class ques2{
    void show()
    {
        System.out.println("1");
    }
}
class xyz extends ques2{
    public void show()
    {
        System.out.println("2");  
        //Class names, 'xyz', are only accepted if annotation processing is explicitly requested 
    }
        public static void main(String[] args) {
            ques1 t = new ques1();
            t.show();
            xyz x = new xyz();
            x.show();
        }
}
