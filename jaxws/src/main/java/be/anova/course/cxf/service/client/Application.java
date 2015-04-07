package be.anova.course.cxf.service.client;

import be.anova.course.cxf.Tree;
import be.anova.course.cxf.service.ForestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: gert
 * Date: 11/09/11
 * Time: 14:47
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    public static final void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("client.xml");
        context.start();

        ForestService simple = context.getBean("simpleClient", ForestService.class);
        System.out.println(simple.getForestName());
        for (Tree tree : simple.getTrees()) {
            System.out.printf("Tree: %s%n", tree.getSpecies());
        }

        ForestService factory = context.getBean("factoryClient", ForestService.class);
        System.out.println(factory.getForestName());
        for (Tree tree : factory.getTrees()) {
            System.out.printf("Tree: %s%n", tree.getSpecies());
        }
    }

}
