show databases;
use QLTGDT;
CREATE DATABASE QLTGDT;
DROP TABLE GIAOVIEN, CHUDE, CONGVIEC, DETAI, BOMON, GV_DT, KHOA, NGUOITHAN, THAMGIADT;

CREATE    TABLE GIAOVIEN (
          magv CHAR(5),
          hoten nvarchar (40),
          luong FLOAT,
          phai NCHAR(3) CHECK (
          phai = 'Nam'
OR        phai = N'Nữ'
          ),
          ngaysinh datetime,
          diachi nvarchar (100),
          gvqlcm CHAR(5),
          mabm NCHAR(5),
          PRIMARY KEY (magv)
          );


CREATE    TABLE GV_DT (
          magv CHAR(5),
          dienthoai CHAR(12),
          PRIMARY KEY (magv, dienthoai)
          );


CREATE    TABLE BOMON (
          mabm NCHAR(5),
          tenbm nvarchar (40),
          phong CHAR(5),
          dienthoai CHAR(12),
          truongbm CHAR(5),
          makhoa CHAR(4),
          ngaynhanchuc datetime,
          PRIMARY KEY (mabm)
          );


CREATE    TABLE KHOA (
          makhoa CHAR(4),
          tenkhoa nvarchar (40),
          namtl INT CHECK (
          1900 <= namtl
AND       namtl <= 2300
          ),
          phong CHAR(5),
          dienthoai CHAR(12),
          truongkhoa CHAR(5),
          ngaynhanchuc datetime,
          PRIMARY KEY (makhoa)
          );


CREATE    TABLE DETAI (
          madt CHAR(3),
          tendt nvarchar (100),
          capql nvarchar (40),
          kinhphi FLOAT,
          ngaybd datetime,
          ngaykt datetime,
          macd NCHAR(4),
          gvcndt CHAR(5),
          PRIMARY KEY (madt)
          );


CREATE    TABLE CHUDE (
          macd NCHAR(4),
          tencd nvarchar (50),
          PRIMARY KEY (macd)
          );


CREATE    TABLE CONGVIEC (
          madt CHAR(3),
          sott INT,
          tencv nvarchar (40),
          ngaybd datetime,
          ngaykt datetime,
          PRIMARY KEY (madt, sott)
          );


CREATE    TABLE THAMGIADT (
          magv CHAR(5),
          madt CHAR(3),
          stt INT,
          phucap FLOAT,
          ketqua nvarchar (40),
          PRIMARY KEY (magv, madt, stt)
          );


CREATE    TABLE NGUOITHAN (
          magv CHAR(5),
          ten nvarchar (20),
          ngsinh datetime,
          phai nvarchar (3) CHECK (
          phai = 'Nam'
OR        phai = N'Nữ'
          ),
          PRIMARY KEY (magv, ten)
          );


-- SET       contraints FOR EACH TABLE;
ALTER     TABLE GIAOVIEN ADD CONSTRAINT FK_GIAOVIEN_BOMON FOREIGN KEY (mabm) REFERENCES BOMON (mabm),
                intructions;CONSTRAINT FK_GIAOVIEN_GIAOVIEN FOREIGN KEY (gvqlcm) REFERENCES GIAOVIEN (magv);


ALTER     TABLE KHOA ADD CONSTRAINT FK_KHOA_GIAOVIEN FOREIGN KEY (truongkhoa) REFERENCES GIAOVIEN (magv);


ALTER     TABLE BOMON ADD CONSTRAINT FK_BOMON_KHOA FOREIGN KEY (makhoa) REFERENCES KHOA (makhoa),
CONSTRAINT FK_BOMON_GIAOVIEN FOREIGN KEY (truongbm) REFERENCES GIAOVIEN (magv);


ALTER     TABLE NGUOITHAN ADD CONSTRAINT FK_NGUOITHAN_GIAOVIEN FOREIGN KEY (magv) REFERENCES GIAOVIEN (magv);


