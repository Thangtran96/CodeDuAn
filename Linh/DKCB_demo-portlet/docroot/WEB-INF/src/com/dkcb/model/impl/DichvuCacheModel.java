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

import com.dkcb.model.Dichvu;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Dichvu in entity cache.
 *
 * @author hoang_000
 * @see Dichvu
 * @generated
 */
public class DichvuCacheModel implements CacheModel<Dichvu>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{Iddichvu=");
		sb.append(Iddichvu);
		sb.append(", Tendichvu=");
		sb.append(Tendichvu);
		sb.append(", Mucthu=");
		sb.append(Mucthu);
		sb.append(", Ghichi=");
		sb.append(Ghichi);
		sb.append(", Idphongkham=");
		sb.append(Idphongkham);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dichvu toEntityModel() {
		DichvuImpl dichvuImpl = new DichvuImpl();

		dichvuImpl.setIddichvu(Iddichvu);

		if (Tendichvu == null) {
			dichvuImpl.setTendichvu(StringPool.BLANK);
		}
		else {
			dichvuImpl.setTendichvu(Tendichvu);
		}

		dichvuImpl.setMucthu(Mucthu);

		if (Ghichi == null) {
			dichvuImpl.setGhichi(StringPool.BLANK);
		}
		else {
			dichvuImpl.setGhichi(Ghichi);
		}

		if (Idphongkham == null) {
			dichvuImpl.setIdphongkham(StringPool.BLANK);
		}
		else {
			dichvuImpl.setIdphongkham(Idphongkham);
		}

		dichvuImpl.resetOriginalValues();

		return dichvuImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Iddichvu = objectInput.readLong();
		Tendichvu = objectInput.readUTF();
		Mucthu = objectInput.readDouble();
		Ghichi = objectInput.readUTF();
		Idphongkham = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(Iddichvu);

		if (Tendichvu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Tendichvu);
		}

		objectOutput.writeDouble(Mucthu);

		if (Ghichi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Ghichi);
		}

		if (Idphongkham == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Idphongkham);
		}
	}

	public long Iddichvu;
	public String Tendichvu;
	public double Mucthu;
	public String Ghichi;
	public String Idphongkham;
}