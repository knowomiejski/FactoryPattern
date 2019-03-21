package Factory;


import Enemy.Enemy;
import Enemy.Ghost;

import java.util.Random;

public class GhostFactory implements EnemyFactory {
    @Override
    public Enemy spawnEnemy() {

        Ghost ghost = new Ghost();
        ghost.setInvisibility(generateInvisibility());

        return ghost;
    }

    private boolean generateInvisibility() {

        Random random = new Random();
        return random.nextBoolean();
    }
}
