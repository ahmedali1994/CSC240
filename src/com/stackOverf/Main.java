package com.stackOverf;

import java.util.ArrayList;
import java.util.List;

/***************************
        Ahmed Abdulrazzaq
        Alec Martin
***************************/

public class Main {
    public static void main(String[] args) {
        DeveloperSurvey stackOverflowSurvey = new StackOverflowSurvey();

        System.out.println("Age: " + stackOverflowSurvey.getAverageAge());
        System.out.println("Hours: " + stackOverflowSurvey.getAverageHoursWorked());
        System.out.println("Salary: " + stackOverflowSurvey.getAverageSalary());
        System.out.print("Percent using Java: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("java"));
        System.out.println("");
        System.out.print("Percent using Python: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("Python"));
        System.out.println("");
        System.out.print("Percent using C#: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("C#"));
        System.out.println("");
        System.out.print("Percent using C: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("C"));
        System.out.println("");
        System.out.print("Percent using Swift: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("Swift"));
        System.out.println("");
        System.out.print("Percent using Kotlin: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("Kotlin"));
        System.out.println("");
        System.out.print("Percent using JavaScript: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("JavaScript"));
        System.out.println("");
        System.out.print("Percent using HTML/CSS: ");
        System.out.printf("%f",stackOverflowSurvey.getPercentageUsingLanguage("HTML/CSS"));
        System.out.println("");
    }
    }

