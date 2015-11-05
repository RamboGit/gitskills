package extendsDemo;

/**
 * Created by pm_zhangkuomac on 15/11/5.
 */

//使用官架子extends,子类可以继承父类除了私有属性的所有属性,
public class Dog extends Mammal {
    public static void main(String args[]){
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}





