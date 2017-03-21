use lportal;
CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `portal`.`thongtindatkham` AS
    SELECT 
        `portal`.`u_bacsi`.`TenBS` AS `TenBS`,
        `portal`.`u_lichkham`.`Giodukien` AS `Giodukien`,
        `portal`.`u_phongkham`.`TenPK` AS `TenPK`,
        `portal`.`u_lichkham`.`Ngaykham` AS `Ngaykham`,
        `portal`.`u_dkcb`.`Hoten` AS `Hoten`,
        `portal`.`u_lichkham`.`Idlichkham` AS `Idlichkham`,
        `portal`.`u_dichvu`.`Mucthu` AS `Mucthu`,
        `portal`.`u_dichvu`.`Tendichvu` AS `Tendichvu`
    FROM
        ((((`portal`.`u_lichkham`
        JOIN `portal`.`u_bacsi` ON ((`portal`.`u_lichkham`.`Idbacsi` = `portal`.`u_bacsi`.`Idbacsi`)))
        JOIN `portal`.`u_phongkham` ON ((`portal`.`u_lichkham`.`Idphongkham` = `portal`.`u_phongkham`.`Idphongkham`)))
        JOIN `portal`.`u_dkcb` ON ((`portal`.`u_lichkham`.`Id` = `portal`.`u_dkcb`.`Id`)))
        JOIN `portal`.`u_dichvu` ON ((`portal`.`u_lichkham`.`Iddichvu` = `portal`.`u_dichvu`.`Iddichvu`)));
        
alter table u_lichkham add foreign key (Id) references u_dkcb(Id);
alter table u_lichkham add foreign key (Idbacsi) references u_bacsi(Idbacsi);
alter table u_lichkham add foreign key (Iddichvu) references u_dichvu(Iddichvu);
alter table u_lichkham add foreign key (Idphongkham) references u_phongkham(Idphongkham);