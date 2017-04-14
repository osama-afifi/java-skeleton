package com.__MY_COMPANY__.__MY_MODULE__.interfaces.facade;

import com.__MY_COMPANY__.__MY_MODULE__.dto.SomeDto;
import com.__MY_COMPANY__.__MY_MODULE__.exception.SomeException;

/**
 * Created by osama on 13/04/2017.
 */

public interface SomeServiceFacade {

    SomeDto someServiceMethod(SomeDto node) throws SomeException;

}
