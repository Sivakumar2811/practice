package Reflection;

import java.lang.reflect.Method;

interface Vechical{
    void speed();
}

class Cycle implements Vechical{
    @Override
    public void speed() {System.out.println("20-MPH");}
}

class Bike implements Vechical{
    @Override
    public void speed() {System.out.println("80-MPH");}
}

class Car implements Vechical{
    @Override
    public void speed() {System.out.println("160-MPH");}
}

class Bus implements Vechical{
    @Override
    public void speed() {System.out.println("120-MPH");}
}

class Train implements Vechical{
    @Override
    public void speed() {System.out.println("260-MPH");}
}

public class Example {
    public static void main(String[] args) throws Exception {
        String cl[] = {"Cycle","Bike","Car","Bus","Train"};

        for (String cn:cl)
        {
            Class c = Class.forName("Reflection."+cn);
            Method m = c.getMethod("speed");
            Object obj = c.newInstance();
            m.invoke(obj);
        }
    }
}
