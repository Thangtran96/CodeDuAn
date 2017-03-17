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

package com.vanban.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.vanban.model.noiBanHanh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing noiBanHanh in entity cache.
 *
 * @author nguye
 * @see noiBanHanh
 * @generated
 */
public class noiBanHanhCacheModel implements CacheModel<noiBanHanh>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{noiBHId=");
		sb.append(noiBHId);
		sb.append(", tennoibanhanh=");
		sb.append(tennoibanhanh);
		sb.append(", ghichu=");
		sb.append(ghichu);
		sb.append(", tinhtrang=");
		sb.append(tinhtrang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public noiBanHanh toEntityModel() {
		noiBanHanhImpl noiBanHanhImpl = new noiBanHanhImpl();

		noiBanHanhImpl.setNoiBHId(noiBHId);

		if (tennoibanhanh == null) {
			noiBanHanhImpl.setTennoibanhanh(StringPool.BLANK);
		}
		else {
			noiBanHanhImpl.setTennoibanhanh(tennoibanhanh);
		}

		if (ghichu == null) {
			noiBanHanhImpl.setGhichu(StringPool.BLANK);
		}
		else {
			noiBanHanhImpl.setGhichu(ghichu);
		}

		noiBanHanhImpl.setTinhtrang(tinhtrang);

		noiBanHanhImpl.resetOriginalValues();

		return noiBanHanhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		noiBHId = objectInput.readLong();
		tennoibanhanh = objectInput.readUTF();
		ghichu = objectInput.readUTF();
		tinhtrang = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(noiBHId);

		if (tennoibanhanh == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tennoibanhanh);
		}

		if (ghichu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghichu);
		}

		objectOutput.writeBoolean(tinhtrang);
	}

	public long noiBHId;
	public String tennoibanhanh;
	public String ghichu;
	public boolean tinhtrang;
}