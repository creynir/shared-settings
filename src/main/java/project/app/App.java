package project.app;

import project.shared.CommonSettings;
import project.shared.CommonSettingsMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootApplication(scanBasePackages={"project"})
public class App
{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        Map<String, CommonSettings> functionsMap = context.getBean(CommonSettingsMapper.class).getSettingsMap();

        functionsMap.get("SearchService").getSettings();
        functionsMap.get("UserService").getSettings();
        functionsMap.get("InboundChannel").getSettings();
        functionsMap.get("PropertySourcesPlaceholder").getSettings();
    }
}
