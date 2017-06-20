package com.example.beverleynewing.cookieclicker;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import dalvik.annotation.TestTargetClass;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.example.beverleynewing.cookieclicker.CookieClickerScreen.checkCounterEquals;
import static com.example.beverleynewing.cookieclicker.CookieClickerScreen.clickPokemon;

/**
 * Created by beverley.newing on 17/06/2017.
 */

@RunWith(AndroidJUnit4.class)
public class CookieClickerTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void totalStartsAtZero() throws Exception {
        onView(withId(R.id.counter))
                .check(matches(withText("Number")));
    }

    @Test
    public void totalIncreasesWhenCookieClicked() throws Exception {
        onView(withId(R.id.charmander))
                .perform(click());

        onView(withId(R.id.counter))
                .check(matches(withText("Your current score is 1")));
    }

    @Test
    public void testHighScore() throws Exception {
        for(int i = 0; i < 100; i++){
            onView(withId(R.id.charmander))
                    .perform(click());
        }

        onView(withId(R.id.counter))
                .check(matches(withText("Your current score is 100")));
    }
}
