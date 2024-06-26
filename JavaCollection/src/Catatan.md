Nama : Putri Anastasya Br Marpaung
NIM : 235150700111024


# Java Collection

## Pengenalan Java Collection
Java Collection menyediakan segalanya yang berhubungan dengan koleksi, sehingga kita dapat langsung menggunakannya. Java Collection terdiri dari:

- **Interfaces:** Merupakan representasi kontrak dari koleksi. Semua koleksi di Java memiliki kontrak interface.
- **Implementations:** Java menyediakan implementasi kelas untuk koleksi, yang dapat langsung digunakan.
- **Algorithms:** Java juga menyediakan algoritma-algoritma umum yang digunakan dalam koleksi, seperti pencarian dan pengurutan data.

### Java Collection Interface
- **Iterable & Iterator Interface:**
  - `Iterable` Interface: Ini adalah induk untuk semua koleksi di Java, kecuali Map. Iterable digunakan untuk mendukung loop for-each.
  - `Iterator` Interface: Iterator mendefinisikan cara mengakses elemen dalam koleksi secara sequential. Sebelum adanya for-each di Java 5, iterasi koleksi biasanya dilakukan secara manual menggunakan objek Iterator.
- **Collection Interface:** Induk dari semua koleksi di Java. Collection digunakan untuk memanipulasi data koleksi, seperti menambah, menghapus, dan memeriksa isi koleksi.
- **List Interface:** Struktur data koleksi yang memungkinkan elemen duplikat dan mempertahankan urutan data berdasarkan posisi. List memiliki indeks, sehingga elemen dapat diakses menggunakan nomor indeks.

#### Implementasi List
- **ArrayList Class:** Implementasi List menggunakan array. Default kapasitas array di ArrayList adalah 10, namun akan diperluas secara otomatis ketika array penuh.
- **LinkedList Class:** Implementasi List dengan struktur data Double Linked List. Dibandingkan dengan ArrayList, LinkedList memiliki keunggulan dalam operasi penambahan dan penghapusan elemen di tengah-tengah list.

##### ArrayList vs LinkedList
| Operasi | ArrayList | LinkedList |
|---------|-----------|------------|
| add     | Cepat jika masih cukup kapasitas | Cepat karena menambah di akhir |
| get     | Cepat dengan menggunakan indeks | Lambat karena pencarian dari awal |
| set     | Cepat dengan menggunakan indeks | Lambat karena pencarian dari awal |
| remove  | Lambat karena perlu menggeser data | Cepat karena mengubah pointer |

### Queue Interface
- **Queue:** Implementasi dari struktur data Antrian atau FIFO (First In First Out).

#### Array Dequeue vs LinkedList vs Priority Queue
- **ArrayDeque:** Menggunakan array sebagai implementasi queue.
- **LinkedList:** Menggunakan double linked list.
- **PriorityQueue:** Menggunakan array dan diurutkan menggunakan Comparable atau Comparator.

### Deque Interface
- **Deque:** Singkatan dari double-ended queue, artinya queue yang dapat beroperasi dari depan atau belakang. Mendukung operasi FIFO dan LIFO (Last In First Out).

### Map Interface
- **Map:** Struktur data collection yang berisi mapping antara key dan value. Setiap key harus unik. Mirip dengan Array, namun key tidak terbatas pada integer sebagai index.

#### HashMap
- **HashMap:** Implementasi Map yang menggunakan `hashCode()` function untuk mendistribusikan key. Pengecekan data duplikat dilakukan menggunakan method `equals()`.
