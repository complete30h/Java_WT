package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface for appliance DAOs.
 */
public interface ApplianceDAO {

    /**
     * Finds appliances that fit certain criteria.
     *
     * @param criteria a set of criteria
     * @return list of appliances that fit the criteria
     */
    List<Appliance> find(Criteria criteria);

    /**
     * Get all appliances.
     *
     * @return list of all appliances
     */
    List<Appliance> getAll();

    /**
     * Saves a list of appliances to a file.
     *
     * @param appliances list of appliances to save
     */
    void save(List<Appliance> appliances);

}
