import java.util.*;

import javax.persistence.EntityManager;

public class DaoProfessor implements Dao<Professor> {

    private EntityManager entityManager;

    public DaoProfessor(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Professor> get(long id) {

        return null;
    }

    @Override
    public List<Professor> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void save(Professor t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Professor t) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Professor t) {
        // TODO Auto-generated method stub

    }

}