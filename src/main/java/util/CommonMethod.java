package util;

import Base.TestBase;

public class CommonMethod extends TestBase
{
    public int getNumberExtractFromText(String totalCountHavingText)
    {

        int indexStyle = 0;
        String totalPrdCountWithComma = "";
        int indexComm = 0;
        int totalPrdCountWithOutComma = 0;

        indexStyle = totalCountHavingText.indexOf("ads");

        totalPrdCountWithComma = totalCountHavingText.substring(0,indexStyle).trim();

        if(totalPrdCountWithComma.length()>3)
        {
            indexComm = totalPrdCountWithComma.indexOf(',');
            totalPrdCountWithOutComma = Integer.parseInt((totalPrdCountWithComma.substring(0, indexComm) + totalPrdCountWithComma.substring(indexComm + 1)));
        }
        else
        {
            totalPrdCountWithOutComma = Integer.parseInt(totalPrdCountWithComma);
        }
        System.out.println("total product count is " +totalPrdCountWithOutComma);
        return totalPrdCountWithOutComma;

    }
}
