/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vmmc.jasper;

import com.vmmc.entities.ArtSummary;
import com.vmmc.services.EpmsReportsSectionD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ignatious
 */
public class DataList {

    public List<Zimepms> populateReport() {
        List<Zimepms> listData = new ArrayList<>();

        Report rep = new Report();

        EpmsReportsSectionD epms = new EpmsReportsSectionD();
        List<ArtSummary> data = epms.getArtSummary();

        //Infants
        int infantCount02[] = rep.getTotalInfantsInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 0, 2);
        int infantCount312[] = rep.getTotalInfantsInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 3, 12);
        int infantCount1324[] = rep.getTotalInfantsInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 13, 24);
        int infantCount2559[] = rep.getTotalInfantsInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 25, 59);

        //Adults
        int adultCount59[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 5, 9);
        int adultCount1014[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 10, 14);
        int adultCount1519[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 15, 19);
        int adultCount2024[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 20, 24);
        int adultCount2529[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 25, 29);
        int adultCount3034[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 30, 34);
        int adultCount3539[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 35, 39);
        int adultCount4044[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 40, 44);
        int adultCount4549[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 45, 49);
        int adultCount50[] = rep.getTotalMalesAndFemalesInRange(rep.FilteredData(rep.removeNulls(data), rep.dateConvertor("2018-01-01")), 50, 120);

        //Totals
        int total = infantCount02[0] + infantCount02[1] + infantCount312[0] + infantCount312[1] + infantCount1324[0] + infantCount1324[1]
                + infantCount2559[0] + infantCount2559[1] + adultCount59[0] + adultCount59[1] + adultCount1014[0] + adultCount1014[1]
                + adultCount1519[0] + adultCount1519[1] + adultCount2024[0] + adultCount2024[1] + adultCount2529[0] + adultCount2529[1]
                + adultCount3034[0] + adultCount3034[1] + adultCount3539[0] + adultCount3539[1] + adultCount4044[0] + adultCount4044[1]
                + adultCount4549[0] + adultCount4549[1] + adultCount50[0] + adultCount50[1];

        Zimepms d1 = new Zimepms();
        d1.setData_name("D38. Number of PLHIV in care who on First line regimen who had adverse events this month");
        d1.setMonthm1(infantCount02[0]);
        d1.setMonthf1(infantCount02[1]);
        d1.setMonthm2(infantCount312[0]);
        d1.setMonthf2(infantCount312[1]);
        d1.setMonthm3(infantCount1324[0]);
        d1.setMonthf3(infantCount1324[1]);
        d1.setMonthm4(infantCount2559[0]);
        d1.setMonthf4(infantCount2559[1]);
        d1.setYearm5(adultCount59[0]);
        d1.setYearf5(adultCount59[1]);
        d1.setYearm6(adultCount1014[0]);
        d1.setYearf6(adultCount1014[1]);
        d1.setYearm7(adultCount1519[0]);
        d1.setYearf7(adultCount1519[1]);
        d1.setYearm8(adultCount2024[0]);
        d1.setYearf8(adultCount2024[1]);
        d1.setYearm9(adultCount2529[0]);
        d1.setYearf9(adultCount2529[1]);
        d1.setYearm10(adultCount3034[0]);
        d1.setYearf10(adultCount3034[1]);
        d1.setYearm11(adultCount3539[0]);
        d1.setYearf11(adultCount3539[1]);
        d1.setYearm12(adultCount4044[0]);
        d1.setYearf12(adultCount4044[1]);
        d1.setYearm13(adultCount4549[0]);
        d1.setYearf13(adultCount4549[1]);
        d1.setYearm14(adultCount50[0]);
        d1.setYearf14(adultCount50[1]);
        d1.setTotal(total);

        listData.add(d1);

        return listData;
    }

    public String getPeriod() {
        String period = "December 2022";

        return period;
    }

    public String getReportTitle() {
        String title = "B2. HIV Testing Services including PMTCT";

        return title;

    }

}
