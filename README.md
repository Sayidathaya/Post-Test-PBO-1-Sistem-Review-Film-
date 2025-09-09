# Post Test PBO 1 Sistem-Review Film
## Sayid Rafi A'thaya
## 2409116036
## SI Kelas A Akt 24


# 🎬 Sistem Manajemen Rating Film

## 📌 Deskripsi Singkat

Program ini adalah aplikasi sederhana berbasis **Java Console** untuk mengelola data film beserta ratingnya.
Fitur utama program:

* Menambahkan film beserta ratingnya
* Menampilkan daftar semua film dan rating
* Memperbarui rating film yang sudah ada
* Keluar dari program

Program dibuat menggunakan **ArrayList**, **percabangan (switch-case)**, dan **perulangan** sesuai dengan materi **Basic Java**.

---

## 🔄 Alur Program

1. **Menu Utama**
   Saat program dijalankan, user akan melihat menu:

   ```
   === Sistem Manajemen Rating Film ===
   1. Tambah Film
   2. Tampilkan Semua Film
   3. Update Rating Film
   4. Keluar
   ```

   User memilih menu dengan memasukkan angka (1–4).

2. **Tambah Film**

   * User diminta memasukkan **judul film**.
   * User diminta memasukkan **rating film (0.0 – 10.0)**.
   * Data film disimpan ke dalam `ArrayList`.

3. **Tampilkan Semua Film**

   * Jika belum ada data, akan muncul pesan **"Belum ada data film."**
   * Jika ada data, semua film ditampilkan dengan format:

     ```
     1. Judul Film | Rating: 8.5
     2. Judul Film Lain | Rating: 9.0
     ```

4. **Update Rating Film**

   * User memasukkan **judul film** yang ingin diupdate.
   * Jika judul ditemukan, user diminta memasukkan **rating baru**, lalu data diperbarui.
   * Jika judul tidak ditemukan, muncul pesan **"Film tidak ditemukan."**

5. **Keluar Program**

   * Program berhenti saat user memilih menu **4**.

---

## ⚙️ Teknologi yang Digunakan

* Java (Basic)
* ArrayList, Scanner, Percabangan, dan Perulangan
