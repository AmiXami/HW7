public class Warrior extends Player implements SuperAbility {
    public String attribete = "Blur";

    public String getAttribete() {
        return attribete;
    }

    public void setAttribete(String attribete) {
        this.attribete = attribete;
    }

    @Override
    public void useSuperAgility() {
        System.out.println("Use"+"Splash Damage");
    }
}
