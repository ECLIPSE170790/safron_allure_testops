package safron_allure;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Задачи")
@Owner("allure8")
public class IssuesTest {

    private final String REPOSITORY = "owner/repo";
    private final int ISSUE = 74;

    @Test
    @Tag("critical")
    @AllureId("10480")
    @Story("Поиск задачи в репозитории")
    @DisplayName("Неавторизованный пользователь должен иметь возможность найти задачу в репозитории")
    public void testIssueSearch() {
        step("Открывает главную страницу");
        step("В поле поиска ищем репозиторий " + REPOSITORY,() -> {
            step("Кликаем на поиск");
            step("Вводим текст " + REPOSITORY);
            step("Нажимаем enter");
});
        step("Переходим по ссылке репозитория " + REPOSITORY);
        step("Переходим в Tab Задачи");
        step("Проверяем наличие задачи " + ISSUE);
    }
}
