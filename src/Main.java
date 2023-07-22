public class Main {
    public static void main(String[] args) {
//        Cat cat=new Cat();
//        cat.cat();
//        Dog dog=new Dog();
//        dog.dog();
//        A a=new A(100);
//        a.getBalance(100);
//        B b=new B(200);
//        b.getBalance(200);
//        C c=new C(150);
//        c.getBalance(150);
        System.out.println("Triangle:");
        Triangle triangle=new Triangle(5,5,3);
        triangle.calculatePerimeter();
        triangle.calculateArea();
        System.out.println();
        System.out.println("Circle:");
        Circle circle=new Circle(3,3);
        circle.calculatePerimeter();
        circle.calculateArea();

    }
}