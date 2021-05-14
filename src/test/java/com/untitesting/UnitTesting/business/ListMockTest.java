package com.untitesting.UnitTesting.business;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ListMockTest {

    List<String> mock = mock(List.class);

    @Test
    public void size_basic(){
        when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());
    }

    @Test
    public void returnDifferentValues(){
        when(mock.size()).thenReturn(5).thenReturn(10);
        assertEquals(5,mock.size());
        assertEquals(10,mock.size());
    }

    @Test
    public void returnDifferentParameters(){
        when(mock.get(0)).thenReturn("surbhi");
        assertEquals("surbhi",mock.get(0));
        assertEquals(null,mock.get(1));
    }

    public void verificationBasis(){
        String str1= mock.get(0);
        String str2 = mock.get(1);

        verify(mock).get(0);
        verify(mock, times(2)).get(anyInt());
        verify(mock, atLeast(1)).get(anyInt());

    }

    @Test
    public void argumentCapturing(){
        //SUT
        mock.add("SomeString");
        mock.add("SomeString2");
        //Verification
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock, times(2)).add(captor.capture());
        List<String> allValues = captor.getAllValues();
        assertEquals("SomeString", allValues.get(0));
        assertEquals("SomeString2",allValues.get(1));
    }

    @Test
    public void mocking(){
        ArrayList mockArrayList = mock(ArrayList.class);
        System.out.println(mockArrayList.get(0)); //null
        System.out.println(mockArrayList.size()); //0
        mockArrayList.add(1);
        mockArrayList.add(2);
        System.out.println(mockArrayList.size()); // still null
        when(mockArrayList.size()).thenReturn(5);
        System.out.println(mockArrayList.size()); //5
    }

    @Test
    public  void Spying(){
        ArrayList spyArrayList = spy(ArrayList.class);
        spyArrayList.add(1);
        spyArrayList.add(2);
        System.out.println(spyArrayList.get(0)); //1
        System.out.println(spyArrayList.size()); //2

        System.out.println(spyArrayList.size()); // size is 2
        when(spyArrayList.size()).thenReturn(5);
        System.out.println(spyArrayList.size()); //5
    }
}
