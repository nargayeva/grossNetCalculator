import ada.wm2.helper.Helper;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelperTest {

    @Test
    public void testGrossToNet() {
        double gross1 = 2040;
        double gross2 = 456;
        double gross3 = 3000;
        double gross4 = 1272;
        String year1 = "2017";
        String year2 = "2018";
        String year3 = "2019";
        String year4 = "2020";
        double laborUnionPercentage1 = 30;
        double laborUnionPercentage2= 5;
        String discountType1 = "400";
        String discountType2 = null;
        String discountType3 = "50";
        String discountType4 = "200";
        String sector1 = "private";
        String sector2 = "state";
        double net1 = 1612.9;
        double net2 = 319.62;
        double net3 = 2549.0;
        double net4 = 827.44;
        boolean res1;
        boolean res2;
        boolean res3;
        boolean res4;

        double NET1 = Helper.grossToNet(gross1, year1, laborUnionPercentage2, discountType2, sector1); //1612.9
        double NET2 = Helper.grossToNet(gross2, year2, laborUnionPercentage1, discountType1, sector2); //319.62
        double NET3 = Helper.grossToNet(gross3, year3, laborUnionPercentage2, discountType3, sector1); //2549.0
        double NET4 = Helper.grossToNet(gross4, year4, laborUnionPercentage1, discountType4, sector2); //827.44

        if(NET1 == net1) res1 = true;
        else res1 = false;

        if(NET2 == net2) res2 = true;
        else res2 = false;

        if(NET3 == net3) res3 = true;
        else res3 = false;

        if(NET4 == net4) res4 = true;
        else res4 = false;

        assertEquals(res1,true);
        assertEquals(res2,true);
        assertEquals(res3,true);
        assertEquals(res4,true);

    }

    @Test
    public void testNetToGross() {
        double net1 = 730;
        double net2 = 1347.9;
        String sector1 = "privateSec";
        String sector2 = "stateSec";

        double gross1 = 855.49;
        double gross2 = 1604.46;
        boolean res1;
        boolean res2;

        double GROSS1 = Helper.netToGross(net1, sector1);
        double GROSS2 = Helper.netToGross(net2, sector2);

        if(GROSS1 == gross1) res1 = true;
        else res1 = false;

        if(GROSS2 == gross2) res2 = true;
        else res2 = false;

        assertEquals(res1, true);
        assertEquals(res2, true);

    }
}

