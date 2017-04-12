use lportal;
CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `thongtindatkham` AS
    SELECT 
        `kcb_bacsi`.`TenBS` AS `TenBS`,
        `kcb_lichkham`.`Giodukien` AS `Giodukien`,
        `kcb_phongkham`.`TenPK` AS `TenPK`,
        `kcb_lichkham`.`Ngaykham` AS `Ngaykham`,
        `kcb_dkcb`.`Hoten` AS `Hoten`,
        `kcb_lichkham`.`Idlichkham` AS `Idlichkham`,
        `kcb_dichvu`.`Mucthu` AS `Mucthu`,
        `kcb_dichvu`.`Tendichvu` AS `Tendichvu`
    FROM
        ((((`kcb_lichkham`
        JOIN `kcb_bacsi` ON ((`kcb_lichkham`.`Idbacsi` = `kcb_bacsi`.`Idbacsi`)))
        JOIN `kcb_phongkham` ON ((`kcb_lichkham`.`Idphongkham` = `kcb_phongkham`.`Idphongkham`)))
        JOIN `kcb_dkcb` ON ((`kcb_lichkham`.`Id` = `kcb_dkcb`.`Id`)))
        JOIN `kcb_dichvu` ON ((`kcb_lichkham`.`Iddichvu` = `kcb_dichvu`.`Iddichvu`)));
        
alter table kcb_lichkham add foreign key (Id) references kcb_dkcb(Id);
alter table kcb_lichkham add foreign key (Idbacsi) references kcb_bacsi(Idbacsi);
alter table kcb_lichkham add foreign key (Iddichvu) references kcb_dichvu(Iddichvu);
alter table kcb_lichkham add foreign key (Idphongkham) references kcb_phongkham(Idphongkham);