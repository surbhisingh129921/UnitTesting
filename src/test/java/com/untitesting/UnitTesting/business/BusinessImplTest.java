package com.untitesting.UnitTesting.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BusinessImplTest {

    @Test
    public void Basic_Calculation(){
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calucalateSun(new int[] {1,2,3,4});
        int expectedResult = 11;
        Assertions.assertEquals(actualResult,expectedResult);
    }
}
