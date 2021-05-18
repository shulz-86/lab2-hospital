package lab2.configuration;

import lab2.*;
import lab2.api.Registry;
import lab2.api.Referral;
import lab2.model.DoctorType;
import lab2.model.ReferralStomatologist;
import lab2.model.ReferralTherapist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("lab2")
public class AppDocConfig {

    @Bean(name = "referral")
    public Referral referral() {
        if (DoctorType.Therapist.getId() == Application.type.getId()) {
            return new ReferralTherapist();
        } else if (DoctorType.Stomatologist.getId() == Application.type.getId()) {
            return new ReferralStomatologist();
        }
        throw new IllegalArgumentException("нет такого врача");
    }

    @Bean(name = "registry")
    public Registry registry(Referral referral) {
        lab2.model.Registry registry = new lab2.model.Registry();
        registry.setReferral(referral);
        return registry;
    }
}