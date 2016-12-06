package id.artivisi.aplikasi.kontak.jsf;

import id.artivisi.aplikasi.kontak.entity.Pemda;
import id.artivisi.aplikasi.kontak.sb.PemdaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "pemdaController")
@RequestScoped
public class PemdaController {

    @EJB
    private PemdaFacade pemdaFacade;
    
    private Pemda pemda = new Pemda();

    public Pemda getPemda() {
        return pemda;
    }
    
    public String simpanPemda(){
        pemdaFacade.create(pemda);
        pemda = new Pemda();
        
        return "list?faces-redirect=true";
    }

    public List<Pemda> daftarPemda(){
        return pemdaFacade.findAll();
    }
    
    public PemdaController() {
    }
    
}
