package id.artivisi.aplikasi.kontak.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name = "tbl_user")
public class User {
    @Id 
    @Column(length = 36)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    
    @OneToOne
    @JoinColumn(name = "id_kontak", nullable = false)
    private Kontak kontak;
    
    @ManyToMany
    @JoinTable(
            name = "tbl_role_user",
            joinColumns = @JoinColumn(name = "id_user"), 
            inverseJoinColumns = @JoinColumn(name = "id_role")
    )
    private List<Role> daftarRole = new ArrayList<>();
    
    
}
