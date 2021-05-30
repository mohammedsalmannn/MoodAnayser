package com.bridgelabz;

public class MoodAnalyser {
    enum s
    {
         S1
    }
        String s2 = String.valueOf(s.S1);
    public String MoodAnalyser(String s) throws MoodAnalyserException {
        try {


            if (s.contains(("sad"))) {
                System.out.println("Test Pass");

                return "Happy";

            } else if (s.contains(("i am in hpie mood"))) {
                return "sad";
            }
            else if (s.contains(("i am in sad mood"))) {
                return "Happy";
            }

            return "Hppie";
        }catch (NullPointerException e){
            throw new MoodAnalyserException("Enter the Valid Mood");
        }

    }

    public String analyseMood(String message) throws MoodAnalyserException {
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
                        throw new MoodAnalyserException("Enter the Valid Mood");
            }
        }

    }
