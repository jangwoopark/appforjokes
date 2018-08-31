package com.example.android.jokelibrary;
/* Jokes from https://www.rd.com/jokes/ */

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeLibrary {

    public String getJoke() {
        Random rand = new Random();
        List<String> jokes = Arrays.asList(
                "What is the biggest lie in the entire universe? I have read and agree to the Terms & Conditions.");
                //"What did the hot dog say when his friend passed him in the race? Wow, I relish the fact that you've mustard the strength to ketchup to me.",
                //"What do you mean I'm not a bear? I have all of the koalafications!",
                //"What would bears be without Bees? Ears",
                //"What did the Buffalo say to his son when he went off to college? Bison",
                //"What did the cat say when his friend asked if he was lying? I'm not kitten you.");

        int randomIndex;
        String randomElement = "";
        for (int i = 0; i < jokes.size(); i++) {
            randomIndex = rand.nextInt(jokes.size());
            randomElement = jokes.get(randomIndex);
        }
        return randomElement;
    }
}
