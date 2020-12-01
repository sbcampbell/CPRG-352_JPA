package database;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

    public static final EntityManagerFactory emf
            = Persistence.createEntityManagerFactory("userPU");

    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}
