package com.example.quiz;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class QuizService {

    private final List<Quiz> quizzes = Arrays.asList(
        new Quiz("株式指標の内、〇〇〇=1は企業の解散価値と等しいと言われる(ローマ字３文字)", "PBR"),
        new Quiz("TAMの向上のためには新規事業とM&Aともう一つは何?(漢字で)", "業務提携"),
        new Quiz("売上高から原価を引いたものは漢字4文字で何という?", "売上総利益")
    );

    public Quiz getRandomQuiz() {
        Random rand = new Random();
        return quizzes.get(rand.nextInt(quizzes.size()));
    }
}
