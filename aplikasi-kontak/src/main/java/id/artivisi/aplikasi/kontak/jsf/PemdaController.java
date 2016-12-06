package id.artivisi.aplikasi.kontak.jsf;

import id.artivisi.aplikasi.kontak.entity.Pemda;
import id.artivisi.aplikasi.kontak.sb.PemdaFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "pemdaController")
@Dependent
public class PemdaController {

    @EJB
    private PemdaFacade pemdaFacade;

    public List<Pemda> daftarPemda(){
        return pemdaFacade.findAll();
    }
    
    public PemdaController() {
    }
    
}
