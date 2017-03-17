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

import com.vanban.model.vanban;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing vanban in entity cache.
 *
 * @author nguye
 * @see vanban
 * @generated
 */
public class vanbanCacheModel implements CacheModel<vanban>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{vanbanId=");
		sb.append(vanbanId);
		sb.append(", kihieu=");
		sb.append(kihieu);
		sb.append(", trichyeu=");
		sb.append(trichyeu);
		sb.append(", ngaybanhanh=");
		sb.append(ngaybanhanh);
		sb.append(", ngaytao=");
		sb.append(ngaytao);
		sb.append(", nguoikiID=");
		sb.append(nguoikiID);
		sb.append(", userID=");
		sb.append(userID);
		sb.append(", loaiID=");
		sb.append(loaiID);
		sb.append(", noiBHID=");
		sb.append(noiBHID);
		sb.append(", tinhtrang=");
		sb.append(tinhtrang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public vanban toEntityModel() {
		vanbanImpl vanbanImpl = new vanbanImpl();

		vanbanImpl.setVanbanId(vanbanId);

		if (kihieu == null) {
			vanbanImpl.setKihieu(StringPool.BLANK);
		}
		else {
			vanbanImpl.setKihieu(kihieu);
		}

		if (trichyeu == null) {
			vanbanImpl.setTrichyeu(StringPool.BLANK);
		}
		else {
			vanbanImpl.setTrichyeu(trichyeu);
		}

		if (ngaybanhanh == Long.MIN_VALUE) {
			vanbanImpl.setNgaybanhanh(null);
		}
		else {
			vanbanImpl.setNgaybanhanh(new Date(ngaybanhanh));
		}

		if (ngaytao == Long.MIN_VALUE) {
			vanbanImpl.setNgaytao(null);
		}
		else {
			vanbanImpl.setNgaytao(new Date(ngaytao));
		}

		vanbanImpl.setNguoikiID(nguoikiID);
		vanbanImpl.setUserID(userID);
		vanbanImpl.setLoaiID(loaiID);
		vanbanImpl.setNoiBHID(noiBHID);
		vanbanImpl.setTinhtrang(tinhtrang);

		vanbanImpl.resetOriginalValues();

		return vanbanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		vanbanId = objectInput.readLong();
		kihieu = objectInput.readUTF();
		trichyeu = objectInput.readUTF();
		ngaybanhanh = objectInput.readLong();
		ngaytao = objectInput.readLong();
		nguoikiID = objectInput.readLong();
		userID = objectInput.readLong();
		loaiID = objectInput.readLong();
		noiBHID = objectInput.readLong();
		tinhtrang = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(vanbanId);

		if (kihieu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(kihieu);
		}

		if (trichyeu == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trichyeu);
		}

		objectOutput.writeLong(ngaybanhanh);
		objectOutput.writeLong(ngaytao);
		objectOutput.writeLong(nguoikiID);
		objectOutput.writeLong(userID);
		objectOutput.writeLong(loaiID);
		objectOutput.writeLong(noiBHID);
		objectOutput.writeBoolean(tinhtrang);
	}

	public long vanbanId;
	public String kihieu;
	public String trichyeu;
	public long ngaybanhanh;
	public long ngaytao;
	public long nguoikiID;
	public long userID;
	public long loaiID;
	public long noiBHID;
	public boolean tinhtrang;
}