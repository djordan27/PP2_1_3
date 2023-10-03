import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = ctx.getBean(HelloWorld.class);

        HelloWorld helloWorld2 = ctx.getBean(HelloWorld.class);
        Cat cat1 = ctx.getBean(Cat.class);

        Cat cat2 = ctx.getBean(Cat.class);
        System.out.println("helloWorld1 = helloWorld2 ? " + (helloWorld1 == helloWorld2));
        System.out.println("cat1 = cat2 ? " + (cat1 == cat2));
    }
}
