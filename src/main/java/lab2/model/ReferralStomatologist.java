package lab2.model;

import lab2.api.Referral;
import org.springframework.stereotype.Component;

@Component("ReferralStomatologist")
public class ReferralStomatologist implements Referral {
    public void direct() {
        System.out.println("Выдано направление к стоматологу");
    }
}