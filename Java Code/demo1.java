class demo1{
	void eat()
	{
		System.out.println("I am Eating");
	}

public static void main (String[] args){
	System.out.println("Main Method Executed");
	demo1 a1 = new demo1();
	a1.eat();
	demo2 a2 = new demo2();
	a2.fly();
}
void run(){
	System.out.println("i am running");
}
}

class demo2{
	void fly(){
		System.out.println("i am flying in another class");
	}
}
