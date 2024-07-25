package orm.dabernate.core;

import jakarta.persistence.PersistenceUnitUtil;

public class PersistenceUnitUtilImpl implements PersistenceUnitUtil {
    @Override
    public boolean isLoaded(Object entity, String attributeName) {
        return false;
    }

    @Override
    public boolean isLoaded(Object entity) {
        return false;
    }

    @Override
    public Object getIdentifier(Object entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
