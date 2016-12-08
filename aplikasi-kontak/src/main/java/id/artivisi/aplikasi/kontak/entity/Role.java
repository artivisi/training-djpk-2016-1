package id.artivisi.aplikasi.kontak.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "tbl_role")
public class Role {
    @Id 
    @Column(length = 36)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Column(unique = true, nullable = false, length = 10)
    private String kode;
    
    @Column(nullable = false)
    private String nama;
    
    @ManyToMany(mappedBy = "daftarRole")
    private List<User> daftarUser = new ArrayList<>();
}
