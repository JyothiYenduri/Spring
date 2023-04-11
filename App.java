package MathFunctions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CalculatorService cs=(CalculatorService)context.getBean("CalSer");
        int a=10;
        int b=6;
        System.out.println("Addition value: "+cs.add(a, b));
        System.out.println("Subtraction value: "+cs.sub(a, b));
        System.out.println("Multiplication value: "+cs.mul(a, b));
        System.out.println("Division value: "+cs.div(a, b));
    }
}
