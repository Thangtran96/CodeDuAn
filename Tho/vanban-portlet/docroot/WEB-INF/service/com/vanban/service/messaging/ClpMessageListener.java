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

package com.vanban.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.vanban.service.ClpSerializer;
import com.vanban.service.LoaiVBLocalServiceUtil;
import com.vanban.service.LoaiVBServiceUtil;
import com.vanban.service.nguoidungLocalServiceUtil;
import com.vanban.service.nguoidungServiceUtil;
import com.vanban.service.nguoikiLocalServiceUtil;
import com.vanban.service.nguoikiServiceUtil;
import com.vanban.service.noiBanHanhLocalServiceUtil;
import com.vanban.service.noiBanHanhServiceUtil;
import com.vanban.service.vanbanLocalServiceUtil;
import com.vanban.service.vanbanServiceUtil;

/**
 * @author nguye
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
			LoaiVBLocalServiceUtil.clearService();

			LoaiVBServiceUtil.clearService();
			nguoidungLocalServiceUtil.clearService();

			nguoidungServiceUtil.clearService();
			nguoikiLocalServiceUtil.clearService();

			nguoikiServiceUtil.clearService();
			noiBanHanhLocalServiceUtil.clearService();

			noiBanHanhServiceUtil.clearService();
			vanbanLocalServiceUtil.clearService();

			vanbanServiceUtil.clearService();
		}
	}
}