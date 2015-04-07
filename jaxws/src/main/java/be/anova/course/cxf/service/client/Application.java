package be.anova.course.cxf.service.client;

import be.anova.course.cxf.Tree;
import be.anova.course.cxf.service.ForestService;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * An application that can act as a simple web service client
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

        ClientProxyFactoryBean bean = new JaxWsProxyFactoryBean();
        bean.setServiceClass(ForestService.class);
        bean.setAddress("http://localhost:8080/Forest");
        ForestService client = bean.create(ForestService.class);
        System.out.println(factory.getForest().getName());
        for (Tree tree : factory.getTrees()) {
            System.out.printf("Tree: %s%n", tree.getSpecies());
        }
    }

}
