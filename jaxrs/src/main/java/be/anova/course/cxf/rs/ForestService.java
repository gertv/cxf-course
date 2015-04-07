package be.anova.course.cxf.rs;

import be.anova.course.cxf.Forest;
import be.anova.course.cxf.Tree;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * RESTful forest service implementation
 */
// TODO: add annotations and service methods
public class ForestService {

    private Forest forest;

    public void setForest(Forest forest) {
        this.forest = forest;
    }


}
