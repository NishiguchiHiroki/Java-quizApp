package com.example.quizapp;

public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.execute();
    }
    void execute() {
        outputSum(1,2 );
    }
    void outputSum(int numberA, int numberB) {
        System.out.println(numberA + numberB);
    }
}
