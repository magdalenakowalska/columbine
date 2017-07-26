
package pl.lodz.p.spjava.alaska.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.lodz.p.spjava.alaska.model.User;

/**
 *
 * @author Artur
 */
@Stateless
public class UserDao implements UserDaoLocal {
@PersistenceContext
private EntityManager em;
    
    
    @Override
    public void addUser(User user) {
        em.persist(user);
        
    }
    
    @Override
    public void editUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteId(int userId) {
        em.remove(getUser(userId));
    }

    @Override
    public User getUser(int userId) {
        return em.find(User.class, userId);
    }

    @Override
    public List<User> getAllUsers() {
        return em.createNamedQuery("User.getAll").getResultList();
    }
    
}
