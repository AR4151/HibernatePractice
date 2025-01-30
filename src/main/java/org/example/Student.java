package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
* @Entity class = Table in the database
  Instance of @Entity class = Row in the table
  Fields in the @Entity class = Columns in the table
  *
  * The @Entity annotation indicates that this class is a persistent entity.
    The @Id annotation specifies the primary key of the entity.
* */

@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int age;
    Student(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }



    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

    }


}
