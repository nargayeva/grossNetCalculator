package ada.wm2.helper;

import java.text.DecimalFormat;

public class Helper {

    public static double grossToNet(double gross, String year, double laborUnionPercentage, String discountType, String sector) {

        double tax;
        double net = 0;
        double incomeTax = 0;
        double dsmf = 0;
        double laborUnion = 0;
        double unempInsurance = 0;
        double compulsoryInsurance = 0;


        // 2017 private sector
        if (year.equals("2017") && sector.equals("private")) {

            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 2500) incomeTax = (tax - 155) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;


            dsmf = gross * 0.03;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - laborUnion;

        }


        // 2017 state sector
        if (year.equals("2017") && sector.equals("state")) {

            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 2500) incomeTax = (tax - 155) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - laborUnion;

        }


        // 2018 private sector
        if (year.equals("2018") && sector.equals("private")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 2500) incomeTax = (tax - 173) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            unempInsurance = gross * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - laborUnion;


        }



        // 2018 state sector
        if (year.equals("2018")&& sector.equals("state")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 2500) incomeTax = (tax - 173) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            unempInsurance = gross * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - laborUnion;


        }


        // 2019 state sector
        if (year.equals("2019")&& sector.equals("state")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 2500) incomeTax = (tax - 200) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            unempInsurance = gross * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - laborUnion;

        }


        //2019 state private
        if (year.equals("2019") && sector.equals("private")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax < 8000) incomeTax = 0;
            else incomeTax = (8000 - tax) * 0.14;

            if (gross < 200) dsmf = gross * 0.03;
            else dsmf = 6 + (gross - 200) * 0.1;

            unempInsurance = gross * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - laborUnion;

        }



        // 2020 state sector
        if (year.equals("2020") && sector.equals("state")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax > 2500) incomeTax = (tax - 200) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            if (gross < 8000) compulsoryInsurance = gross * 0.02 ;
            else compulsoryInsurance = 160 + (gross - 8000) * 0.005;

            unempInsurance = gross * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - compulsoryInsurance - laborUnion;

        }


        //2020 private sector
        if (year.equals("2020") && sector.equals("private")) {
            if (discountType != null) {
                tax = gross - Double.parseDouble(discountType);
            } else tax = gross;

            if (tax > 2500) incomeTax = (tax - 200) * 0.14;
            else incomeTax = 350 + (tax - 2500) * 0.25;

            dsmf = gross * 0.03;

            unempInsurance = gross * 0.005;

            if (gross < 8000) compulsoryInsurance = (gross * 0.02 / 2);
            else compulsoryInsurance = 80 + (gross - 8000) * 0.005;

            laborUnion = (gross * laborUnionPercentage) / 100;

            net = gross - incomeTax - dsmf - unempInsurance - compulsoryInsurance - laborUnion;

        }

        return Math.round(net*100.0)/100.0;


    }

    public static double netToGross(double nett, String sector){

        double gross = 0;

        if(sector.equals("privateSec")){
            if(nett < 2086.72) gross = (nett - 24.22)/0.825;
            else gross = (nett  - 275)/0.715;
        }

        if(sector.equals("stateSec")){
            if(nett < 2086.72) gross = (nett - 24.22)/0.825;
            else gross = (nett  - 275)/0.715;
        }

            return Math.round(gross*100.0)/100.0;
    }
    }
