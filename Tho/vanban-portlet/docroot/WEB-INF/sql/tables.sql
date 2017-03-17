create table vanban_LoaiVB (
	loaiId LONG not null primary key,
	tenloai VARCHAR(75) null,
	ghichu VARCHAR(75) null,
	tinhtrang BOOLEAN
);

create table vanban_nguoidung (
	userId LONG not null primary key,
	hoten VARCHAR(75) null,
	ngaysinh DATE null,
	gioitinh INTEGER,
	diachi VARCHAR(75) null,
	sdt VARCHAR(75) null,
	donvi VARCHAR(75) null,
	mail VARCHAR(75) null,
	matkhau VARCHAR(75) null,
	tinhtrang BOOLEAN
);

create table vanban_nguoiki (
	nguoikiID LONG not null primary key,
	hoten VARCHAR(75) null,
	ngaysinh DATE null,
	gioitinh INTEGER,
	donvi VARCHAR(75) null,
	chucvu VARCHAR(75) null,
	tinhtrang BOOLEAN
);

create table vanban_noiBanHanh (
	noiBHId LONG not null primary key,
	tennoibanhanh VARCHAR(75) null,
	ghichu VARCHAR(75) null,
	tinhtrang BOOLEAN
);

create table vanban_vanban (
	vanbanId LONG not null primary key,
	kihieu VARCHAR(75) null,
	trichyeu VARCHAR(75) null,
	ngaybanhanh DATE null,
	ngaytao DATE null,
	nguoikiID LONG,
	userID LONG,
	loaiID LONG,
	noiBHID LONG,
	tinhtrang BOOLEAN
);