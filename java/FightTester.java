/**
 * Stupid tester for stupid people.
 *
 * @author  Kyle Johnson
 */

public class FightTester {

   public static void main(String[] args) {
   
      Character player = new Character();
      Enemy enemy = new Enemy_Standard();
      Enemy enemy2 = new Enemy_Prisoner();
      CombatArena arena = CombatArena.getInstance();
      CombatArena.addCombatant(player);
      CombatArena.addCombatant(enemy);
      CombatArena.addCombatant(enemy2);
      player.getInventory().setItem(new FightItem_FragGrenade(1));
      player.getInventory().setItem(new HealthItem_Apple(1));
      player.getInventory().setItem(new HealthItem_Apple(1));
      player.getInventory().setItem(new HealthItem_HealthPack(2));
      CombatArena.combatSteps();
   }
}