package test;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static test.Language.Бел;
import static test.Language.Рус;


public class ParamTestLangTest extends TestBase  {


  static Stream<Arguments> selenideButtonsTest() {
    return Stream.of(
        Arguments.of(Рус, List.of("О компании", "Региональная сеть", "Онлайн-услуги", "Страховой случай", "Режим работы и контакты", "Обратная связь", "Пресс-центр", "Государственные органы", "Обращения граждан и юридических лиц", "Калькулятор страховых услуг", "Государственная символика", "Актуально в стране")),
        Arguments.of(Бел, List.of("Пра кампанію", "Рэгіянальная сетка", "Анлайн-паслугі", "Страхавы выпадак", "Рэжым работы i кантакты", "Зваротная сувязь", "Прэс-цэнтр", "Дзяржаўныя органы", "Звароты грамадзян і юрыдычных асоб", "Калькулятар страхавых паслуг", "Дзяржаўная сімволіка", "Актуальна ў краіне"))
    );
  }

  @MethodSource("selenideButtonsTest")
  @ParameterizedTest
  @Tag("Display Names")
  void selenideButtonsTest(test.Language language, List<String> expectedButtons) {

    $$(".lang a").find(text(language.name())).click();
    $$(".headerMenu a").filter(visible)
        .shouldHave(CollectionCondition.texts(expectedButtons));
  }
}
