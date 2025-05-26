package com.example.quiz;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class QuizService {

    private final List<Quiz> quizzes = Arrays.asList(
        new Quiz("日本の首都は？", "東京"),
        new Quiz("3 + 4 は？", "7"),
        new Quiz("水は英語で？", "water"),
        new Quiz("円周率は？（小数第1位まで）", "3.1")
    );

    public Quiz getRandomQuiz() {
        Random rand = new Random();
        return quizzes.get(rand.nextInt(quizzes.size()));
    }
}
