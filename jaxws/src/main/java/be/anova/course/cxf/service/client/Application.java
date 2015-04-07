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

        // TODO: grab a client from the Spring context (e.g. using .getBean(String, Class)
        //       or create it from code
        // TODO: invoke a few service methods to ensure things are working fine

    }

}
