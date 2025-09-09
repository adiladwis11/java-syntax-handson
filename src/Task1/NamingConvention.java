package Task1;

class NamingConvention {
    public static void main(String[] args) {

        String namaLengkapMahasiswa = "Adila Dwi Septiani";
        String nimMahasiswa = "2482002";
        double ipkMahasiswa = 3.65;
        boolean statusAktifKuliah = true;
        String alamatMahasiswa = "jl. Raya way ratai Kec. Pada Cermin Kab. Pesawaran Lampung";
        int jumlahSks = 22;

        // Tampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap    : " + namaLengkapMahasiswa);
        System.out.println("NIM             : " + nimMahasiswa);
        System.out.println("IPK             : " + ipkMahasiswa);
        System.out.println("Status Kuliah   : " + (statusAktifKuliah ? "Aktif" : "Tidak Aktif"));
        System.out.println("Jumlah SKS      : " + jumlahSks);


    }
}

