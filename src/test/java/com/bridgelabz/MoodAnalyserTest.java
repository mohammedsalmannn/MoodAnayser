package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void testMoodAnalysis() {
        String mood = null;
        try {
            ExpectedException exception = ExpectedException.none();
            exception.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood("sad");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals("sad", mood);
        }

    }

    // Method calling througth the instences
    @Test
    public void TestCase1() {
        String mood = "sad";
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood("i am sad mood");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals("sad", mood);
        }

    }

    @Test
    public void TestCase2() {
        String mood = null;
        try {
            ExpectedException exception = ExpectedException.none();
            exception.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood("i am in any mood");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals("Happy", mood);
        }

    }
    // method calling through the constructor

    @Test
    public void TestCase1Repete() {
        String mood = "sad";
        try {
            mood = moodAnalyser.MoodAnalyser("i am in sad");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals("sad", mood);
        }

    }
    @Test
    public void TestCase2Repete() {
        String mood = null;
        try {
            ExpectedException exception = ExpectedException.none();
            exception.expect(MoodAnalyserException.class);
            mood = moodAnalyser.MoodAnalyser(null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.assertEquals("Happy", mood);
        }

    }

}
