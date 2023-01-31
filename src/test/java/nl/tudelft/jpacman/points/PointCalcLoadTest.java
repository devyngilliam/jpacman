package nl.tudelft.jpacman.points;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * load() test
 * @author Devyn Gilliam
 */

public class PointCalcLoadTest {

    public PointCalculatorLoader PCL = new PointCalculatorLoader();

    @Test
    void testPointCalcLoad(){
        assertThat(PCL.load()).isInstanceOf(PointCalculator.class);
    }
}
