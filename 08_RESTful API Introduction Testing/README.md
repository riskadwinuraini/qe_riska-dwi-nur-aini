Pengertian Rest Full API


API (Application Programming Interface) merupakan penghubung komunikasi antara database dengan frontend dan pertukaran data antara 2 atau lebih software/sistem yang terpisah yang bertujuan untuk mempercepat proses development dengan menyediakan funtion.APi sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahu sistem apa yang harus dilakukan untuk mengirimkan permintaan tersebut. 
Rest API. 
Rest (Representational State Transfer) merupakan standart komunikasi berbasis web yang umumnya menggunakan http sebagai protokol komunikasi antar data. Rest API berisi aturan atau batasan yang dapat membatasi programmer untuk mengakses atau melakukan tindakan tertentu dari sebuah database. data yang digunakan pada rest api menggunakan json.

HTTP Method terbagi menjadi 4 yaitu GET (Membaca data), PUT (Membuat/mengganti data), POST (Membuat data baru), DELETE (Menghapus data yang ada)

HTTP Response Code jika terdapat pesan 200 OK artinya resquest yang kita kirim success,201 Created request yang kita kirim berhasil dibuat => POST DAN PUT, 400 Bad Request terjadi ketika melakukan POST PUT data tidak sesuai atau ada salah dalam format, 404 Not Found terjadi ketika resource yang diperlukan tidak ditemukan, 401 Unauthorized terjadi jika kita tidak melakukan authentification terlebih dahulu sebelum melakukan request, 405 Method not allow ketika salah http method.


Link Tugas https://docs.google.com/spreadsheets/d/12r0KBUTaGIZ9AptIMmF7Ov7v9zwfIExb/edit?usp=sharing&ouid=114955075383152863674&rtpof=true&sd=true