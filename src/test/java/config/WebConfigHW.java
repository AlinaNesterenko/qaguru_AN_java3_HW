package config;

    import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:${env}.properties",
})
public interface WebConfigHW extends Config {

  @Key("baseUrl")
  @DefaultValue("https://demoqa.com/")
  String baseUrl();
  @Key("browser")
  @DefaultValue("CHROME")
  String browser();

  @Key("remoteUrl")
  String remoteUrl();

  @Key("browserVersion")
  @DefaultValue("110")
  String browserVersion();


}