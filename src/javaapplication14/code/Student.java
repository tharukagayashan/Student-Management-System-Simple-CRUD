package javaapplication14.code;


public class Student {
    
    private int id;
    private String name;
    private int age;
    private String clss;
    private String mark;
    
    public Student(int id, String name, int age, String clss, String mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.clss = clss;
        this.mark = mark;
    }

    public Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getClss() {
        return clss;
    }

    public String getMark() {
        return mark;
    }
}
