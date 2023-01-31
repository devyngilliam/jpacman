package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * getSprites() test
 * @author Devyn Gilliam
 */

public class GetSpriteTest {

    private static final PacManSprites SPRITE_STORE = new PacManSprites();
    private PlayerFactory Factory = new PlayerFactory(SPRITE_STORE);
    @Test
    void testGetSprite(){
        assertThat(Factory.getSprites()).isInstanceOf(PacManSprites.class);
    }
}
