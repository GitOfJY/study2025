package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitUtil<T> {

    public static <T extends BioUnit> T maxHp(T t1, T t2){
        if (t1.getHP() > t2.getHP()){
            return t1;
        } else {
            return t2;
        }
    }

}
