package org.example;

public class Sample {
    public static void main(String[] args) {
        System.out.println("hello sample");
        Person himanshu = new Person("Himanshu", 24);
        System.out.println(himanshu.name);
    }

    private static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
