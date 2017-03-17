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

package com.dkcb.model.impl;

import com.dkcb.model.DKCB;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DKCB in entity cache.
 *
 * @author hoang_000
 * @see DKCB
 * @generated
 */
public class DKCBCacheModel implements CacheModel<DKCB>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Id=");
		sb.append(Id);
		sb.append(", Hoten=");
		sb.append(Hoten);
		sb.append(", Diachi=");
		sb.append(Diachi);
		sb.append(", Gioitinh=");
		sb.append(Gioitinh);
		sb.append(", Sodienthoai=");
		sb.append(Sodienthoai);
		sb.append(", Ngaysinh=");
		sb.append(Ngaysinh);
		sb.append(", Trieuchung=");
		sb.append(Trieuchung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DKCB toEntityModel() {
		DKCBImpl dkcbImpl = new DKCBImpl();

		dkcbImpl.setId(Id);

		if (Hoten == null) {
			dkcbImpl.setHoten(StringPool.BLANK);
		}
		else {
			dkcbImpl.setHoten(Hoten);
		}

		if (Diachi == null) {
			dkcbImpl.setDiachi(StringPool.BLANK);
		}
		else {
			dkcbImpl.setDiachi(Diachi);
		}

		dkcbImpl.setGioitinh(Gioitinh);

		if (Sodienthoai == null) {
			dkcbImpl.setSodienthoai(StringPool.BLANK);
		}
		else {
			dkcbImpl.setSodienthoai(Sodienthoai);
		}

		if (Ngaysinh == Long.MIN_VALUE) {
			dkcbImpl.setNgaysinh(null);
		}
		else {
			dkcbImpl.setNgaysinh(new Date(Ngaysinh));
		}

		if (Trieuchung == null) {
			dkcbImpl.setTrieuchung(StringPool.BLANK);
		}
		else {
			dkcbImpl.setTrieuchung(Trieuchung);
		}

		dkcbImpl.resetOriginalValues();

		return dkcbImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Id = objectInput.readLong();
		Hoten = objectInput.readUTF();
		Diachi = objectInput.readUTF();
		Gioitinh = objectInput.readBoolean();
		Sodienthoai = objectInput.readUTF();
		Ngaysinh = objectInput.readLong();
		Trieuchung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Id);

		if (Hoten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Hoten);
		}

		if (Diachi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Diachi);
		}

		objectOutput.writeBoolean(Gioitinh);

		if (Sodienthoai == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Sodienthoai);
		}

		objectOutput.writeLong(Ngaysinh);

		if (Trieuchung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Trieuchung);
		}
	}

	public long Id;
	public String Hoten;
	public String Diachi;
	public boolean Gioitinh;
	public String Sodienthoai;
	public long Ngaysinh;
	public String Trieuchung;
}