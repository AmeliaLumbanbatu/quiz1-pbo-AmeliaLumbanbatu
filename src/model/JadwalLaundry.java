package model;

public class JadwalLaundry {
    private String nama, asrama, hari;
    private double berat;

    public JadwalLaundry(String n, String a, double b, String h) {
        this.nama = n; this.asrama = a; this.berat = b; this.hari = h;
    }

    public String getKembali() {
       if(hari.equalsIgnoreCase("senin")) return "Selasa Sore";
        if(hari.equalsIgnoreCase("selasa")) return "Rabu Sore";
        if(hari.equalsIgnoreCase("rabu")) return "Kamis Sore";
        if(hari.equalsIgnoreCase("jumat")) return "Sabtu Sore";
        return "Jadwal Tidak Ada"; 
    }

    public void tampilkanDetail() {
      System.out.println("\n--- Hasil ---");
        System.out.println("Mahasiswa: " + nama + " (" + asrama + ")");
        System.out.println("Kembali: " + getKembali());  
    }
}

