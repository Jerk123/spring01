package net.wanho;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Jerk on 2019/5/28.
 */
public class TestHello {
    private static Logger logger = Logger.getLogger(TestHello.class);
    public static void main(String[] args) {
//        HelloWorld helloWorld=new HelloWorld();
//        helloWorld.setName("张三");
//        helloWorld.hello();
//        创建Spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
////       从容器中获取helloworld的实力
//        HelloWorld hw = (HelloWorld) ctx.getBean("hw");
//
//        hw.hello();
//
//        logger.debug("debug");
//        logger.info("info");
//        logger.warn("warn");
//        logger.error("error");

//
//        Student stu = (Student) ctx.getBean("stu");
//        System.out.println("属性注入:"+stu);
//
//        Student stu2 = (Student) ctx.getBean("stu2");
//        System.out.println("构造方法:"+stu2);

        /*Student stu3 = (Student) ctx.getBean("stu3");
        System.out.println("字面值ref:"+stu3);*/
/*
        Student stu4 = (Student) ctx.getBean("stu4");
        System.out.println("list:"+stu4);*/

/*        Student stu5 = (Student) ctx.getBean("stu5");
        System.out.println("set:"+stu5);*/

        /*Student stu6 = (Student) ctx.getBean("stu6");
        System.out.println("map:"+stu6);*/

        /*Student stu7 = (Student) ctx.getBean("stu7");
        System.out.println("properties:"+stu7);*/

        /*Student stu8= (Student) ctx.getBean("stu8");
        System.out.println("util命名空间:"+stu8);
*/
        /*Student stu11= (Student) ctx.getBean("stu11");
        System.out.println("p命名空间:"+stu11);*/

        Student stu12= (Student) ctx.getBean("stu12");
        System.out.println("p命名空间:"+stu12);
    }
}
