package id.artivisi.aplikasi.kontak.sb;

import id.artivisi.aplikasi.kontak.entity.Pemda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PemdaFacade extends AbstractFacade<Pemda> {

    @PersistenceContext(unitName = "KontakPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PemdaFacade() {
        super(Pemda.class);
    }
    
}
