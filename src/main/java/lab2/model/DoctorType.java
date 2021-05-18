package lab2.model;

import java.util.Arrays;

public enum DoctorType {

    Stomatologist(1, "ReferralStomatologist"),
    Therapist(2, "ReferralTherapist");

    private final int id;
    private final String name;

    DoctorType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static DoctorType getById(int id) {
        return Arrays.stream(values())
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
