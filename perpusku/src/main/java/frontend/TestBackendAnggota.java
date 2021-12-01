/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.*;

public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota a1 = new Anggota("Adinda", "Surabaya", "082178292019");
        Anggota a2 = new Anggota("Indana", "Mojokerto","081233421685");
        Anggota a3 = new Anggota("Nikmah", "Sidoarjo", "089423455432");
        
        // test insert
        a1.save();
        a2.save();
        a3.save();

        //test update 
        a2.setNama("Syarifah");
        a2.save();

        // test delete
        a3.delete();

        // test select all
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat()
                                + " , telepon: " + a.getTelepon());
        }

        // test search
        for(Anggota a : new Anggota().search("Malang")){
            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat() 
                                + " , telepon: " + a.getTelepon());
        }
    }
}