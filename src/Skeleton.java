
public class Skeleton extends Boss{
    private int numberOfArrows;

    public Skeleton(int health, int damage) {
        super(health, damage);
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo() {
        return " SKELETON HEALTH: " + getHealth() + " DAMAGE: " + getDamage() +
                " WEAPON: " + getWeapon().getWeaponName() + " (" + getWeapon().getWeaponType() +
                "), ARROWS " + numberOfArrows;
    }
}
