/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.training.b2b.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.training.b2b.fulfilmentprocess.constants.B2bFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class B2bFulfilmentProcessManager extends GeneratedB2bFulfilmentProcessManager
{
	public static final B2bFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (B2bFulfilmentProcessManager) em.getExtension(B2bFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
