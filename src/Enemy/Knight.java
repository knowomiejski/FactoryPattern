package Enemy;

public class Knight extends Enemy {

    private int armour;

    public void armour() {
        System.out.println("My armour is: " + armour);
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
