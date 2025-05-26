package com.example.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/")
    public String showQuiz(Model model) {
        Quiz quiz = quizService.getRandomQuiz();
        model.addAttribute("quiz", quiz);
        return "quiz";
    }
    
    @PostMapping("/check")
    public String checkAnswer(@RequestParam String answer,
                              @RequestParam String correctAnswer,
                              Model model) {
        boolean isCorrect = answer.trim().equalsIgnoreCase(correctAnswer.trim());
        model.addAttribute("result", isCorrect ? "正解！" : "不正解！");
        return "result";
    }

}
