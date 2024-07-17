public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(20);
        boss.setDefenceType("Magic");

        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: " + boss.getDamage() + " Boss defence type: " + boss.getDefenceType());


        createHeroes();
        for (Hero hero : createHeroes()) {
            System.out.println("Hero health: " + hero.getHealth() + " Hero damage: " + hero.getDamage() + " Hero super power: " + hero.getSuperPower());
        }

    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(50, 10, "Telekinesis");
        Hero hero2 = new Hero(60, 40);
        Hero hero3 = new Hero(100, 30, "Teleportation");
        return new Hero[]{hero1, hero2, hero3};
    }
}