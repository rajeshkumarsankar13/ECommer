package com.ecommerce.testcases;

import com.ecommerce.pages.BaseTest;
import com.ecommerce.pages.SearchPage;
import com.ecommerce.utillity.ReadExcelFile;
import org.testng.annotations.Test;

public class SearchPageTest extends BaseTest {

    String fileName=System.getProperty("user.dir")+"\\TestData\\TestPortalData.xlsx";
    @Test
    void searchProductTest()
    {
        SearchPage sp= new SearchPage(driver);
        String serachProduct= ReadExcelFile.getCellValue(fileName, "SearchProduct", 0, 0);
        sp.serachProduct(serachProduct);
    }
}
