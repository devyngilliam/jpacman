package nl.tudelft.jpacman.sprite;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * getGroundSprite() test
 * @author Devyn Gilliam
 */

public class GetGroundSpriteTest {

    private static final PacManSprites SPRITE_STORE = new PacManSprites();

    @Test
    void testGetGroundSprite(){
        assertThat(SPRITE_STORE.getGroundSprite()).isInstanceOf(Sprite.class);
    }

}
