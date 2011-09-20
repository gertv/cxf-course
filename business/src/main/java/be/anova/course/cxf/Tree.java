package be.anova.course.cxf;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Tree {

    private String species;
    private int age;

    public Tree() {
        super();
    }

    public Tree(String species, int age) {
        super();
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
