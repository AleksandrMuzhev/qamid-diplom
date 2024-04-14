
package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.ui.data.Helper.elementWaiting;
import static ru.iteco.fmhandroid.ui.screenElement.SplashElement.splashImage;
import static ru.iteco.fmhandroid.ui.screenElement.SplashElement.splashProgressIndicator;
import static ru.iteco.fmhandroid.ui.screenElement.SplashElement.splashText;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;

public class SplashStep {

    public void appDownload() {
        Allure.step("Загрузка приложения");
        elementWaiting(withId(R.id.splashscreen_image_view), 5000);
    }
}
