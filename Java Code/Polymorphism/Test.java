/*class Test{
    void show(){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.show();//compier get confuse when we have same mthod and don't defin argunment
    }
}
*/
/*
class Test{
    void show(int a){
        System.out.println("1");
    }
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.show(10);//here we define argunmen as integer so compiler  execut the code
    }
}
 */
class Test{
    void show(int a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("2");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.show("Anubhav");//here we define argunmen as integer as well as String but as caling in show we pass a
        // a sting so it will print 2
    }
}