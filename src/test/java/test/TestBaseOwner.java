package test;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import config.WebConfigHW;

public class TestBaseOwner {

    @BeforeAll
    static void beforeAll() {

      WebConfigHW config = ConfigFactory.create(WebConfigHW.class, System.getProperties());
      Configuration.baseUrl = "https://bgs.by/calc/medical/occur/";
      Configuration.browser = config.browser();
      Configuration.browserVersion = config.browserVersion();
      Configuration.remote = config.remoteUrl();
      Configuration.pageLoadStrategy = "eager";
    }
  }

