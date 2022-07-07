package com.example.appsales29032022;

/**
 * Created by ntudroid on 7/7/2022.
 */
import javax.inject.Inject;

/**
 * Created by pphat on 7/7/2022.
 */
public class Xehoi {
    public Dongco dongco;
    public Banhxe banhxe;

    @Inject
    public Xehoi(Dongco dongco, Banhxe banhxe) {
        this.dongco = dongco;
        this.banhxe = banhxe;
    }
}
