/**
 * Stupid tester for stupid people.
 *
 * @author  Kyle Johnson
 */

public class FightTester {

   public static void main(String[] args) {
   
      Character player = new Character();
      Enemy enemy = new Enemy_Shanker();
      Enemy enemy2 = new Enemy_Shanker();
      Enemy enemy3 = new Enemy_Shanker();
      CombatArena arena = CombatArena.getInstance();
      CombatArena.addCombatant(player);
      CombatArena.addCombatant(enemy);
      CombatArena.addCombatant(enemy2);
      CombatArena.addCombatant(enemy3);
      player.giveItem(new FightItem_FragGrenade(1));
      player.giveItem(new HealthItem_Apple(1));
      player.giveItem(new HealthItem_Apple(1));
      player.giveItem(new HealthItem_HealthPack(2));
      player.giveItem(new Weapon_HeavyBlaster(2));
      player.giveItem(new Weapon_Knife(2));
      CombatArena.combatSteps();
   }
}