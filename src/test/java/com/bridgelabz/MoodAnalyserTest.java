package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void testMoodAnalysis() {
        String mood = moodAnalyser.analyseMood("sad");
        Assert.assertEquals("sad", mood);

    }

    // Method calling througth the instences
    @Test
    public void TestCase1() {
        String mood = moodAnalyser.analyseMood("i am sad mood");
        Assert.assertEquals("sad", mood);
    }

    @Test
    public void TestCase2() {
        String mood = moodAnalyser.analyseMood("i am in any mood");
        Assert.assertEquals("Happy", mood);
    }
    // method calling through the constructor

    @Test
    public void TestCase1Repete() {
        //String mood = moodAnalyser.analyseMood("i am sad mood");
        String mood = moodAnalyser.MoodAnalyser("i am in sad");
        Assert.assertEquals("sad", mood);
    }
    @Test
    public void TestCase2Repete() {
        //String mood = moodAnalyser.analyseMood("i am sad mood");
        String mood = moodAnalyser.MoodAnalyser("i am in hpie mood");
        Assert.assertEquals("sad", mood);
    }

}