ALTER     TABLE THAMGIADT ADD CONSTRAINT FK_PHANCONG_GIAOVIEN FOREIGN KEY (magv) REFERENCES GIAOVIEN (magv),
CONSTRAINT FK_PHANCONG_CONGVIEC FOREIGN KEY (madt, stt) REFERENCES CONGVIEC (madt, sott);


ALTER     TABLE DETAI ADD CONSTRAINT FK_DETAI_CHUDE FOREIGN KEY (macd) REFERENCES CHUDE (macd);


ALTER     TABLE DETAI ADD CONSTRAINT FK_DETAI_GIAOVIEN FOREIGN KEY (gvcndt) REFERENCES GIAOVIEN (magv);


ALTER     TABLE GV_DT ADD CONSTRAINT FK_DIENTHOAI_GIAOVIEN FOREIGN KEY (magv) REFERENCES GIAOVIEN (magv);


ALTER     TABLE CONGVIEC ADD CONSTRAINT FK_CONGVIEC_DETAI FOREIGN KEY (madt) REFERENCES DETAI (madt) Add infos INTO ALL tables;


-- SET       DATEFORMAT mdy;
INSERT    INTO KHOA
VALUES    (
          'CNTT',
          N'Công nghệ thông tin',
          1995,
          'B11',
          '0838123456',
          NULL,
          '02/20/2005'
          ),
          (
          'HH',
          N'Hóa học',
          1980,
          'B41',
          '0838456456',
          NULL,
          '10/15/2001'
          ),
          (
          'SH',
          N'Sinh học',
          1980,
          'B31',
          '0838454545',
          NULL,
          '10/11/2000'
          ),
          (
          'VL',
          N'Vật lý',
          1976,
          'B21',
          '0838223223',
          NULL,
          '09/18/2003'
          );


INSERT    INTO BOMON
VALUES    (
          N'CNTT',
          N'Công nghệ tri thức',
          'B15',
          '0838126126',
          NULL,
          'CNTT',
          NULL
          ),
          (
          N'HHC',
          N'Hóa hữu cơ',
          'B44',
          '838222222',
          NULL,
          'HH',
          NULL
          ),
          (
          N'HL',
          N'Hóa lý',
          'B42',
          '0838878787',
          NULL,
          'HH',
          NULL
          ),
          (
          N'HPT',
          N'Hóa phân tích',
          'B43',
          '0838777777',
          NULL,
          'HH',
          '10/15/2007'
          ),
          (
          N'HTTT',
          N'Hệ thống thông tin',
          'B13',
          '0838125125',
          NULL,
          'CNTT',
          '09/20/2004'
          ),
          (
          N'MMT',
          N'Mạng máy tính',
          'B16',
          '0838676767 ',
          NULL,
          'CNTT',
          '05/15/2005'
          ),
          (
          N'SH',
          N'Sinh hóa',
          'B33',
          '0838898989',
          NULL,
          'SH',
          NULL
          ),
          (
          N'VLĐT',
          N'Vật lý điện tử',
          'B23',
          '0838234234',
          NULL,
          'VL',
          NULL
          ),
          (
          N'VLƯD',
          N'Vật lý ứng dụng',
          'B24',
          '0838454545',
          NULL,
          'VL',
          '02/18/2006'
          ),
          (
          N'VS',
          N'Vi sinh',
          'B32',
          '0838909090',
          NULL,
          'SH',
          '01/01/2007'
          );


