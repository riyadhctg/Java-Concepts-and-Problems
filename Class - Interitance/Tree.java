package riyadh.sharif;

/**
 * @author riyadh
 */

public class Tree {

    private String name;
    private String type;
    private Boolean isNative;
    

    public Tree(String name) {
        System.out.println("It is a Tree");
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsNative() {
        return isNative;
    }

    public void setIsNative(Boolean isNative) {
        this.isNative = isNative;
    }

    public void printDetails() {
        System.out.println("name= " + name + " type= " + type + " isNative?= " + isNative);
    }

}
