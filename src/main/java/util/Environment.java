package util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class Environment {

    private static Logger logger = LoggerFactory.getLogger(Environment.class);

    private PropertiesFiles prop = new PropertiesFiles();

    private Properties newEnv = prop.loadPropertiesFile("config.properties");

    public String getUrl() {
        return newEnv.getProperty("_URL", "https://www.swedbank.ee");
    }

    public String getUsername() {
        return newEnv.getProperty("_USERNAME", "username");
    }

    public String getPassword() {
        return newEnv.getProperty("_PASSWORD", "password");
    }

    public String getOfficeCountry() {
        return newEnv.getProperty("OFFICE_COUNTRY", "EE");
    }

    public String getWebDriverLocation() {
        return getEnv("WEBDRIVER_LOCATION", "local");
    }

    public String getBrowser() {
        return getEnv("BROWSER", "chrome");
    }

    public String getSelenideTimeout() {
        return getEnv("SELENIDE_TIMEOUT", "30000");
    }

    private String getEnv(String env) {
        return System.getProperty(env);
    }

    private String getEnv(String env, String defaultValue) {
        String var = getEnv(env);
        if (StringUtils.isEmpty(var))
            return defaultValue;
        return var;
    }
}
