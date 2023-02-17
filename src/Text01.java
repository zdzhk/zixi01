public class Text01 {
    public static void main(String[] args) {
        Circle circle=new Circle(5);
        Cylinder cylinder=new Cylinder(5,6);
        circle.show();
        cylinder.showVolume();
    }
}
class Circle{
 //属性：半径
    private double radius;
//构造器
    public Circle() {
    }

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //获取圆的面积
    public double getArea(){
        double area=3.14*radius*radius;
        return  area;
    }
    //获取圆的周长
    public double getPerimeter(){
        double perimeter=2*3.14*radius;
        return perimeter;
    }
    public void show(){
        System.out.println("圆的半径为"+radius);
        System.out.println("圆的周长为"+getPerimeter());
        System.out.println("圆的面积为"+getArea());
    }

}
class Cylinder extends Circle{
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double radius, double hight) {
        super(radius);
        this.hight = hight;
    }
    //获取圆柱体的体积
    public double getVolume(){
        double volume=getPerimeter()*hight;
        return volume;
    }
    public void showVolume(){
        System.out.println("圆柱的体积为"+getVolume());
    }
}