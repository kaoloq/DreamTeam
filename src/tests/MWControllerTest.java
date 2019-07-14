package gui;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Vector;

public class MWControllerTest {
    private MWController test1 = new MWController();
    private MWController test2 = new MWController();
    MWController test3 = new MWController();

    @Before
    public void setUp() throws Exception {
        Controller contr1  = new Controller();
        String m1 = "14 8 8 6 0 13 178";
        test1.setControl(contr1);
        test1.onEnterDataClicked(m1);

        Controller contr2 = new Controller();
        String m2 = "1 hg 8 128";
        test2.setControl(contr2);
        test2.onEnterDataClicked(m2);

        Controller contr3 = new Controller();
        String m3 = "sf jhg a aaa hgf uqq";
        test3.setControl(contr3);
        test3.onEnterDataClicked(m3);
    }

    @Test
    public void onEnterDataClicked() {
        assertEquals(test1.mode, MWController.Mode.NUMBERS);
        assertEquals(test2.mode, MWController.Mode.STRINGS);
        assertEquals(test3.mode, MWController.Mode.STRINGS);
    }

    @Test
    public void onNextStepButtonClicked() {
        assertEquals(4, test1.onNextStepButtonClicked());
        assertEquals(2, test2.onNextStepButtonClicked());
        assertEquals(16, test3.onNextStepButtonClicked());
    }

}
