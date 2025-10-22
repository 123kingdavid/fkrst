//public class pratice2 {
//    public static void main(String[] args) {
//        for (int i= 1; i <=5; i++){
//            System.out.println(i);
//        }
//
//        }
//    }
//

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class pratice2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound()

