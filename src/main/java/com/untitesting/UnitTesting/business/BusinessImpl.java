package com.untitesting.UnitTesting.business;

import com.untitesting.UnitTesting.data.SomeDataService;

public class BusinessImpl {

    private SomeDataService someDataService;

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }

    public int calucalateSun(int[] data){
        int sum=0;
        for(int value:data){
            sum+=value;
        }

        return sum;
    }

    public int calucalateSumUsingSomeDataService(){
        int sum=0;
        int [] data = someDataService.retrieveData();
        for(int value:data){
            sum+=value;
        }

        return sum;
    }

}
