
use lportal;

alter table lportal.vanban_vanban add foreign key (nguoikiID) references lportal.vanban_nguoiki (nguoikiID);

alter table lportal.vanban_vanban add foreign key (userID) references lportal.vanban_nguoidung(userId);

alter table lportal.vanban_vanban add foreign key (noiBHId) references lportal.vanban_noibanhanh(noiBHId);

use lportal;
create view vanbanlist
as
select kihieu,trichyeu,ngaybanhanh,hoten,tenloai,tennoibanhanh  from 
(((lportal.vanban_vanban inner join lportal.vanban_nguoiki on lportal.vanban_nguoiki.nguoikiID=lportal.vanban_vanban.nguoikiID)
inner join lportal.vanban_noibanhanh on lportal.vanban_vanban.noiBHID= lportal.vanban_noibanhanh.noiBHId)
inner join lportal.vanban_loaivb on lportal.vanban_vanban.loaiID= lportal.vanban_loaivb.loaiId)
where vanban_vanban.tinhtrang = true
;







