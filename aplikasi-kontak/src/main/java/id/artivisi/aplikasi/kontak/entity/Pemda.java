package id.artivisi.aplikasi.kontak.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "tbl_pemda")
public class Pemda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id 
    @Column(length = 36)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Column(name = "kode_pemda", nullable = false, unique = true)
    @Size(min = 3, max = 10)
    @NotNull
    private String kode;
    
    @Column(nullable = false)
    @Size(min = 5, max = 255)
    private String nama;
    
    @OneToMany(mappedBy = "pemda")
    private List<Kontak> daftarKontak = new ArrayList<>();
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pemda)) {
            return false;
        }
        Pemda other = (Pemda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.artivisi.aplikasi.kontak.entity.Pemda[ id=" + id + " ]";
    }
    
}
