/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.dkcb.service.messaging;

import com.dkcb.service.BacsiLocalServiceUtil;
import com.dkcb.service.BacsiServiceUtil;
import com.dkcb.service.ClpSerializer;
import com.dkcb.service.DKCBLocalServiceUtil;
import com.dkcb.service.DKCBServiceUtil;
import com.dkcb.service.DichvuLocalServiceUtil;
import com.dkcb.service.DichvuServiceUtil;
import com.dkcb.service.LichkhamLocalServiceUtil;
import com.dkcb.service.LichkhamServiceUtil;
import com.dkcb.service.PhongkhamLocalServiceUtil;
import com.dkcb.service.PhongkhamServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author hoang_000
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			BacsiLocalServiceUtil.clearService();

			BacsiServiceUtil.clearService();
			DichvuLocalServiceUtil.clearService();

			DichvuServiceUtil.clearService();
			DKCBLocalServiceUtil.clearService();

			DKCBServiceUtil.clearService();
			LichkhamLocalServiceUtil.clearService();

			LichkhamServiceUtil.clearService();
			PhongkhamLocalServiceUtil.clearService();

			PhongkhamServiceUtil.clearService();
		}
	}
}