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
// TODO: annotations
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

    //TODO: implement interface

}

