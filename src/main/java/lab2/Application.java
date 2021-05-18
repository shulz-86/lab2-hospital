package lab2;

import lab2.api.Registry;
import lab2.configuration.AppDocConfig;
import lab2.model.DoctorType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static DoctorType type = DoctorType.Therapist;

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppDocConfig.class);
        Registry registry1 = context.getBean("Registry", Registry.class);
        Registry registry2 = context.getBean("Registry", Registry.class);
        registry1.issueDirection(type);
        registry2.issueDirectionTherapist();


    }

}
