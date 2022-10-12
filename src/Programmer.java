public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("Writing code");
    }

    @Override
    public void learn() {
        System.out.println("Programmer learning");
    }

    @Override
    public void walk() {
        System.out.println("Programmer walking");
    }

    @Override
    public void eat() {
        System.out.println("Programmer eating");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name:'" + getName() + '\'' +
                ", designation:'" + getDesignation() + '\'' +
                "companyName:'" + getCompanyName() + '\'' +
                '}';
    }
}
