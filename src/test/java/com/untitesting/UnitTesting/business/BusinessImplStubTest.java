package com.untitesting.UnitTesting.business;

import com.untitesting.UnitTesting.data.SomeDataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SomeDataServiceStub implements SomeDataService{

    @Override
    public int[] retrieveData() {
        return new int[] {1,2,3,4};
    }
}

public class BusinessImplStubTest {

    @Test
    public void Basic_calucalateSumUsingSomeDataService(){
        BusinessImpl business = new BusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calucalateSumUsingSomeDataService();
        int expectedResult = 10;
        Assertions.assertEquals(actualResult,expectedResult);
    }
}
