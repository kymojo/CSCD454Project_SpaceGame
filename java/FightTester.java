/**
 * Stupid tester for stupid people.
 *
 * @author  Kyle Johnson
 */

public class FightTester {

   public static void main(String[] args) {
   
      Character player = new Character();
      Enemy enemy = new Enemy_Standard();
      Enemy enemy2 = new Enemy_Standard();
      CombatArena arena = CombatArena.getInstance();
      CombatArena.addCombatant(player);
      CombatArena.addCombatant(enemy);
      CombatArena.addCombatant(enemy);
      CombatArena.combatSteps();
   }
}