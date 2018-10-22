/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan43gajipegawai;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S
 * NIM : 10117119
 * Kelas : PBO 3
 * Deskripsi Program : Program ini dapat menampilkan tunjangan, gajipokok,
 * uang transport dan total gaji
 */
public class PBO310117119Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 N0. 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan()
                ,gp.getUangTransport(),gp.getGajiPokok()));
        gp.tampilData(gp.getNama(),gp.getAlamat(),
                gp.getUangTunjangan(),gp.getUangTransport()
                ,gp.getGajiPokok(),gp.getTotalGaji());
    }
    
}
