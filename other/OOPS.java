public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // created a pen object called p1
        
        // p1.setColor("blue");
        // System.out.println(p1.getColor());

        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // p1.setColor("yellow");
        // System.out.println(p1.getColor());

        // Student s1 = new Student();
        // s1.name = "shradha";
        // s1.rollNo = 22;
        // s1.password = "abc123";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 0;

        // for(int i=0; i<3; i++) {
        //     System.out.println(s2.marks[i]);
        // }

        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();

        Complex c = new Complex(4,5);
        Complex d = new Complex(9,4);

        Complex e = Complex.add(c,d);
        Complex f = Complex.diff(c,d);
        Complex g = Complex.prod(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}

class Complex {
    int real;
    int imag;
    
    public Complex(int r, int i) {
        real = r;
        imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public static Complex prod(Complex a, Complex b) {
        return new Complex((a.real*b.real)-(a.imag*b.imag),((a.real*b.imag)+(a.imag*b.real)));
    }

    public void printComplex() {
        if(real == 0 && imag != 0) {
            System.out.println(imag + "i");
        }
        else if(imag == 0 && real != 0) {
            System.out.println(real);
        }
        else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int[] marks;

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for(int i=0; i<marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return  this.color;
    }

    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("eat");
    }
    void breathe() {
        System.out.println("breathe");
    }
}

// derived class / sub-class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

class Mammal extends Animal {
    int legs;
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Shark extends Fish {
    void fin() {
        System.out.println("fins");
    }
}

class Peacock extends Bird {
    void feather() {
        System.out.println("feathers");
    }
}

class Dog extends Mammal {
    void tail() {
        System.out.println("tails");
    }
}