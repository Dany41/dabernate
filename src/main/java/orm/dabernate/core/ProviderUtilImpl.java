package orm.dabernate.core;

import jakarta.persistence.spi.LoadState;
import jakarta.persistence.spi.ProviderUtil;

public class ProviderUtilImpl implements ProviderUtil {
    @Override
    public LoadState isLoadedWithoutReference(Object entity, String attributeName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LoadState isLoadedWithReference(Object entity, String attributeName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LoadState isLoaded(Object entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
