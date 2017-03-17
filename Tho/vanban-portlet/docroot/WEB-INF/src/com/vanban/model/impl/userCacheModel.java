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

import com.vanban.model.user;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing user in entity cache.
 *
 * @author nguye
 * @see user
 * @generated
 */
public class userCacheModel implements CacheModel<user>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{userId=");
		sb.append(userId);
		sb.append(", hoten=");
		sb.append(hoten);
		sb.append(", ngaysinh=");
		sb.append(ngaysinh);
		sb.append(", gioitinh=");
		sb.append(gioitinh);
		sb.append(", diachi=");
		sb.append(diachi);
		sb.append(", sdt=");
		sb.append(sdt);
		sb.append(", donvi=");
		sb.append(donvi);
		sb.append(", mail=");
		sb.append(mail);
		sb.append(", matkhau=");
		sb.append(matkhau);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public user toEntityModel() {
		userImpl userImpl = new userImpl();

		userImpl.setUserId(userId);

		if (hoten == null) {
			userImpl.setHoten(StringPool.BLANK);
		}
		else {
			userImpl.setHoten(hoten);
		}

		if (ngaysinh == Long.MIN_VALUE) {
			userImpl.setNgaysinh(null);
		}
		else {
			userImpl.setNgaysinh(new Date(ngaysinh));
		}

		userImpl.setGioitinh(gioitinh);

		if (diachi == null) {
			userImpl.setDiachi(StringPool.BLANK);
		}
		else {
			userImpl.setDiachi(diachi);
		}

		if (sdt == null) {
			userImpl.setSdt(StringPool.BLANK);
		}
		else {
			userImpl.setSdt(sdt);
		}

		if (donvi == null) {
			userImpl.setDonvi(StringPool.BLANK);
		}
		else {
			userImpl.setDonvi(donvi);
		}

		if (mail == null) {
			userImpl.setMail(StringPool.BLANK);
		}
		else {
			userImpl.setMail(mail);
		}

		if (matkhau == null) {
			userImpl.setMatkhau(StringPool.BLANK);
		}
		else {
			userImpl.setMatkhau(matkhau);
		}

		userImpl.resetOriginalValues();

		return userImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userId = objectInput.readLong();
		hoten = objectInput.readUTF();
		ngaysinh = objectInput.readLong();
		gioitinh = objectInput.readInt();
		diachi = objectInput.readUTF();
		sdt = objectInput.readUTF();
		donvi = objectInput.readUTF();
		mail = objectInput.readUTF();
		matkhau = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(userId);

		if (hoten == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(hoten);
		}

		objectOutput.writeLong(ngaysinh);
		objectOutput.writeInt(gioitinh);

		if (diachi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(diachi);
		}

		if (sdt == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(sdt);
		}

		if (donvi == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(donvi);
		}

		if (mail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mail);
		}

		if (matkhau == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(matkhau);
		}
	}

	public long userId;
	public String hoten;
	public long ngaysinh;
	public int gioitinh;
	public String diachi;
	public String sdt;
	public String donvi;
	public String mail;
	public String matkhau;
}