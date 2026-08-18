public abstract class Shape{  //abstract class
    private String color;
    public Shape(String color){ //parameterized constructor
        this.color

    }
    public String getColor(){ //encapsulation
        return color;
    }
    public abstract double calculateArea(); //abstract method
}
public class Circle extends Shape{ //inheritance
    private double radius;
    public Circle(String color, double radius){ //parameterized constructor
        super(color);
        this.radius = radius;
    }
    @Override //method overriding
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
public class Rectangle extends Shape{ //inheritance
    private double width;
    private double height;
    public Rectangle(String color, double width, double height){ //parameterized constructor
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea(){ 
        return width * height;
    }
}
public class Practice{ //main class
    public static void main(String[] args) {
    
}