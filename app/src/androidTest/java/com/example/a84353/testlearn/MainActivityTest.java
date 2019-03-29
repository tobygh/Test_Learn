package com.example.a84353.testlearn;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.EditorAction.*;
import static org.junit.Assert.*;

public class MainActivityTest {
    private MainActivity mainActivity=null;

    @Rule
    public ActivityTestRule<MainActivity>activityTestRule=new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
        mainActivity=activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
        Log.i("debug","test created!");
    }
/*
    @Test
    public void btnClick() {
        Log.i("debug","button click in test");
    }
    @Test
    public void txtFil(){
        Log.i("debug","text click in test");
    }*/
    @Test
    public void testClickButton(){
        Log.i("debug","test perform click button");
        Espresso.onView(withId(R.id.startSecondActivity)).perform(click());
        Espresso.onView(withId(R.id.editText)).perform(typeText("123456"));
    }

}