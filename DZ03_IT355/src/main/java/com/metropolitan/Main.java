package com.metropolitan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Kvadrat kvadrat = context.getBean(Kvadrat.class);
        Krug krug = context.getBean(Krug.class);
        JednakostranicniTrougao trougao = context.getBean(JednakostranicniTrougao.class);

        System.out.println("Obim kvadrata: " + kvadrat.obim());
        System.out.println("Površina kvadrata: " + kvadrat.povrsina());

        System.out.println("Obim kruga: " + krug.obim());
        System.out.println("Površina kruga: " + krug.povrsina());

        System.out.println("Obim trougla: " + trougao.obim());
        System.out.println("Površina trougla: " + trougao.povrsina());

        context.close();
    }
}

