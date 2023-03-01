Testing Documentation & Test Case

Pada Materi kali ini materi yang dibahas yaitu apa itu test secenario dan test case. 
Test Scenario adalah sebuah dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun oleh software tester. agar sistem yang dapat ditest dapat memenuhi ketentuan yang diinginkan oleh user memenuhi standart tertentu serta dapat berfungsi dengan baik. 
Tujuan dibuatnya Test Scenario yaitu memudahkan developer dan tester untuk melakukan testing, untuk menjadi dasar pengembangan bagi pengembangan projek, sebagai dasar client atau product owner menyesuaikan dengan sistem requirement dan juga menggunakan tools yang ada di test scenario seperti google spreadsheet, testrail test io dan lain-lain. Scenario yang baik berisikan 
1. in language system requirement => sistem requirement adalah kunci sehingga kita dapat menyusun scenario test sesuai flow yang telah ditentukan
2. Give context => user bersikap seolah olah perlu melakukan hal tersebut
3. Give details => memberikan rincian secara spesifik hal-hal yang perlu diketahui oleh user
4. Berikan penjelasan secara details test step dan spesifikasi expect result sehingga memudahkan proses testing.
5. Complete => user dapat melakukan apapun sesuai dengan user requirement yang telah diberikan
6. Koheren => anatara scenario satu dengan yang lain dan antara test case satu dengan yang lain harus saling berkesinambungan
7. Approve => lengkapi dengan scenario yang telah ditentukan seperti result pass or failed

Test case atau bisa disebut uji kasus suatu rancangan atau rangkaian mengenai tindakan yang dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur tertentu dari sebuah perangkat lunak. Tujuannya untuk memastikan bahwa suatu sistem dapat berjalan dengan baik sesuai dengan kebutuhan awal serta mampu memberikan respon tentang suatu hal yang tidak valid. Komponen test case yaitu test case id, test case description, test case condition, test steps, expected results, status dan actual result


Tracking Management Tools
Pada Materi Tracking Management menjelaskan 
1. pengertian Jira. 
Jira adalah alat bantu yang bertujuan untuk pelacakan bugs, pelacakan issue dan manajemen proyek
2. langkah-langkah membuat project baru dari Jira
3. Lalu pada project board di Jira terdapat
	a. TO DO : panel ini berisi story yang akan dikerjakan dan sudah diprioritaskan saat planing.
			Story yang ditempatkan paling atas menandakan bahwa story tersebut merupakan prioritas utama
	b. IN PROGRES : Panel ini berisi story yang sedang dikerjakan oleh software engineer
	c. Finish : Panel ini berisi story yang telah selesai dikerjakan oleh para software engineer, namun belum siap untuk tahap testing
	d. Deliver : Panel ini berisi story yang siap memasuki tahap testing oleh para quality engineer
	e. Need Fix : Panel ini berisi hasil proses testing yang tidak lolos criteria oleh team development
	f. Done : Panel ini berisi fitur yang sudah lolos dari criteria testing oleh team development
4. 7 Point penting yang perlu diperhatikan dalam membuat issue : project, issues type, reporter, description,priority,assignee, sprint
5. Macam-macam type Issues : story (membuat fitur baru), task (perincian tugas), bug (penemuan bug),dan epic (pengelompokan task)
