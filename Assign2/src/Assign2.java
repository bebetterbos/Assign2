import java.util.Scanner;
public class Assign2 {
    public static void main(String[] args) throws Exception {
        Rectangle calRectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width : ");
        calRectangle.width = scanner.nextFloat();
        System.out.print("Enter Length : ");
        calRectangle.length = scanner.nextFloat();
        System.out.println("\n********************************\n");
        System.out.println("width : " + calRectangle.width);
        System.out.println("length : " + calRectangle.length);
        System.out.println("Area of Rectangle : " + calRectangle.calArea());
        System.out.println("Perimeter of Rectangle : " + calRectangle.calPerimeter());
        
    }
}
class Rectangle{
    public float width;
    public float length;
    
    public float calArea(){
        return length*width;
    }

    public float calPerimeter(){
        return (width+length)*2;
    }
}
  


