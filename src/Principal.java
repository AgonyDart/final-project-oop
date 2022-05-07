package src;

import java.util.Date;

public class Principal extends Worker {

    public Principal() {
        access = 3;
    }

    public Principal(String bankId, String rfc, String activity, String degree, int access, String name,
            String socialNumber, String address, String email, String phonenumber, String schedule, Date timestamp) {
        super(bankId, rfc, activity, degree, access, name, socialNumber, address, email, phonenumber, schedule,
                timestamp);
    }
}
