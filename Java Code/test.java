/*
class test{ 
    int i ;
    String s;
    public static void main(String[] args) 
    {
     test t  = new test(); //default constructor is created and i will be 0
     System.out.println(t.i+" "+t.s);
    } 

}
*/
//No argunmet constructor
class test{ 
    test(){
        System.out.println("no argunmet constructor");
    }
    public static void main(String[] args) 
    {
     test t  = new test(); 
    } 
}




