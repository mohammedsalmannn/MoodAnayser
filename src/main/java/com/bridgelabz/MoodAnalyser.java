package com.bridgelabz;

public class MoodAnalyser {
    public String MoodAnalyser(String s) {
        if (s.contains(("sad"))) {
            System.out.println("Test Pass");

            return "sad";

        }
        else if (s.contains(("i am in hpie mood"))){
                    return "sad";
        }

        return "Hppie";
    }

    public String analyseMood(String message) {
            if (message.contains(("sad"))) {
                System.out.println("Test Pass");
                return "sad";
            } else if (message.contains(("i am sad mood"))) {
                System.out.println("Test Pass");
                return "SAD";
            } else if (message.contains(("i am in any mood"))) {
                System.out.println("Test Pass");
                return "Happy";
            } else return message;
        }

    }
