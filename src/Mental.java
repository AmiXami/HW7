public class Mental extends Player implements SuperAbility {
    public String attribute = "Telekinesis";

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }


    @Override
    public void useSuperAgility() {
        System.out.println("Use" +"life Steal");
    }
}
