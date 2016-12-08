/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.artivisi.aplikasi.kontak.sb;

import id.artivisi.aplikasi.kontak.entity.Kontak;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author endymuhardin
 */
@Stateless
public class KontakFacade extends AbstractFacade<Kontak> {

    @PersistenceContext(unitName = "KontakPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KontakFacade() {
        super(Kontak.class);
    }
    
}
