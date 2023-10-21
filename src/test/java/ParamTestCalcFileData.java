package guru.qa;

    import com.codeborne.selenide.CollectionCondition;

    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.DisplayName;
    import org.junit.jupiter.api.Tag;
    import org.junit.jupiter.params.ParameterizedTest;
    import org.junit.jupiter.params.provider.CsvFileSource;

    import static com.codeborne.selenide.Condition.text;
    import static com.codeborne.selenide.Condition.visible;
    import static com.codeborne.selenide.Selectors.byText;
    import static com.codeborne.selenide.Selenide.$;
    import static com.codeborne.selenide.Selenide.$$;
    import static com.codeborne.selenide.Selenide.open;


    public class ParamTestCalcFileData  {

    @BeforeEach
    void setup() {
    open("https://bgs.by/calc/medical/occur/");
    }

    @CsvFileSource(resources = "/paramForCalc.csv")

    @DisplayName("Стоимость страховки соответствует {plan} плану")

    @ParameterizedTest
    @Tag("BLOCKER")
    void successfulSearchTest(String sum, String plan, String result){
    $(".formText").click();
    $(".formText").setValue(sum);
    $(".chzn-container").click();
    $(".chzn-results").$(byText(plan)).click();
    $(".formSub").click();
    $$(".infoblock").findBy(text(result)).shouldBe(visible);

    }


    }

