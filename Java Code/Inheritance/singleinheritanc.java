class A{
    int a = 10;
    void show() {
        System.out.println("a = "+a);
    }
}

public class B extends A{
    
public static void main(String[] args) {
    B b = new B();
    b.show();
        
    }
}