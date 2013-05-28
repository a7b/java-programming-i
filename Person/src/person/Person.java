/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author TQNINH
 */
//public final class Person//Khong cho tao con
class MyMath
{
    public static double area(double r)
    {
        return Math.PI * r * r;
    }
    
    public static double area(double len, double wid)
    {
        return len * wid;
    }
    
    public static int area(int n)
    {
        return n * n;
    }
}

public abstract class Person
{    
    String code;
    String name;
    
    //final void display() //khogn cho override
    void display()
    {
        //System.out.println("Hello Person!");
        System.out.println("Code:\t" + code + "\nName:\t" + name);
    }
    
    void display(String str)//overloading display
    {
        System.out.println(str);
    }
    
    abstract double add(double a, double b);
    
    public Person()
    {
        code = "";
        name = "";
    }
    
    public Person(String c, String n)
    {
        code = c;
        name = n;
    }
}

class Employee extends Person
{
    double salary;
    public Employee()
    {
        //new Person(); -> super();
        super();
    }
    
    public Employee(String c, String n, double s)
    {
        //new Person(c, n); -> super(String c, String n)
        super(c, n);
        salary = s;
    }
    
    public void display()//Override phuong thuc cua lop cha
    {
        super.display();
        System.out.println("Salary:\t" + salary);
    }
    
    public double add(double a, double b)
    {
        return (a + b);
    }
}

abstract class Teacher extends Person
{
    public void display()
    {
        System.out.println("Hello World");
    }
    //public double add(double a, double b)
    //{
    //    return (a + b);
    //}
}

class Test
{
    public static void main(String[] args)
    {
        //Person p = new Person();
        //Object o = new Object();//Kiem tra cac thuoc tinh cua class Object
        Employee e1 = new Employee("E001", "Quoc Ninh", 1200);
        e1.display();
        System.out.print("\n");
        
        //Person p1 = new Person("E002", "Thanh Luan");//Person la abstract nen khong the khoi tao
        //p1.display();
        //p1.display("abc");
        //System.out.print("\n");
        
        Person p2 = new Employee("E003", "Ngoc Trinh", 2000);
        p2.display();
        System.out.print("\n");
        
        //Employee e2 = new Person();//Khong the tao con tro vao cha
        
        //Teacher t1 = new Teacher();//Teacher la truu tuong roi
        //t1.display();
        
        //System.out.println(area(5));
        
        //p1.add
    }
}