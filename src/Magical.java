public class Magical extends Player implements SuperAbility{
    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String attribute = "Fire";

    @Override
    public void useSuperAgility() {
        System.out.println("Use" + "Malediction");
    }
}
