public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String info(){
        return " BOSS HEALTH: " + getHealth() + " BOSS DAMAGE: "  + getDamage()
                + " BOSS WEAPON TYPE: " + weapon.getWeaponType();
    }
}
