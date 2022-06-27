package aulia.haris;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Answer_2Test {

    private Answer_2 foo;

    @Before
    public void setUp() throws Exception {
        foo = new Answer_2();
    }

    @Test
    public void testGobtaDanGobzo() {
        String s = foo.gobtaDanGobzo(24);
        Assert.assertEquals("DONE GAN", s);
        s = foo.gobtaDanGobzo(3);
        Assert.assertEquals("UP GAN", s);
        s = foo.gobtaDanGobzo(131);
        Assert.assertEquals("DONE GAN", s);
    }

    @Test
    public void isPower() {
        boolean power = foo.isPower(25);
        Assert.assertTrue(power);
        power = foo.isPower(15);
        Assert.assertFalse(power);
    }

    @Test
    public void nearestPowerOfK() {
        int powerOfK = foo.nearestPowerOfK(131, 5);
        Assert.assertEquals(125, powerOfK);
        powerOfK = foo.nearestPowerOfK(131, 5);
        Assert.assertNotEquals(130, powerOfK);
    }
}