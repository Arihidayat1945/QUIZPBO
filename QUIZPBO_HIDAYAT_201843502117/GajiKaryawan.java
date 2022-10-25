
package Penggajian;

import java.text.DecimalFormat;
import java.util.Scanner;

public class GajiKaryawan {
    String NBM;
    String nama;
    String jabatan;
    int gajipokok;

    public GajiKaryawan(String NBM, String nama, String jabatan, int gajipokok) {
        this.NBM = NBM;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajipokok = gajipokok;
    }

    public void setNBM(String NBM) {
        this.NBM = NBM;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    
    public String getNBM() {
        return NBM;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getGajipokok() {
        return gajipokok;
    }
       
        
    double getGajiPokok(){
        if(null == jabatan){
            gajipokok = 4000000;
        }
        else gajipokok = switch (jabatan) {
            case "Kepala Sekolah" -> 8000000;
            case "Admin" -> 5000000;
            default -> 4000000;
        };
        return gajipokok;
        }
    
    void cetak(){
        DecimalFormat df = new DecimalFormat("##0,000");
        
        System.out.println("Nomer Karyawan : "+ this.NBM);
        System.out.println("Nama Karyawan : "+ this.nama);
        System.out.println("Jabatan : "+ this.jabatan);
        System.out.println("Gaji Pokok : "+ df.format(getGajiPokok()));
    }
}

class newJavaFile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        GajiKaryawan gaji = new GajiKaryawan("K001", "Aliah, S.Pd.", "Kepala Sekolah", 8000000);
        
        System.out.print("Nomer Karyawan : ");
        gaji.NBM = sc.nextLine();
        
        System.out.print("Nama Karyawan : ");
        gaji.nama = sc.nextLine();

        System.out.print("Jabatan : ");
        gaji.jabatan = sc.nextLine();
        
        gaji.cetak();
    }
}
