public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("Sing a song");
    }
    public void playGuitar(){
        System.out.println("Play guitar");
    }

    @Override
    public void learn() {
        System.out.println("Singer learning");
    }

    @Override
    public void walk() {
        System.out.println("Singer walking");
    }

    @Override
    public void eat() {
        System.out.println("Singer eating");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name:'" + getName() + '\'' +
                ", designation:'" + getDesignation() + '\'' +
                "companyName:'" + getBandName() + '\'' +
                '}';
    }
}
