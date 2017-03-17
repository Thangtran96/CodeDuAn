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

import com.vanban.model.nguoidung;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing nguoidung in entity cache.
 *
 * @author nguye
 * @see nguoidung
 * @generated
 */
public class nguoidungCacheModel implements CacheModel<nguoidung>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

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
		sb.append(", tinhtrang=");
		sb.append(tinhtrang);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public nguoidung toEntityModel() {
		nguoidungImpl nguoidungImpl = new nguoidungImpl();

		nguoidungImpl.setUserId(userId);

		if (hoten == null) {
			nguoidungImpl.setHoten(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setHoten(hoten);
		}

		if (ngaysinh == Long.MIN_VALUE) {
			nguoidungImpl.setNgaysinh(null);
		}
		else {
			nguoidungImpl.setNgaysinh(new Date(ngaysinh));
		}

		nguoidungImpl.setGioitinh(gioitinh);

		if (diachi == null) {
			nguoidungImpl.setDiachi(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setDiachi(diachi);
		}

		if (sdt == null) {
			nguoidungImpl.setSdt(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setSdt(sdt);
		}

		if (donvi == null) {
			nguoidungImpl.setDonvi(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setDonvi(donvi);
		}

		if (mail == null) {
			nguoidungImpl.setMail(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setMail(mail);
		}

		if (matkhau == null) {
			nguoidungImpl.setMatkhau(StringPool.BLANK);
		}
		else {
			nguoidungImpl.setMatkhau(matkhau);
		}

		nguoidungImpl.setTinhtrang(tinhtrang);

		nguoidungImpl.resetOriginalValues();

		return nguoidungImpl;
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
		tinhtrang = objectInput.readBoolean();
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

		objectOutput.writeBoolean(tinhtrang);
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
	public boolean tinhtrang;
}