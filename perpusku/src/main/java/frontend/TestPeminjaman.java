/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

/**
 *
 * @author LENOVO
 */
import backend.*;

public class TestPeminjaman {

    public static void main(String[] args) {
//        Anggota anggota1 = new Anggota().getById(1);
//        Anggota anggota2 = new Anggota().getById(2);
//        Buku buku1 = new Buku().getById(1);
//        Buku buku2 = new Buku().getById(2);
//
//        Peminjaman pinjam1 = new Peminjaman(anggota1,buku1, "20211124","20211130");
//        Peminjaman pinjam2 = new Peminjaman(anggota1,buku2, "20211124","20211130");
//        Peminjaman pinjam3 = new Peminjaman(anggota2,buku2, "202111227","20211202");
//
//        // test insert
//        pinjam1.save();
//        pinjam2.save();
//
//        // test update
//        pinjam3.setBuku(buku2);
//        pinjam2.save();
//
//        // test delete
//        pinjam3.delete();

        // test select all
        for (Peminjaman b : new Peminjaman().getAll()) {
            System.out.println("Nama Anggota: " + b.getAnggota().getNama() + ", Buku: " + b.getBuku().getJudul() );
        }

        // test search
        for (Peminjaman b : new Peminjaman().search("1")) {
            System.out.println("Nama Anggota: " + b.getAnggota().getNama() + ", Buku: " + b.getBuku().getJudul() );
        }
    }
}
