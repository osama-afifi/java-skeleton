package com.__MY_COMPANY__.__MY_MODULE__.interfaces.facade.impl;

import com.__MY_COMPANY__.__MY_MODULE__.dto.SomeDto;
import com.__MY_COMPANY__.__MY_MODULE__.interfaces.facade.SomeServiceFacade;
import com.__MY_COMPANY__.__MY_MODULE__.exception.SomeException;
import org.springframework.stereotype.Component;

/**
 * Created by osama on 13/04/2017.
 */

@Component
public class SomeServiceFacadeImpl implements SomeServiceFacade {

    public SomeDto someServiceMethod(SomeDto node) throws SomeException {
        return null;
    }

}
