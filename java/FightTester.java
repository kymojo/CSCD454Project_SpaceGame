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
      System.out.println(player.giveItem(new FightItem_FragGrenade(1)));
      System.out.println(player.giveItem(new HealthItem_Apple(1)));
      System.out.println(player.giveItem(new HealthItem_Apple(1)));
      System.out.println(player.giveItem(new HealthItem_HealthPack(2)));
      System.out.println(player.giveItem(new Weapon_HeavyBlaster(2)));
      System.out.println(player.giveItem(new Weapon_Knife(2)));
      CombatArena.combatSteps();
   }
}