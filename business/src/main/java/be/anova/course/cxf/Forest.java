package be.anova.course.cxf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

@XmlRootElement(name = "forest")
public class Forest {

    private String name;
    private List<Tree> trees = new LinkedList<Tree>();

    public Forest() {
        super();
    }

    public Forest(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTree(Tree tree) {
        trees.add(tree);
    }

    @XmlElementWrapper(name = "trees")
    @XmlElements(
            @XmlElement(name = "tree")
    )
    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }
}
