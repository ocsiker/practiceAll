--- 
   SELECT database ();

-- SHOW GRANTS FOR 'ocsiker'@'localhost';
-- PRIMARY KEY(attribute)
-- show variables like 'character_set%';
-- this line test comment in sql
   CREATE TABLE IF NOT EXISTS GIAOVIEN (
          magv CHAR(5),
          hoten VARCHAR(40),
          luong FLOAT,
          phai CHAR(3) CHECK (
          phai = 'Nam'
       OR phai = 'Nữ'
          ),
          ngaysinh datetime,
          diachi VARCHAR(100),
          gvqlcm CHAR(5),
          mabm CHAR(5),
          PRIMARY KEY (magv)
          );

   CREATE TABLE IF NOT EXISTS GV_DT (
          magv CHAR(5),
          dienthoai CHAR(12),
          PRIMARY KEY (magv, dienthoai)
          );

   CREATE TABLE IF NOT EXISTS BOMON (
          mabm CHAR(5),
          tenbm VARCHAR(40),
          phong CHAR(5),
          dienthoai CHAR(12),
          truongbm CHAR(5),
          makhoa CHAR(4),
          ngaynhanchuc datetime,
          PRIMARY KEY (mabm)
          );

   CREATE TABLE IF NOT EXISTS KHOA (
          makhoa CHAR(4),
          tenkhoa VARCHAR(40),
          namtl INT CHECK (
          1900 <= namtl
      AND namtl <= 2300
          ),
          phong CHAR(5),
          dienthoai CHAR(12),
          truongkhoa CHAR(5),
          ngaynhanchuc datetime,
          PRIMARY KEY (makhoa)
          );

   CREATE TABLE IF NOT EXISTS DETAI (
          madt CHAR(3),
          tendt VARCHAR(100),
          capql VARCHAR(40),
          kinhphi FLOAT,
          ngaybd datetime,
          ngaykt datetime,
          macd CHAR(4),
          gvcndt CHAR(5),
          PRIMARY KEY (madt)
          );

   CREATE TABLE IF NOT EXISTS CHUDE (
          macd CHAR(4),
          tencd VARCHAR(50),
          PRIMARY KEY (macd)
          );

   CREATE TABLE IF NOT EXISTS CONGVIEC (
          madt CHAR(3),
          sott INT,
          tencv VARCHAR(40),
          ngaybd datetime,
          ngaykt datetime,
          PRIMARY KEY (madt, sott)
          );

   CREATE TABLE IF NOT EXISTS THAMGIADT (
          magv CHAR(5),
          madt CHAR(3),
          stt INT,
          phucap INT,
          kequar VARCHAR(40),
          PRIMARY KEY (magv, madt, stt)
          );

   CREATE TABLE IF NOT EXISTS NGUOITHAN (
          magv CHAR(5),
          ten VARCHAR(20),
          ngsinh datetime,
          phai VARCHAR(3) CHECK (
          phai = 'Nam'
       OR phai = 'Nữ'
          ),
          PRIMARY KEY (magv, ten)
          );

   SELECT tables;

-- set constraints for database
