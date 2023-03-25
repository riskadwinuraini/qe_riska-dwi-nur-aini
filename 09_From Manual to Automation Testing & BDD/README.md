API Testing adalah Test yang dilakukan pada layer dimana API didesign untuk berinteraksi atau komunikasi pada aplikasi yang dipastikan pada functional testnya dimana melalui serangkaian test yang diharapkan dapat memberikan gambar respon bagaimana aplikasi web sebelum atau tanpa UI siap.
API testing dibedakan menjadi :
1. Functionality : memvalidasi suatu fitur apakah sudah berfungsi atau belum
2. Load test : menguji kekuatan suatu sistem apakah mampu mengolah data yang diberikan
3. Security : menguji keamanan dari suatu sistem

Perbedaan Unit Test Dan API Test

Unit Test : Dilakukan dev, fungsi-fungsi terpisah, Dev bisa mengakses source code, Hanya dasar functionality yang di test, scopenya terbatas, biasanya dilakukan sebelum build
API Test : tester perform it, end to end, tidak bisa mengakses source code, hanya fungsi API saja, Semua functional issue, scopenya lebih luas, dilakukan setelah build

API Testing Process
Spesification Review => Spesification Development => Framework Development => Test Case Development => Execution & Report