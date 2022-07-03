-- Tablomuzu oluşturuyoruz
-- DDL
CREATE TABLE public.ogrenciler
(
    id    serial,
    ad    varchar not null,
    soyad varchar not null,
    tc_no int     not null
);

-- DDL VERİ YAPISI TINIMLAMA DİLİ
-- CREATE(OLUŞTURMA) ALTER(GÜNCELLEME) DROP(SİLME)

-- TABLOMUZA KAYIT ATIYORUZ
INSERT INTO public.ogrenciler(ad, soyad, tc_no)
VALUES ('Leman', 'Hasan', 16);

-- ÖĞRENCİLER TABLOSUNDAKİ TÜM KAYITLARI LİSTELİYORUZ
SELECT *
FROM public.ogrenciler;

SELECT id, ad, soyad, tc_no
FROM ogrenciler;

SELECT ad, soyad
FROM public.ogrenciler;

-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2 OLAN KAYDI GETİRİR
SELECT *
FROM ogrenciler
WHERE id = 2;


-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2 VE TC Sİ 12 OLAN KAYDI GETİRİR
SELECT *
FROM ogrenciler
WHERE id = 2
  AND tc_no = 12;

-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2 VEYA ID Sİ 3 OLAN KAYDI GETİR
SELECT *
FROM ogrenciler
WHERE id = 2
   OR id = 3;

--ÖĞRENCİLER TABLOSUNDA ID DEĞERİ 2 OLAN KAYDIN ADINI Kerim olarak değiştir.
UPDATE ogrenciler
SET ad = 'KERİM'
WHERE id = 2;

UPDATE ogrenciler
Set ad    = 'Alican',
    tc_no = 25
where id = 2;


-- ÖĞRENCİLER TABLOSUNDA SOYADI U İLE BİTEN KAYITLARI GETİRİR
select *
from ogrenciler
where soyad LIKE '%an';

-- ÖĞRENCİLER TABLOSUNDA SOYADI H İLE BAŞLAYAN KAYITLARI GETİRİR
select *
from ogrenciler
where soyad LIKE 'H%';

-- ÖĞRENCİLER TABLOSUNDA SOYADINDA U GEÇEN  KAYITLARI GETİRİR
select *
from ogrenciler
where soyad LIKE '%u%';

-- ÖĞRENCİLER TABLOSUNDA ID Sİ 2
DELETE
FROM ogrenciler
WHERE id = 2;


-- ÖĞRENCİLER TABLOSUNA Varchar tipinde cinsiyeti isminde bir kolon oluşturur
ALTER TABLE ogrenciler
    ADD COLUMN cinsiyet VARCHAR;


-- VAROLAN BİR KOLONU GÜNCELLER
ALTER TABLE ogrenciler
    ALTER COLUMN cinsiyet TYPE VARCHAR(10);


-- CİNSİYETİ BOŞ OLAN KAYITLARI GETİR
SELECT *
FROM ogrenciler
WHERE ogrenciler.cinsiyet IS NULL;

-- CİNSİYETİ BOŞ OLAN KAYITLARI GETİR
SELECT *
FROM ogrenciler
WHERE ogrenciler.cinsiyet IS NOT NULL;

update ogrenciler
set cinsiyet = null
where cinsiyet is not null;


-- ÖĞRENCİLER TABLOSUNDA CİNSİYETİ ADINDAKI KOLONU GENDER OLARAK DEĞİŞTİR
ALTER TABLE ogrenciler
    RENAME COLUMN cinsiyet TO gender;


select tc_no as KIMLIK_NO
from ogrenciler; --AS TAKMA ISIM VERIR

SELECT id, ad, soyad, tc_no AS kimlik_no, gender AS cinsiyet
FROM ogrenciler;



CREATE TABLE distinct_demo
(
    id     serial NOT NULL PRIMARY KEY,
    bcolor VARCHAR,
    gcolor VARCHAR
);

ALTER TABLE distinct_demo
    RENAME COLUMN gcolor to fcolor;

INSERT INTO distinct_demo(bcolor, fcolor)
VALUES ('red', 'red'),
       ('red', 'red'),
       ('red', NULL),
       (NULL, 'red'),
       ('red', 'green'),
       ('red', 'blue'),
       ('green', 'red'),
       ('green', 'blue'),
       ('green', 'green'),
       ('blue', 'red'),
       ('blue', 'green'),
       ('blue', 'blue');

select distinct bcolor, fcolor
from distinct_demo; -- Distinct tekrar eden veriyi teke indirir

SELECT DISTINCT ON (bcolor, fcolor) bcolor, fcolor
FROM distinct_demo;


select *
from distinct_demo
where id in (3, 5, 9, 10); --In komutu liste olarak verilen paramertrelere göre çalışır

select *
from distinct_demo
where id between 2 and 6; -- Between aralık vererek sorgu yapmamızı sağlar


CREATE TABLE stok_durumu
(
    id          serial  not null primary key,
    urun_adi    varchar not null,
    stok_durumu boolean default 't' -- default değer eğer hiç bir değer atanmazsa atanır
);

INSERT INTO stok_durumu(urun_adi, stok_durumu)
VALUES ('Elma', 't'),
       ('Armut', '1'),
       ('Kiraz', 'y'),
       ('Karpuz', 'yes'),
       ('Enginar', 'no'),
       ('Kereviz', '0'),
       ('Bamya', 'f'),
       ('Ebegümeci', 'n');

select * from stok_durumu;


CREATE TABLE kitaplar
(
    id serial not null primary key ,
    baslik varchar(255) not null ,
    sayfa_sayisi smallint not null check ( sayfa_sayisi > 0 )
);

insert into kitaplar (baslik, sayfa_sayisi)
values ('Suç ve Ceza', 1);


CREATE TABLE dokumanlar
(
    id serial not null primary key ,
    baslik  varchar(255) not null ,
    eklenme_tarihi DATE not null default current_date
);

insert into dokumanlar (baslik)
values ('ABC Proje Dosyası');


SELECT now(); -- Şuanki zamanı verir

SELECT CURRENT_DATE; -- sadece tarihi verir

select  to_char(now()::date, 'dd.mm.yyyy'); -- Şuanki tarihi istediğimiz formata göre çevirir

SELECT  age('1993-11-20 03:00:00', eklenme_tarihi) from dokumanlar;
