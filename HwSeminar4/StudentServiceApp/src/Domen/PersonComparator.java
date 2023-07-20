package Domen;

import java.util.Comparator;

public class PersonComparator<T extends Person> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        int res = o1.getFirstName().compareTo(o2.getFirstName());
        if (res == 0) {
            res = o1.getSecondName().compareTo(o2.getSecondName());
            if (res == 0) {
                if (o1.getAge() == o2.getAge()) {
                    return 0;
                } else {
                    if (o1.getAge() > o2.getAge()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            } else {
                return res;
            }
        } else {
            return res;
        }
    }

}