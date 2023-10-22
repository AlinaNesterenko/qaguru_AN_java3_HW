package test;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

  @BeforeAll
  static void setUp() {
    open("https://bgs.by/calc/medical/occur/");
    Configuration.pageLoadStrategy = "eager";
  }}
