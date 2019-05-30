package net.wanho;

/**
 * Created by Jerk on 2019/5/28.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hello() {
        System.out.println("hello:"+name);
    }
}