INSERT    INTO GIAOVIEN
VALUES    (
          '001',
          N'Nguyễn Hoài An',
          2000,
          N'Nam',
          '02/15/1973',
          N'25/3 Lạc Long Quân, Q.10, TP HCM',
          NULL,
          N'MMT'
          ),
          (
          '002',
          N'Trần Trà Hương',
          2500,
          N'Nữ',
          '06/20/1960',
          N'125 Trần Hưng Đạo, Q.1,TP HCM',
          NULL,
          N'HTTT'
          ),
          (
          '003',
          N'Nguyễn Ngọc Ánh',
          2200,
          N'Nữ',
          '05/11/1975',
          N'12/21 Võ Văn Ngân	Thủ Đức, TP HCM',
          '002',
          N'HTTT'
          ),
          (
          '004',
          N'Trương Nam Sơn',
          2300,
          N'Nam',
          '06/20/1959',
          N'215	Lý Thường Kiệt,TP Biên Hòa',
          NULL,
          N'VS'
          ),
          (
          '005',
          N'Lý Hoàng Hà',
          2500,
          N'Nam',
          '10/23/1954',
          N'22/5 Nguyễn Xí, Q.Bình Thạnh, TP HCM',
          NULL,
          N'VLĐT'
          ),
          (
          '006',
          N'Trần Bạch Tuyết',
          1500,
          N'Nữ',
          '05/20/1980',
          N'127	Hùng Vương, TP Mỹ Tho',
          '004',
          N'VS'
          ),
          (
          '007',
          N'Nguyễn An Trung',
          2100,
          N'Nam',
          '06/05/1976',
          N'234 3/2, TP Biên Hòa',
          NULL,
          N'HPT'
          ),
          (
          '008',
          N'Trần Trung Hiếu',
          1800,
          N'Nam',
          '08/06/1977',
          N'22/11 Lý Thường Kiệt, TP Mỹ Tho',
          '007',
          N'HPT'
          ),
          (
          '009',
          N'Trần Hoàng Nam',
          2000,
          N'Nam',
          '11/22/1975',
          N'234	Trấn Não, An Phú,TP HCM',
          '001',
          N'MMT'
          ),
          (
          '010',
          N'Phạm Nam Thanh',
          1500,
          N'Nam',
          '12/12/1980',
          N'221	Hùng Vương, Q.5, TP HCM',
          '007',
          N'HPT'
          );


INSERT    INTO GV_DT
VALUES    ('001', '0838912112'),
          ('002', '0913454545'),
          ('003', '0903656565'),
          ('003', '0838121212'),
          ('003', '0937125125'),
          ('006', '0937888888'),
          ('008', '0913232323'),
          ('008', '0653717171');


INSERT    INTO CHUDE
VALUES    (N'NCPT', N'Nghiên cứu phát triển'),
          (N'QLGD', N'Quản lý giáo dục'),
          (N'ƯDCN', N'Ứng dụng công nghệ');


INSERT    INTO DETAI (
          MADT,
          TENDT,
          KINHPHI,
          CAPQL,
          NGAYBD,
          NGAYKT,
          MACD,
          GVCNDT
          )
VALUES    (
          '001',
          N'HTTT quản lý các trường ĐH',
          20,
          N'ĐHQG',
          '10/20/2007',
          '10/20/2008',
          N'QLGD',
          '002'
          ),
          (
          '002',
          N'HTTT quản lý giáo vụ cho một Khoa',
          '20',
          N'Trường',
          '10/12/2000',
          '10/12/2001',
          N'QLGD',
          '002'
          ),
          (
          '003',
          N'Nghiên cứu chế tạo sợi Nanô Platin',
          '300',
          N'ĐHQG',
          '05/15/2008',
          '05/15/2010',
          N'NCPT',
          '005'
          ),
          (
          '004',
          N'Tạo vật liệu sinh học bằng màng ối người',
          '100',
          N'Nhà nước',
          '01/01/2007',
          '12/31/2009',
          N'NCPT',
          '004'
          ),
          (
          '005',
          N'Ứng dụng hóa học xanh',
          '200',
          N'Trường',
          '10/10/2003',
          '12/10/2004',
          N'ƯDCN',
          '007'
          ),
          (
          '006',
          N'Nghiên cứu tế bào gốc',
          '4000',
          N'Nhà nước',
          '10/20/2006',
          '10/20/2009',
          N'NCPT',
          '004'
          ),
          (
          '007',
          N'HTTT quản lý thư viện ở các trường ĐH',
          '20',
          N'Trường',
          '5/10/2009',
          '05/10/2010',
          N'QLGD',
          '001'
          );


