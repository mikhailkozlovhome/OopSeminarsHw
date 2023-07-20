package Services;

import java.util.List;

import Domen.Person;

public class AverageAge <T extends Person>{
    public double getAverageAge(List<T> lst) {
        double avrgAge = 0;
        for (T t : lst) {
            avrgAge = avrgAge + t.getAge();
        }
        avrgAge = avrgAge / lst.size();
        return avrgAge;
 }
}
