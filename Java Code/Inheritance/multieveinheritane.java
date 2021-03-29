class A{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

class B extends A{
    int b = 10;
    void showB() {
        System.out.println("b = "+b);
    }
}

public class C extends B{
    
public static void main(String[] args) {
    C c = new C();
    c.show();
    c.showB();  
    }
}