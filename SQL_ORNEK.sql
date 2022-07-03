

create table yazarlar
(
    id    serial primary key,
    ad    varchar(100),
    soyad varchar(100),
    unvan varchar(200)
);

insert into yazarlar (ad, soyad, unvan)
values ('Orhan', 'Pamuk', 'Nobel Ödüllü');

create table kitaplar
(
    id       serial primary key,
    kitap_ad varchar(100),
    yil      date default current_date,
    fiyat    smallint,
    yazar_id int
);

ALTER TABLE kitaplar
    ADD CONSTRAINT fk_kitaplar
        FOREIGN KEY (yazar_id)
            references yazarlar (id) ON DELETE CASCADE ON UPDATE CASCADE;


insert into kitaplar (kitap_ad, fiyat, yazar_id)
values ('Benim Adım Kırmızı', 25, 2);


create table yayin_evi
(
    id serial primary key,
    ad varchar not null
);
insert into yayin_evi (ad)
values ('Palma Yayın Evi');

ALTER TABLE yazarlar
    ADD COLUMN yayin_evi_id int;

alter table yazarlar
    add constraint fk_yazarlar foreign key (yayin_evi_id) references yayin_evi (id)
        on update cascade on delete cascade;

update yazarlar
set yayin_evi_id = 1
where yayin_evi_id is null;


-- select * from TABLO_ADI
-- left join ILIŞKİSİ_OLAN_TABLO_ADI on ILIŞKİSİ_OLAN_TABLO_ADI.İLİŞKİLİ_KOLON_ADI  = TABLO_ADI.İLİŞKİLİ_KOLON_ADİ

select ki.kitap_ad,
       ki.fiyat,
       ki.yil,
       yazar.ad,
       yazar.soyad,
       yazar.unvan,
       yayin_evi.ad
from kitaplar ki
         left join yazarlar yazar on yazar.id = ki.yazar_id
         left join yayin_evi on yayin_evi.id = yazar.yayin_evi_id;

delete
from yazarlar
where id = 1;

create table customers
(
    customer_id   int generated always as IDENTITY,
    customer_name varchar(255) not null,
    PRIMARY KEY (customer_id)
);


create table contacts
(
    contact_id   int generated always as IDENTITY,
    customer_id  int,
    contact_name varchar(255) not null,
    phone        varchar(15),
    email        varchar(255),
    primary key (contact_id),
    CONSTRAINT fk_customer
        FOREIGN KEY (customer_id)
            REFERENCES customers (customer_id)
);



insert into customers (customer_name)
values ('Ahmet'),
       ('Mehmet'),
       ('Hasan'),
       ('Buse'),
       ('Sena'),
       ('Hatice'),
       ('Burak'),
       ('Kemal'),
       ('Mustafa'),
       ('Şafak'),
       ('Ayşe');


insert into contacts (customer_id, contact_name, phone, email)
values (1, 'Alican Can', '555', 'ali@can.com'),
       (2, 'Burak Kut', '65', 'bkut@kut.com'),
       (2, 'Hayari', '44', 'hay@dari.com');


select *
from contacts c
         left join customers c2 on c.customer_id = c2.customer_id;

select *
from contacts c
         right join customers c2 on c2.customer_id = c.customer_id;


select *
from contacts c
         inner join customers c2 on c2.customer_id = c.customer_id;

select *
from contacts c
         full outer join customers c2 on c.customer_id = c2.customer_id;


select *
from contacts c
         left join customers c2 on c.customer_id = c2.customer_id
order by contact_id desc;



create table telefon
(
    id      serial primary key,
    seri_no varchar(30),
    model   varchar(10),
    marka   varchar(50)
);

create table rehber
(
    id         serial primary key,
    numara     int not null,
    telefon_id int not null,
    constraint fk_rehber
        foreign key (telefon_id)
            references telefon (id)
            on delete cascade
            on update cascade
);


insert into telefon (seri_no, model, marka)
values ('Ab1234', 'AXC56', 'Samsung'),
       ('Ab6523', 'CX10', 'Vestel');

select *
from telefon;

insert into rehber (numara, telefon_id)
values (555, 1),
       (666, 2);

select * from telefon
left join rehber on telefon.id = rehber.telefon_id
order by  telefon.marka desc;


delete from telefon where id = 2;

