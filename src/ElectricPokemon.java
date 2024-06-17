public class ElectricPokemon extends Pokemon implements ElectricAttack {
  public static String type = "electric";


  public ElectricPokemon(String name, int level, int hp, String food, String sound) {
    super(name, level, hp, food, sound);
  }


  @Override
  public void ThunderPunch(Pokemon attacker, Pokemon enemy) {
    int damage = 0;
    switch (enemy.getType()) {
      case "fire":
        damage = 20;
        break;
      case "grass":
        damage = 10;
        break;
      case "electric":
        damage = 15;
        break;
      case "water":
        damage = 25;
        break;
    }

    // Print out attack message
    System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with thunderPunch");

    // Update enemy's HP
    int newHp = enemy.getHp() - damage;
    enemy.setHp(newHp);

    // Print out effect message
    System.out.println(enemy.getName() + " loses " + damage + " hp");

    // Print out remaining HP message
    System.out.println(enemy.getName() + " has " + newHp + " hp left");
  }


  @Override
  public void ElectroBall(Pokemon attacker, Pokemon enemy) {
    int damage = 0;
    switch (enemy.getType()) {
      case "fire":
        damage = 15;
        break;
      case "grass":
        damage = 25;
        break;
      case "electric":
        damage = 10;
        break;
      case "water":
        damage = 20;
        break;
    }

    // Print out attack message
    System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with electroBall");

    // Update enemy's HP
    int newHp = enemy.getHp() - damage;
    enemy.setHp(newHp);

    // Print out effect message
    System.out.println(enemy.getName() + " loses " + damage + " hp");

    // Print out remaining HP message
    System.out.println(enemy.getName() + " has " + newHp + " hp left");
  }


  @Override
  public void Thunder(Pokemon attacker, Pokemon enemy) {
    int damage = 0;
    switch (enemy.getType()) {
      case "fire":
        damage = 25;
        break;
      case "grass":
        damage = 15;
        break;
      case "electric":
        damage = 20;
        break;
      case "water":
        damage = 10;
        break;
    }

    // Print out attack message
    System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with thunder");

    // Update enemy's HP
    int newHp = enemy.getHp() - damage;
    enemy.setHp(newHp);

    // Print out effect message
    System.out.println(enemy.getName() + " loses " + damage + " hp");

    // Print out remaining HP message
    System.out.println(enemy.getName() + " has " + newHp + " hp left");
  }


  @Override
  public void VoltTackle(Pokemon attacker, Pokemon enemy) {
    int damage = 0;
    switch (enemy.getType()) {
      case "fire":
        damage = 10;
        break;
      case "grass":
        damage = 20;
        break;
      case "electric":
        damage = 25;
        break;
      case "water":
        damage = 15;
        break;
    }

    // Print out attack message
    System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with voltTackle");

    // Update enemy's HP
    int newHp = enemy.getHp() - damage;
    enemy.setHp(newHp);

    // Print out effect message
    System.out.println(enemy.getName() + " loses " + damage + " hp");

    // Print out remaining HP message
    System.out.println(enemy.getName() + " has " + newHp + " hp left");
  }



}
