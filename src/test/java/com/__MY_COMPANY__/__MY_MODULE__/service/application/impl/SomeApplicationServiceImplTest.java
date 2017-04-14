package com.__MY_COMPANY__.__MY_MODULE__.service.application.impl;

import com.__MY_COMPANY__.__MY_MODULE__.exception.SomeException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Created by osama on 4/13/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class SomeApplicationServiceImplTest {

    @InjectMocks
    SomeApplicationServiceImpl someApplicationServiceImpl;

//    @Mock
//    X x;

    @Before
    public void setup() throws SomeException {
        // setup some stuff
    }

    @Test
    public void SomeApplicationServiceImplTest_SomeTest() throws SomeException {

    }


}
