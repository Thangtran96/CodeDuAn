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

import com.dkcb.model.Khoa;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Khoa in entity cache.
 *
 * @author hoang_000
 * @see Khoa
 * @generated
 */
public class KhoaCacheModel implements CacheModel<Khoa>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{Idphongkham=");
		sb.append(Idphongkham);
		sb.append(", TenPK=");
		sb.append(TenPK);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Khoa toEntityModel() {
		KhoaImpl khoaImpl = new KhoaImpl();

		if (Idphongkham == null) {
			khoaImpl.setIdphongkham(StringPool.BLANK);
		}
		else {
			khoaImpl.setIdphongkham(Idphongkham);
		}

		if (TenPK == null) {
			khoaImpl.setTenPK(StringPool.BLANK);
		}
		else {
			khoaImpl.setTenPK(TenPK);
		}

		khoaImpl.resetOriginalValues();

		return khoaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		Idphongkham = objectInput.readUTF();
		TenPK = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (Idphongkham == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Idphongkham);
		}

		if (TenPK == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenPK);
		}
	}

	public String Idphongkham;
	public String TenPK;
}