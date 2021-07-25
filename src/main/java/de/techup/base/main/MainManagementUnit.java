package de.techup.base.main;

import de.techup.base.data.Data;
import de.techup.base.main.init.Initializer;

public class MainManagementUnit {

    public static Initializer initializer;

    public static void main(String[] args) {
        MainManagementUnit mainManagementUnit = new MainManagementUnit();
        //start base thread
        new Thread(mainManagementUnit.init).start();
    }

    public Runnable init = () -> {

        //main init thread

        // --> create base initializer class here
        Data data = new Data();
        initializer = new Initializer(data);

    };

}
