import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String args[]) {
        System.out.println("---------------------------");
        System.out.println("Test for Circle class");
        Circle circle = new Circle();
        circle.setRadius(15);
        circle.setColor("green");
        System.out.println(circle.toString());
        System.out.println("area=" + circle.getArea());

        System.out.println("-----------------------------");
        System.out.println("Test for Rectangle class");
        Rectangle rectangle = new Rectangle(55, 66);
        System.out.println("perimeter: " + rectangle.getPerimeter());
        System.out.println("area: " + rectangle.getArea());
        System.out.println(rectangle.toString());

        System.out.println("-----------------------------");
        System.out.println("Test for Emploee class");
        Emploee emploee = new Emploee(13, "Bruce", "Lee", 2000);
        System.out.println(emploee.toString());
        System.out.println("Bruce Lee's annual salary is: " + emploee.getAnnualSalary());

        System.out.println("---------------------------");
        System.out.println("Test for Book class");
        Author ilfPetrov[] = new Author[2];
        Author ilf = new Author();
        ilfPetrov[0] = ilf;
        Author petrov = new Author();
        ilfPetrov[1] = petrov;

        ilfPetrov[0].setName("Ilya Ilf");
        ilfPetrov[0].setEmail("IlyaIlf@yandex.ru");
        ilfPetrov[0].setGender('m');
        ilfPetrov[1].setName("Evgeniy Petrov");
        ilfPetrov[1].setEmail("EvgeniyPetrov@google.com");
        ilfPetrov[1].setGender('m');

        Book twelveChairs = new Book("Twelve Chairs", ilfPetrov, 150, 5000);
        System.out.println(twelveChairs.toString());

        System.out.println("----------------------------");
        System.out.println("Test for MyPoint class");
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(5, 6);
        System.out.println(point1.toString());
        System.out.println(point1.distance(15, 45));
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance());

        System.out.println("----------------------------");
        System.out.println("Test for MyTriangle");
        MyPoint p1 = new MyPoint(-1, 0);
        MyPoint p2 = new MyPoint(0, 3);
        MyPoint p3 = new MyPoint(1, 0);
        MyTriangle triangle = new MyTriangle(p1, p2, p3);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());

        System.out.println("---------------------------");
        System.out.println("Test for MyComplex class");
        MyComplex complex1=new MyComplex(5,7);
        MyComplex complex2=new MyComplex(-8,-9);
        System.out.println("complex1 equals complex2: "+complex1.equals(complex2));
        System.out.println("complex1+complex2: "+complex1.add(complex2));
        System.out.println("complex1 divided by complex2: "+complex1.divide(complex2));
        System.out.println("complex1 conjugate: "+complex1.conjugate(complex1));
        System.out.println("complex1 has a real part: "+complex1.isReal());
        System.out.println("complex1 has imaginary part: "+complex1.isImaginary());

        System.out.println("----------------------------");
        System.out.println("Test for MyPolinomial");
        MyPolynomial myPolynomial1=new MyPolynomial(2,4,6,8,9);
        MyPolynomial myPolynomial2=new MyPolynomial(5,7,9);
        System.out.println("first object getDegree: "+myPolynomial1.getDegree());
        System.out.println(myPolynomial1.toString());
        System.out.println("myPolynomial evaluate 5: "+myPolynomial1.evaluate(5));
        System.out.println("add: "+myPolynomial1.add(myPolynomial2));
        System.out.println("multiply: "+myPolynomial1.multiply(myPolynomial2));

        System.out.println("-----------------------------");
        System.out.println("Test for Ball class");
        Container container=new Container(-20,-10,40,20);
        Ball ball=new Ball(0,0,1,1,0);
        for(int i=0;i<50;i++){
            ball.move();
            if(!container.collidesWidth(ball)) ball.reflectHorizontal();
            if(!container.collidesHeight(ball)) ball.reflectVertical();
            System.out.println(ball);
        }

    }
}