SET       dateformat dmy;


INSERT    INTO CONGVIEC
VALUES    (
          '001',
          1,
          N'Khởi tạo và Lập kế hoạch',
          '20/10/2007',
          '20/12/2008'
          ),
          (
          '001',
          2,
          N'Xác định yêu cầu',
          '21/12/2008',
          '21/03/2008'
          ),
          (
          '001',
          3,
          N'Phân tích hệ thống',
          '22/03/2008',
          '22/5/2008'
          ),
          (
          '001',
          4,
          N'Thiết kế hệ thống',
          '23/05/2008',
          '23/06/2008'
          ),
          (
          '001',
          5,
          N'Cài đặt thử nghiệm',
          '24/06/2008',
          '20/10/2008'
          ),
          ('006', 1, N'Lấy mẫu', '20/10/2006', '20/02/2007'),
          ('006', 2, N'Nuôi cấy', '21/02/2007', '21/08/2008'),
          (
          '002',
          1,
          N'Khởi tạo và Lập kế hoạch',
          '10/05/2009',
          '10/07/2009'
          ),
          (
          '002',
          2,
          N'Xác định yêu cầu',
          '11/07/2009',
          '11/10/2009'
          ),
          (
          '002',
          3,
          N'Phân tích hệ thống',
          '12/10/2009',
          '20/12/2009'
          ),
          (
          '002',
          4,
          N'Thiết kế hệ thống',
          '21/12/2009',
          '22/03/2010'
          ),
          (
          '002',
          5,
          N'Cài đặt thử nghiệm',
          '23/03/2010',
          '10/05/2010'
          );


SET       dateformat mdy;


INSERT    INTO THAMGIADT
VALUES    ('003', '001', 1, 1, N'Đạt'),
          ('003', '001', 2, 0, N'Đạt'),
          ('002', '001', 4, 2, N'Đạt'),
          ('003', '001', 4, 1, N'Đạt'),
          ('004', '006', 1, 0, N'Đạt'),
          ('004', '006', 2, 1, N'Đạt'),
          ('006', '006', 2, 1.5, N'Đạt'),
          ('001', '002', 1, 0, NULL),
          ('001', '002', 2, 2, NULL),
          ('003', '002', 2, 0, NULL),
          ('009', '002', 3, 0.5, NULL),
          ('009', '002', 4, 1.5, NULL);


UPDATE    KHOA
SET       truongkhoa = '002'
WHERE     makhoa = 'CNTT'
UPDATE    KHOA;


SET       truongkhoa = '005'
WHERE     makhoa = 'VL'
UPDATE    KHOA;


SET       truongkhoa = '004'
WHERE     makhoa = 'SH'
UPDATE    KHOA;


SET       truongkhoa = '007'
WHERE     makhoa = 'HH'
UPDATE    BOMON;


SET       truongbm = '002'
WHERE     mabm = 'HTTT'
UPDATE    BOMON;


SET       truongbm = '001'
WHERE     mabm = 'MMT'
UPDATE    BOMON;


SET       truongbm = '005'
WHERE     mabm = N'VLƯD'
UPDATE    BOMON;


SET       truongbm = '004'
WHERE     mabm = 'VS'
UPDATE    BOMON;


SET       truongbm = '007'
WHERE     mabm = 'HPT'
INSERT    INTO NGUOITHAN
VALUES    ('001', N'Hùng', '1/14/1990', N'Nam'),
          ('001', N'Thủy', '12/8/1994', N'Nữ'),
          ('003', N'Thu', '9/3/1998', N'Nữ'),
          ('003', N'Hà', '9/3/1998', N'Nữ'),
          ('007', N'Vy', '2/14/2000', N'Nữ'),
          ('007', N'Mai', '3/26/2003', N'Nữ'),
          ('008', N'Nam', '5/6/1991', N'Nam'),
          ('009', N'An', '8/19/1996', N'Nam'),
          ('010', N'Nguyệt', '1/14/2006', N'Nữ');
