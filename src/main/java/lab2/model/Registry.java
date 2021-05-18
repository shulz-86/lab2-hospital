package lab2.model;

import lab2.api.Referral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registry")
public class Registry implements lab2.api.Registry {

    @Autowired
    @Qualifier("ReferralStomatologist")
    private Referral referralStom;

    @Autowired
    @Qualifier("ReferralTherapist")
    private Referral referralTherap;


    @Autowired
    @Qualifier("ReferralTherapist")
    public void setReferral(Referral referralTherap) {
        this.referralTherap = referralTherap;
    }


    @Override
    public void issueDirection(DoctorType type) {
        if (type == DoctorType.Stomatologist) {
            referralStom.direct();
        } else  {
            referralTherap.direct();
        }
    }

    @Override
    public void issueDirectionTherapist() {
        referralTherap.direct();
    }

}
