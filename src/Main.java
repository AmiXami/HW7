public class Main {

    public static void main(String[] args) {
        
        Boss s1 = new Boss();
        s1.setHp(500);
        s1.setDamage(50);
        s1.setAttribute("Clap");

        Warrior p1 = new Warrior();
        p1.setHp(250);
        p1.setDamage(25);
        p1.setAttribete("Blur");

        Magical p2 = new Magical();
        p2.setHp(200);
        p2.setDamage(30);
        p2.setAttribute("Fire");

        Mental p3 = new Mental();
        p3.setHp(200);
        p3.setDamage(25);
        p3.setAttribute("Telekinesis");

    }
}
