create table u_Bacsi (
	Idbacsi VARCHAR(75) not null primary key,
	TenBS VARCHAR(75) null,
	Idphongkham VARCHAR(75) null
);

create table u_DKCB (
	Id LONG not null primary key IDENTITY,
	Hoten VARCHAR(75) null,
	Diachi VARCHAR(75) null,
	Gioitinh BOOLEAN,
	Sodienthoai VARCHAR(75) null,
	Ngaysinh DATE null,
	Trieuchung VARCHAR(75) null
);

create table u_Dichvu (
	Iddichvu LONG not null primary key IDENTITY,
	Tendichvu VARCHAR(75) null,
	Mucthu DOUBLE,
	Ghichi VARCHAR(75) null,
	Idphongkham VARCHAR(75) null
);

create table u_Lichkham (
	Idbacsi VARCHAR(75) null,
	Id LONG,
	Idphongkham VARCHAR(75) null,
	Iddichvu LONG,
	Giodukien VARCHAR(75) null,
	Ngaykham DATE null,
	Idlichkham INTEGER not null primary key IDENTITY
);

create table u_Phongkham (
	Idphongkham VARCHAR(75) not null primary key,
	TenPK VARCHAR(75) null
);