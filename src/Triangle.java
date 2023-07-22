public class Triangle extends AbstractShape{
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double P=(getA()+getB()+getC())/2;
        double Area=P*(P-getA())*(P-getB())*(P*getC());
        System.out.println(Math.sqrt(Area));

    }

    @Override
    public void calculatePerimeter() {
        System.out.println(getA()+getB()+getC()+": Perimeter");

    }
}
