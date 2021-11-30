package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    private PrintApplianceInfo() {
    }

    /**
     * Prints list of appliances
     *
     * @param appliances to print
     */
    public static void print(List<Appliance> appliances) {
        for (Appliance appliance : appliances) {
            System.out.println(appliance);
        }
    }

}
