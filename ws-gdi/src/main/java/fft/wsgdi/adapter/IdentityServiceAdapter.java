package fft.wsgdi.adapter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import fft.wsgdi.port.IdentityRepositoryPort;
import model.Identity;

@Service
public class IdentityServiceAdapter implements IdentityRepositoryPort {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Override
    public void create(String name) {
        Identity identity = new Identity();
        identity.setName(name);
        entityManager.persist(identity);
    }
    @Override
    public Identity getIdentity(Integer id) {
        return entityManager.find(Identity.class, id);

    }
}