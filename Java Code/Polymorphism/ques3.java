class ques3{
    //void show () throws Runtime Exception 
    void show() throws Arthematic Exception  
    {
        System.out.println("1");
    }
}
class xyz{
    //void show() throws Exception
    void show() 
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        ques3 q = new ques3();
        q.show();
        xyz x = new xyz();
        x.show();
    }
}