/*******************************************************************************
 * Copyright (c) 1997, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.recoverylog.spi;

//------------------------------------------------------------------------------
// Class: TerminationFailedException
//------------------------------------------------------------------------------
/**
* This exception can be thrown by a RecoveryAgents terminateRecovery method if
* termination processing failes for some reason.
*/
public class TerminationFailedException extends Exception
{
  public TerminationFailedException()
  {
      super();
  }
  
  public TerminationFailedException(Throwable cause)
  {
      super(cause);
  }
}

