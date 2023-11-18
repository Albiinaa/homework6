public class Main {
    public static void main(String[] args){
        Boss boss = new Boss(200,90);
        boss.setHealth(200);
        boss.setDamage(90);
        boss.weapon.setWeaponName("AWP");
        boss.weapon.setWeaponType(WeaponType.FIREARM);
        System.out.println(boss.info());

        Skeleton skeleton1 = new Skeleton(150,50);
        skeleton1.setHealth(150);
        skeleton1.setDamage(50);
        skeleton1.weapon.setWeaponName("KNIFE");
        skeleton1.weapon.setWeaponType(WeaponType.COLD_WEAPON);
        skeleton1.setNumberOfArrows(180);
        System.out.println(skeleton1.printInfo());

        Skeleton skeleton2 = new Skeleton(250,100);
        skeleton2.setHealth(250);
        skeleton2.setDamage(100);
        skeleton2.weapon.setWeaponName("OB");
        skeleton2.weapon.setWeaponType(WeaponType.CHEMICAL_WEAPON);
        skeleton2.setNumberOfArrows(200);
        System.out.println(skeleton2.printInfo());
    }
}