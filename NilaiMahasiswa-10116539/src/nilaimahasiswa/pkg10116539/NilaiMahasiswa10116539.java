/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa.pkg10116539;
class mahasiswa{
public String nama;
public String nim;

}
class nilaimhs{
private double val1;
private double val2;
private double val3;

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    public double getVal2() {
        return val2;
    }

    public void setVal2(double val2) {
        this.val2 = val2;
    }

    public double getVal3() {
        return val3;
    }

    public void setVal3(double val3) {
        this.val3 = val3;
    }

    
    public double nilaiakhir(double val1, double val2, double val3){
        return(0.2*val1)+(0.3*val2)+(0.5*val3);
 
    }
    public void inf(double nilaiakhir){
        char index;
        String keterangan;
        if (nilaiakhir > 80 ){
            index ='A';
            keterangan = "Sangat Baik";
        }else if (nilaiakhir > 68 ){
            index ='B';
            keterangan = "Baik";
        }else if (nilaiakhir > 56 ){
            index ='C';
            keterangan = "Cukup";
        }else if (nilaiakhir > 45 ){
            index ='D';
            keterangan = "Kurang";
        }else{
            index ='E';
            keterangan = "Sangat Kurang";
        }
        System.out.println("Index      = "+index);
        System.out.println("Keterangan = "+keterangan);
    }
    
}

/**
 *
 * @author
 * Nama  : Muhamad Rizki Ramadhan
 * NIM   : 10116539
 * Kelas : PBO-12
 */
public class NilaiMahasiswa10116539 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mhs = new mahasiswa();
        mhs.nama = ("Muhamad Rizki Ramadhan");
        mhs.nim = ("1.011.653.9");   
        nilaimhs nilai = new nilaimhs();
        nilai.setVal1(75);
        nilai.setVal2(45);
        nilai.setVal3(34);
        int i = 1;
        while (i<=4){
            System.out.println("Nama ke- "+i+"\t = "+mhs.nama);
            i++;
        }
        System.out.println("\n");
        i = 8;
        while (i >= 1){
            System.out.println("NIM ke= "+i+"\t = "+mhs.nim+"."+i);
            i--;
        }
        System.out.println("\n");
        System.out.println("Quis            = "+nilai.getVal1());
        System.out.println("UTS             = "+nilai.getVal2());
        System.out.println("UAS             = "+nilai.getVal3());
        System.out.println("\n");
        System.out.println("Nilai Akhir     = "+nilai.nilaiakhir(nilai.getVal1(), nilai.getVal2(), nilai.getVal3()));
        
        nilai.inf(nilai.nilaiakhir(nilai.getVal1(),nilai.getVal2(),nilai.getVal3()));
        
        
    
    }
    
}
