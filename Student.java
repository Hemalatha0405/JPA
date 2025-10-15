package org.example;

public class Student {
   private int age;
   private int rollno;
   Pen pen=new Pen();


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter is called by spring");
        if (age<=0)age=0;
        else this.age = age;
    }

    public void show(){
        System.out.println("In show method");
    }
    public void writeExam(){
        pen.write();

    }
}
