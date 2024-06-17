public class GrassPokemon extends Pokemon implements GrassAttack {
    public static String type = "grass";
    int damage;

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon attacker, Pokemon enemy) {
        switch (enemy.getType()) {
            case "fire":
                damage = 20;
                break;
            case "grass":
                damage = 10;
                break;
            case "electric":
                damage = 25;
                break;
            case "water":
                damage = 15;
                break;
        }

        // Print out attack message
        System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with leafStorm");

        // Update enemy's HP
        int newHp = enemy.getHp() - damage;
        enemy.setHp(newHp);

        // Print out effect message
        System.out.println(enemy.getName() + " loses " + damage + " hp");

        // Print out remaining HP message
        System.out.println(enemy.getName() + " has " + newHp + " hp left");
    }

    public void leechSeed(Pokemon attacker, Pokemon enemy) {
        switch (enemy.getType()) {
            case "fire":
                damage = 15;
                break;
            case "grass":
                damage = 5;
                break;
            case "electric":
                damage = 20;
                break;
            case "water":
                damage = 10;
                break;
        }

        // Print out attack message
        System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with leechSeed");

        // Update enemy's HP
        int newHp = enemy.getHp() - damage;
        enemy.setHp(newHp);

        // Heal the attacker
        int healedHp = attacker.getHp() + damage / 2;
        attacker.setHp(healedHp);

        // Print out effect message
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        System.out.println(attacker.getName() + " heals " + (damage / 2) + " hp");

        // Print out remaining HP message
        System.out.println(enemy.getName() + " has " + newHp + " hp left");
        System.out.println(attacker.getName() + " has " + healedHp + " hp now");
    }

    public void leaveBlade(Pokemon attacker, Pokemon enemy) {
        switch (enemy.getType()) {
            case "fire":
                damage = 25;
                break;
            case "grass":
                damage = 10;
                break;
            case "electric":
                damage = 15;
                break;
            case "water":
                damage = 20;
                break;
        }

        // Print out attack message
        System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with leaveBlade");

        // Update enemy's HP
        int newHp = enemy.getHp() - damage;
        enemy.setHp(newHp);

        // Print out effect message
        System.out.println(enemy.getName() + " loses " + damage + " hp");

        // Print out remaining HP message
        System.out.println(enemy.getName() + " has " + newHp + " hp left");
    }
}

