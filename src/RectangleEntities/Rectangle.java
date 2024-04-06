package RectangleEntities;

public class Rectangle {
    public double width;
    public double height;

    public double area() { //calculo area do retângulo
        return width * height;
    }

    public double perimeter() { //calculo perímetro do retângulo
        return 2 * (width + height);
    }

    public double diagonal() { //calculo diagonal do retângulo
        return Math.sqrt(width * width + height * height);
    }

}