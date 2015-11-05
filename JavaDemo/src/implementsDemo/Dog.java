package implementsDemo;

/**
 * Created by pm_zhangkuomac on 15/11/5.
 */

public class Dog extends Mammal {
    public static void main(String args[]){
        Mammal m = new Mammal();
        Dog d = new Dog();
        // 关键字instanceof用来检查确定是否       
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}

interface Animal{}
//implements关键字,是在类继承接口的时候使用的,接口是不能被类使用extents继承的.
class Mammal implements Animal{}