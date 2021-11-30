package by.tc.task01.dao;

import by.tc.task01.dao.impl.ApplianceDAOImpl;

/**
 * A factory for creating ApplianceDAO.
 */
public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private DAOFactory() {
    }

    /**
     * Gets new ApplicanceDAO object.
     *
     * @return new ApplianceDAO object.
     */
    public ApplianceDAO getApplianceDAO() {
        return new ApplianceDAOImpl();
    }

    /**
     * Gets current DAOFactory object.
     *
     * @return instance of DAOFactory
     */
    public static DAOFactory getInstance() {
        return instance;
    }
}
