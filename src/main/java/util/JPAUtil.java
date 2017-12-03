package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY;
	static {

		FACTORY = Persistence.createEntityManagerFactory("Mapeamento");
	}

	/* Metodo para captura FACTORY que pega o arquivo persistence */
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}

	public static void close() {

		FACTORY.close();
	}

}
