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

import com.vanban.model.nguoiki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing nguoiki in entity cache.
 *
 * @author nguye
 * @see nguoiki
 * @generated
 */
public class nguoikiCacheModel implements CacheModel<nguoiki>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{nguoikiID=");
		sb.append(nguoikiID);
		sb.append(", hoten=");
		sb.append(hoten);
		sb.append(", ngaysinh=");
		sb.append(ngaysinh);
		sb.append(", gioitinh=");
		sb.append(gioitinh);
		sb.append(", donvi=");
		sb.append(donvi);
		sb.append(", chucvu=");
		sb.append(chucvu);
		sb.append(", tinhtrang=");
		sb.append(tinhtrang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public nguoiki toEntityModel() {
		nguoikiImpl nguoikiImpl = new nguoikiImpl();

		nguoikiImpl.setNguoikiID(nguoikiID);

		if (hoten == null) {
			nguoikiImpl.setHoten(StringPool.BLANK);
		}
		else {
			nguoikiImpl.setHoten(hoten);
		}

		if (ngaysinh == Long.MIN_VALUE) {
			nguoikiImpl.setNgaysinh(null);
		}
		else {
			nguoikiImpl.setNgaysinh(new Date(ngaysinh));
		}

		nguoikiImpl.setGioitinh(gioitinh);

		if (donvi == null) {
			nguoikiImpl.setDonvi(StringPool.BLANK);
		}
		else {
			nguoikiImpl.setDonvi(donvi);
		}

		if (chucvu == null) {
			nguoikiImpl.setChucvu(StringPool.BLANK);
		}
		else {
			nguoikiImpl.setChucvu(chucvu);
		}

		nguoikiImpl.setTinhtrang(tinhtrang);

		nguoikiImpl.resetOriginalValues();

		return nguoikiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		nguoikiID = objectInput.readLong();
		hoten = objectInput.readUTF();
		ngaysinh = objectInput.readLong();
		gioitinh = objectInput.readInt();
		donvi = objectInput.readUTF();
		chucvu = objectInput.readUTF();
		tinhtrang = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(nguoikiID);

		if (hoten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoten);
		}

		objectOutput.writeLong(ngaysinh);
		objectOutput.writeInt(gioitinh);

		if (donvi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(donvi);
		}

		if (chucvu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(chucvu);
		}

		objectOutput.writeBoolean(tinhtrang);
	}

	public long nguoikiID;
	public String hoten;
	public long ngaysinh;
	public int gioitinh;
	public String donvi;
	public String chucvu;
	public boolean tinhtrang;
}