package id.artivisi.aplikasi.kontak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
}
