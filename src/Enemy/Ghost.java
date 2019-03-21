package Enemy;

public class Ghost extends Enemy {

    private boolean invisibility;

    public void invisibility() {
        System.out.println("My invisibility is set to: " + invisibility);
    }

    public void setInvisibility(boolean invisibility) {
        this.invisibility = invisibility;
    }
}
