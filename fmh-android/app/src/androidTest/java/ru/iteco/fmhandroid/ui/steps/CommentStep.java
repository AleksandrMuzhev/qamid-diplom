package ru.iteco.fmhandroid.ui.steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static ru.iteco.fmhandroid.ui.screenElement.CommentElement.commentName;
import static ru.iteco.fmhandroid.ui.screenElement.CommentElement.commentText;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.GeneralSaveButton;
import static ru.iteco.fmhandroid.ui.screenElement.GeneralElements.cancelButton;

import io.qameta.allure.kotlin.Allure;

public class CommentStep {

    public void checkCommentScreenElements() {
        Allure.step("Элементы экрана - Comment");
        commentText.check(matches(isDisplayed()));
        commentName.check(matches(isDisplayed()));
        GeneralSaveButton.check(matches(isDisplayed()));
        cancelButton.check(matches(isDisplayed()));
    }

    public void addComment(String comment) {
        Allure.step("Добавить комментарий");
        commentText.perform(click()).perform(replaceText(comment));

    }
}