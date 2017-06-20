package com.example.beverleynewing.cookieclicker;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by beverley.newing on 17/06/2017.
 */

public class CookieClickerScreen {

    public static void clickPokemon() {
        onView(withId(R.id.charmander)).perform(click());
    }

    public static void checkCounterEquals(final String value) {
        onView(withId(R.id.counter)).check(matches(withText(value)));
    }
}
