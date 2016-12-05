package id.artivisi.aplikasi.kontak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_pemda")
public class Pemda {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "kode_satker", nullable = false, unique = true)
    private String kodeSatker;
    @Column(name = "kode_provinsi", nullable = false)
    private String kodeProvinsi;
    @Column(name = "kode_pemda", nullable = false)
    private String kodePemda;
    @Column(name = "nama_pemda", nullable = false)
    private String namaPemda;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKodeSatker() {
        return kodeSatker;
    }

    public void setKodeSatker(String kodeSatker) {
        this.kodeSatker = kodeSatker;
    }

    public String getKodeProvinsi() {
        return kodeProvinsi;
    }

    public void setKodeProvinsi(String kodeProvinsi) {
        this.kodeProvinsi = kodeProvinsi;
    }

    public String getKodePemda() {
        return kodePemda;
    }

    public void setKodePemda(String kodePemda) {
        this.kodePemda = kodePemda;
    }

    public String getNamaPemda() {
        return namaPemda;
    }

    public void setNamaPemda(String namaPemda) {
        this.namaPemda = namaPemda;
    }
    
    
}
