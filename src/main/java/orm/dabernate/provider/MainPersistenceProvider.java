package orm.dabernate.provider;

import com.google.auto.service.AutoService;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.spi.PersistenceProvider;
import jakarta.persistence.spi.PersistenceUnitInfo;
import jakarta.persistence.spi.ProviderUtil;
import orm.dabernate.core.EntityManagerFactoryImpl;

import java.util.Map;

@AutoService(PersistenceProvider.class)
public class MainPersistenceProvider implements PersistenceProvider {

    @Override
    public EntityManagerFactory createEntityManagerFactory(String emName, Map map) {
        return new EntityManagerFactoryImpl();
    }

    @Override
    public EntityManagerFactory createContainerEntityManagerFactory(PersistenceUnitInfo info, Map map) {
        return new EntityManagerFactoryImpl();
    }

    @Override
    public void generateSchema(PersistenceUnitInfo info, Map map) {

    }

    @Override
    public boolean generateSchema(String persistenceUnitName, Map map) {
        return false;
    }

    @Override
    public ProviderUtil getProviderUtil() {
        return null;
    }
}
