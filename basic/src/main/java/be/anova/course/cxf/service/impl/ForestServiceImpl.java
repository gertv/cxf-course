package be.anova.course.cxf.service.impl;

import be.anova.course.cxf.Forest;
import be.anova.course.cxf.Tree;
import be.anova.course.cxf.service.ForestService;

import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * A {@link ForestService} implementation
 */
@WebService(endpointInterface = "be.anova.course.cxf.service.ForestService")
public class ForestServiceImpl implements ForestService {

    private Forest forest;

    public ForestServiceImpl() {
        super();
        forest = new Forest("Old Forest");
        forest.addTree(new Tree("Quercus Robur L.", 30));
        forest.addTree(new Tree("Castanea Sativa L.", 35));

    }

    public void setForest(Forest forest) {
        this.forest = forest;
    }

    public String getForestName() {
        return forest.getName();
    }


    public Tree[] getTrees() {
        return forest.getTrees().toArray(new Tree[forest.getTrees().size()]);
    }

    public Forest getForest() {
        return forest;
    }
}
