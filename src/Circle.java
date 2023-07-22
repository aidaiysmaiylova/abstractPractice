public class Circle extends AbstractShape{
    private int a;
    private int b;

    public Circle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void calculateArea(){
        int a=getA()*getB();
        System.out.println((double) 3.14*a + ": Area");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(2*getA()+getB()+": Perimeter");
    }
}

