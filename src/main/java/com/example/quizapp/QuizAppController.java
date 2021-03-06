package com.example.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizAppController {
    private List<Quiz> quizzes = new ArrayList<>();

    @GetMapping("/show")
    public List<Quiz> show() {
        return quizzes;
    }

    @PostMapping("/create")
    public void create(@RequestParam String question, @RequestParam boolean answer) {
        Quiz quiz = new Quiz(question, answer);
        quizzes.add(quiz);
    }
    @GetMapping("/check")
    public String check(@RequestParam String question, @RequestParam boolean answer) {
        for (Quiz quiz : quizzes) {
            if (quiz.getQuestion().equals(question)) {
                if (quiz.isAnswer() == answer) {
                    return "正解です。";
                }else{
                    return "不正解です。";
                }
            }
        }
        return "見つからなかった";
    }

}
