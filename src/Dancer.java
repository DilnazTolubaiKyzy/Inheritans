public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing(){
        System.out.println("Dancing");
    }

    @Override
    public void learn() {
        System.out.println("Dancer learning");
    }

    @Override
    public void walk() {
        System.out.println("Dancer walking");
    }

    @Override
    public void eat() {
        System.out.println("Dancer eating");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name:'" + getName() + '\'' +
                ", designation:'" + getDesignation() + '\'' +
                "companyName:'" + getGroupName() + '\'' +
                '}';
    }
}
