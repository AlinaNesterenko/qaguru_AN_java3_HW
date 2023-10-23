package test;

public enum Language {
  RUSSIAN("Рус"),
  BELARUSIAN("Бел");
  private String name;

  Language(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}