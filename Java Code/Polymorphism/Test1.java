class Test1{
    void show(int a){
        System.out.println("int method");
    }
    void show(int...a){
        System.out.println("Vargs Method");
    }
    public static void main(String[] args) {
        Test1 t= new Test1();
        t.show(10);
        t.show(10,20,30);
        t.show(10,10.25f);
    }
}