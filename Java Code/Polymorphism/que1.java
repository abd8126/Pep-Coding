class ques1{
    //String show()
    Object show()
    {
        System.out.println("1");
        return null;
    }
}
class xyz extends ques1{
    //Object show(){
    String show()
    {
        //show() in xyz cannot override show() in ques1
        System.out.println("2");
        return null;    
    }
        public static void main(String[] args) {
            ques1 t = new ques1();
            t.show();
            xyz x = new xyz();
            x.show();
        }
}
