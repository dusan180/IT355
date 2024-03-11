package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Oblik kvadrat = context.getBean(Kvadrat.class);
        Oblik krug = context.getBean(Krug.class);
        Oblik trougao = context.getBean(JednakostranicniTrougao.class);

        // Prikaz podataka
        System.out.println("Kvadrat:");
        System.out.println("Obim: " + kvadrat.obim());
        System.out.println("Povrsina: " + kvadrat.povrsina());

        System.out.println("Krug:");
        System.out.println("Obim: " + krug.obim());
        System.out.println("Povrsina: " + krug.povrsina());

        System.out.println("Jednakostranicni trougao:");
        System.out.println("Obim: " + trougao.obim());
        System.out.println("Povrsina: " + trougao.povrsina());
    }
}

