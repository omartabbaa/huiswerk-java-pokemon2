public class FirePokemon extends Pokemon implements fireAttack {
 public static String type = "fire";

 public FirePokemon(String name, int level, int hp, String food, String sound) {
  super(name, level, hp, food, sound);
 }

 public void fireLash(Pokemon attacker, Pokemon enemy) {
  int damage = 0;
  switch (enemy.getType()) {
   case "fire":
    damage = 10;
    break;
   case "grass":
    damage = 25;
    break;
   case "electric":
    damage = 15;
    break;
   case "water":
    damage = 20;
    break;
  }

  // Print out attack message
  System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with fireLash");

  // Update enemy's HP
  int newHp = enemy.getHp() - damage;
  enemy.setHp(newHp);

  // Print out effect message
  System.out.println(enemy.getName() + " loses " + damage + " hp");

  // Print out remaining HP message
  System.out.println(enemy.getName() + " has " + newHp + " hp left");
 }

 public void flameThrower(Pokemon attacker, Pokemon enemy) {
  int damage = 0;
  switch (enemy.getType()) {
   case "fire":
    damage = 15;
    break;
   case "grass":
    damage = 20;
    break;
   case "electric":
    damage = 10;
    break;
   case "water":
    damage = 25;
    break;
  }

  // Print out attack message
  System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with flameThrower");

  // Update enemy's HP
  int newHp = enemy.getHp() - damage;
  enemy.setHp(newHp);

  // Print out effect message
  System.out.println(enemy.getName() + " loses " + damage + " hp");

  // Print out remaining HP message
  System.out.println(enemy.getName() + " has " + newHp + " hp left");
 }

 public void solarBeam(Pokemon attacker, Pokemon enemy) {
  int damage = 0;
  switch (enemy.getType()) {
   case "fire":
    damage = 20;
    break;
   case "grass":
    damage = 15;
    break;
   case "electric":
    damage = 25;
    break;
   case "water":
    damage = 10;
    break;
  }

  // Print out attack message
  System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with solarBeam");

  // Update enemy's HP
  int newHp = enemy.getHp() - damage;
  enemy.setHp(newHp);

  // Print out effect message
  System.out.println(enemy.getName() + " loses " + damage + " hp");

  // Print out remaining HP message
  System.out.println(enemy.getName() + " has " + newHp + " hp left");
 }

 public void pyroBall(Pokemon attacker, Pokemon enemy) {
  int damage = 0;
  switch (enemy.getType()) {
   case "fire":
    damage = 25;
    break;
   case "grass":
    damage = 10;
    break;
   case "electric":
    damage = 20;
    break;
   case "water":
    damage = 15;
    break;
  }

  // Print out attack message
  System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with pyroBall");

  // Update enemy's HP
  int newHp = enemy.getHp() - damage;
  enemy.setHp(newHp);

  // Print out effect message
  System.out.println(enemy.getName() + " loses " + damage + " hp");

  // Print out remaining HP message
  System.out.println(enemy.getName() + " has " + newHp + " hp left");
 }

 public void inferno(Pokemon attacker, Pokemon enemy) {
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
  System.out.println(attacker.getName() + " attacks " + enemy.getName() + " with inferno");

  // Update enemy's HP
  int newHp = enemy.getHp() - damage;
  enemy.setHp(newHp);

  // Print out effect message
  System.out.println(enemy.getName() + " loses " + damage + " hp");

  // Print out remaining HP message
  System.out.println(enemy.getName() + " has " + newHp + " hp left");
 }
}

