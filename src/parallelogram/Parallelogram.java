package parallelogram;

import org.w3c.dom.ls.LSInput;

public class Parallelogram {
    public int calculatePerimeter(int length, int width) {
        System.out.println("Perimetru = " + length * 2 + width * 2);
        return length * 2 + width * 2;
    }

    public int calculatePerimeter(int sideLength) {
        System.out.println("sideLength Perimeter = " + sideLength);
    return sideLength;
    }
    public double calculateArea(int length, int height) {
        System.out.println("Aria = " + length * height);
        return length * height;
    }
    public int calculateArea(int sideLength) {
        System.out.println("sideLength Aria = " + sideLength);
        return sideLength;
    }

}
