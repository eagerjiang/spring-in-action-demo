package soundsystem;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author jiangqw
 * @date 2019/12/2 15:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void test(){
        TestCase.assertNotNull(cdPlayer.getCompactDisc());
    }
}
