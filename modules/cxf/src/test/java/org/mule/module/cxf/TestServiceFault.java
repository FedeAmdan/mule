/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.cxf;

import org.mule.module.cxf.testmodels.CxfEnabledFaultMessage;

import javax.jws.WebService;

@WebService
public interface TestServiceFault
{
    String sayHi(String text) throws CxfEnabledFaultMessage;
}
