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

import com.dkcb.model.Lichkham;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Lichkham in entity cache.
 *
 * @author hoang_000
 * @see Lichkham
 * @generated
 */
public class LichkhamCacheModel implements CacheModel<Lichkham>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{Idbacsi=");
		sb.append(Idbacsi);
		sb.append(", Id=");
		sb.append(Id);
		sb.append(", Idphongkham=");
		sb.append(Idphongkham);
		sb.append(", Iddichvu=");
		sb.append(Iddichvu);
		sb.append(", Giodukien=");
		sb.append(Giodukien);
		sb.append(", Ngaykham=");
		sb.append(Ngaykham);
		sb.append(", Idlichkham=");
		sb.append(Idlichkham);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Lichkham toEntityModel() {
		LichkhamImpl lichkhamImpl = new LichkhamImpl();

		if (Idbacsi == null) {
			lichkhamImpl.setIdbacsi(StringPool.BLANK);
		}
		else {
			lichkhamImpl.setIdbacsi(Idbacsi);
		}

		lichkhamImpl.setId(Id);

		if (Idphongkham == null) {
			lichkhamImpl.setIdphongkham(StringPool.BLANK);
		}
		else {
			lichkhamImpl.setIdphongkham(Idphongkham);
		}

		lichkhamImpl.setIddichvu(Iddichvu);

		if (Giodukien == null) {
			lichkhamImpl.setGiodukien(StringPool.BLANK);
		}
		else {
			lichkhamImpl.setGiodukien(Giodukien);
		}

		if (Ngaykham == Long.MIN_VALUE) {
			lichkhamImpl.setNgaykham(null);
		}
		else {
			lichkhamImpl.setNgaykham(new Date(Ngaykham));
		}

		lichkhamImpl.setIdlichkham(Idlichkham);

		lichkhamImpl.resetOriginalValues();

		return lichkhamImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Idbacsi = objectInput.readUTF();
		Id = objectInput.readLong();
		Idphongkham = objectInput.readUTF();
		Iddichvu = objectInput.readLong();
		Giodukien = objectInput.readUTF();
		Ngaykham = objectInput.readLong();
		Idlichkham = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (Idbacsi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Idbacsi);
		}

		objectOutput.writeLong(Id);

		if (Idphongkham == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Idphongkham);
		}

		objectOutput.writeLong(Iddichvu);

		if (Giodukien == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Giodukien);
		}

		objectOutput.writeLong(Ngaykham);
		objectOutput.writeInt(Idlichkham);
	}

	public String Idbacsi;
	public long Id;
	public String Idphongkham;
	public long Iddichvu;
	public String Giodukien;
	public long Ngaykham;
	public int Idlichkham;
}