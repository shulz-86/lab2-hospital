package lab2.api;

import lab2.model.DoctorType;

public interface Registry {
    void issueDirection(DoctorType type);
    void issueDirectionTherapist();
}
