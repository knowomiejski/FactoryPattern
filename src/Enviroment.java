import Enemy.Ghost;
import Enemy.Knight;
import Factory.EnemyFactory;
import Factory.GhostFactory;
import Factory.KnightFactory;

public class Enviroment {


    public static void main(String[] args) {

        System.out.println("SPAWNED GHOSTS:");
        EnemyFactory enemyFactory = new GhostFactory();
        Ghost ghost1 = (Ghost) enemyFactory.spawnEnemy();
        Ghost ghost2 = (Ghost) enemyFactory.spawnEnemy();
        ghost1.invisibility();
        ghost2.invisibility();

        System.out.println("SPAWNED KNIGHTS:");
        enemyFactory = new KnightFactory();
        Knight knight1 = (Knight) enemyFactory.spawnEnemy();
        Knight knight2 = (Knight) enemyFactory.spawnEnemy();
        knight1.armour();
        knight2.armour();

    }
}
