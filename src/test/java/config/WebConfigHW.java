package config;

    import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:${env}.properties",
})
public interface WebConfigHW extends Config {

  @Key("baseUrl")
  @DefaultValue("https://demoqa.com/")
  String getBaseUrl();
  @Key("browser")
  @DefaultValue("CHROME")
  String getBrowser();

  @Key("remoteUrl")
  String getRemoteUrl();

  @Key("browserVersion")
  @DefaultValue("110")
  String getBrowserVersion();


}