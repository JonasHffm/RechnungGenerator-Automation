package de.techup.base.main.init;

import de.techup.base.data.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Initializer {

    private Data storage;

    public Initializer(Data data) {
        this.storage = data;
    }

}
