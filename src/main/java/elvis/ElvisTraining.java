package elvis;

import javax.jws.Oneway;
import java.util.Random;

class Constructor {
    static int param1;
    static int param2;

    {
        param1 = param2 * 3 + 4;
        String text = "wyliczanka";
        System.out.println(text + param1);
        Random random = new Random();


    }

    int age=2;
    String name;

    {
        name = "Bezimienny";
    }

    public Constructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Constructor(int param3) {
        this.age = age * param3;

    }

    public static int getParam2() {
        return param2;
    }

    public static void setParam2(int param2) {
        Constructor.param2 = param2;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class ElvisTraining {

    public static void main(String[] args) {
        boolean condition = false, condition2 = true;
        String text;
        System.out.println(condition);
        text = condition ? "prawdziwy" : condition2 ? "Prawie prawdziwy" : "Prawie fałszywy";

        System.out.println(text);

        Constructor.getParam2();
        Constructor.setParam2(44);
        Constructor constructor = new Constructor(5);
        Constructor constructor1 = new Constructor(33, "Jasio");
        Constructor constructor2 = new Constructor(8);


        System.out.println(constructor.getAge());
        System.out.println(constructor.getName());
        System.out.println(constructor.toString());
        System.out.println(constructor1.toString());
        System.out.println("Obywatel" + constructor2.getName()+constructor2.toString());
        constructor2.setName("Witold");
        System.out.println("Obywatel" + constructor2.getName()+constructor2.toString());


    }


}
