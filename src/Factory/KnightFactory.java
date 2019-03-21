package Factory;

import Enemy.Enemy;
import Enemy.Knight;

import java.util.Random;

public class KnightFactory implements EnemyFactory {
    @Override
    public Enemy spawnEnemy() {

        Knight knight = new Knight();
        knight.setArmour(generateArmour());

        return knight;
    }

    private int generateArmour() {

        Random random = new Random();
        return random.nextInt(5 - 1 + 1) + 1;
    }
}
