package test;

import org.junit.jupiter.api.Test;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class OwnerTest extends TestBaseOwner {

  @Test
  void openTest() {
    open(baseUrl);
    $$(".headerMenu a").filter(visible)
        .shouldHave(CollectionCondition.texts("О компании", "Региональная сеть", "Онлайн-услуги", "Страховой случай", "Режим работы и контакты", "Обратная связь", "Пресс-центр", "Государственные органы", "Обращения граждан и юридических лиц", "Калькулятор страховых услуг", "Государственная символика", "Актуально в стране"));
  }
}

