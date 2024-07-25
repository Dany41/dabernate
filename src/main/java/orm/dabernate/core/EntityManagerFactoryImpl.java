package orm.dabernate.core;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.metamodel.Metamodel;

import java.util.Map;

public class EntityManagerFactoryImpl implements EntityManagerFactory {
    @Override
    public EntityManager createEntityManager() {
        return new EntityManagerImpl();
    }

    @Override
    public EntityManager createEntityManager(Map map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityManager createEntityManager(SynchronizationType synchronizationType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EntityManager createEntityManager(SynchronizationType synchronizationType, Map map) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Metamodel getMetamodel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public void close() {

    }

    @Override
    public Map<String, Object> getProperties() {
        return Map.of();
    }

    @Override
    public Cache getCache() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PersistenceUnitUtil getPersistenceUnitUtil() {
        return new PersistenceUnitUtilImpl();
    }

    @Override
    public void addNamedQuery(String name, Query query) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T unwrap(Class<T> cls) {
        return cls.cast(this);
    }

    @Override
    public <T> void addNamedEntityGraph(String graphName, EntityGraph<T> entityGraph) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
