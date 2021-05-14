package com.untitesting.UnitTesting.business;

import com.untitesting.UnitTesting.data.SomeDataService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessImplMockTest {

    @InjectMocks
    BusinessImpl business;

    @Mock
    SomeDataService mockService ;

    @Test
    public void Basic_calculateSumUsingSomeDataService(){
        when(mockService.retrieveData()).thenReturn(new int[] {1,2,3,4});
        Assertions.assertEquals(0, business.calucalateSumUsingSomeDataService());
    }

    @Test
    public void empty_calculateSumUsingSomeDataService(){
        when(mockService.retrieveData()).thenReturn(new int[] {});
        Assertions.assertEquals(0,business.calucalateSumUsingSomeDataService());
    }

    @Test
    public void oneValue_calculateSumUsingSomeDataService(){
        when(mockService.retrieveData()).thenReturn(new int[] {1,2});
        Assertions.assertEquals(3,business.calucalateSumUsingSomeDataService());
    }
}
