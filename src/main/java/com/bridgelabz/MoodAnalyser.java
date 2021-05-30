package com.bridgelabz;

public class MoodAnalyser {
    public String MoodAnalyser(String s)  {
        try {


            if (s.contains(("sad"))) {
                System.out.println("Test Pass");

                return "Happy";

            } else if (s.contains(("i am in hpie mood"))) {
                return "sad";
            }

            return "Hppie";
        }catch (NullPointerException e){
            //throw new MoodAnalyserException("Enter the Valid Mood");
            return "Happy";
        }

    }

    public String analyseMood(String message) {
            try {
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
            }catch (NullPointerException e){
                        return "Happy";
            }
        }

    }
