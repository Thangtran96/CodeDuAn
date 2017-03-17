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

import com.dkcb.model.Bacsi;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bacsi in entity cache.
 *
 * @author hoang_000
 * @see Bacsi
 * @generated
 */
public class BacsiCacheModel implements CacheModel<Bacsi>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{Idbacsi=");
		sb.append(Idbacsi);
		sb.append(", TenBS=");
		sb.append(TenBS);
		sb.append(", Idphongkham=");
		sb.append(Idphongkham);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Bacsi toEntityModel() {
		BacsiImpl bacsiImpl = new BacsiImpl();

		if (Idbacsi == null) {
			bacsiImpl.setIdbacsi(StringPool.BLANK);
		}
		else {
			bacsiImpl.setIdbacsi(Idbacsi);
		}

		if (TenBS == null) {
			bacsiImpl.setTenBS(StringPool.BLANK);
		}
		else {
			bacsiImpl.setTenBS(TenBS);
		}

		if (Idphongkham == null) {
			bacsiImpl.setIdphongkham(StringPool.BLANK);
		}
		else {
			bacsiImpl.setIdphongkham(Idphongkham);
		}

		bacsiImpl.resetOriginalValues();

		return bacsiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Idbacsi = objectInput.readUTF();
		TenBS = objectInput.readUTF();
		Idphongkham = objectInput.readUTF();
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

		if (TenBS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenBS);
		}

		if (Idphongkham == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Idphongkham);
		}
	}

	public String Idbacsi;
	public String TenBS;
	public String Idphongkham;
}