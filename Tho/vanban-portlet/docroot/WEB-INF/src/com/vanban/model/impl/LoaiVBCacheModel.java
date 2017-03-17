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

import com.vanban.model.LoaiVB;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LoaiVB in entity cache.
 *
 * @author nguye
 * @see LoaiVB
 * @generated
 */
public class LoaiVBCacheModel implements CacheModel<LoaiVB>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{loaiId=");
		sb.append(loaiId);
		sb.append(", tenloai=");
		sb.append(tenloai);
		sb.append(", ghichu=");
		sb.append(ghichu);
		sb.append(", tinhtrang=");
		sb.append(tinhtrang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LoaiVB toEntityModel() {
		LoaiVBImpl loaiVBImpl = new LoaiVBImpl();

		loaiVBImpl.setLoaiId(loaiId);

		if (tenloai == null) {
			loaiVBImpl.setTenloai(StringPool.BLANK);
		}
		else {
			loaiVBImpl.setTenloai(tenloai);
		}

		if (ghichu == null) {
			loaiVBImpl.setGhichu(StringPool.BLANK);
		}
		else {
			loaiVBImpl.setGhichu(ghichu);
		}

		loaiVBImpl.setTinhtrang(tinhtrang);

		loaiVBImpl.resetOriginalValues();

		return loaiVBImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		loaiId = objectInput.readLong();
		tenloai = objectInput.readUTF();
		ghichu = objectInput.readUTF();
		tinhtrang = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(loaiId);

		if (tenloai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tenloai);
		}

		if (ghichu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ghichu);
		}

		objectOutput.writeBoolean(tinhtrang);
	}

	public long loaiId;
	public String tenloai;
	public String ghichu;
	public boolean tinhtrang;
}