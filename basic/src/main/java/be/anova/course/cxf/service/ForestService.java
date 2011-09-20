package be.anova.course.cxf.service;

import be.anova.course.cxf.Forest;
import be.anova.course.cxf.Tree;

import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Service to access information about a forest
 */
// START SNIPPET: sei
@WebService
public interface ForestService {

    public String getForestName();

    public Tree[] getTrees();

    public Forest getForest();

}
// END SNIPPET: sei
