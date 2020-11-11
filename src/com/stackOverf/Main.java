package com.stackOverf;

/**
Ahmed Abdulrazzaq
Alac --Last Name--
**/

public class Main {
    public static void main(String[] args) {
        DeveloperSurvey stackOverflowSurvey = new StackOverflowSurvey();
//        System.out.println(stackOverflowSurvey.getAverageAge());
//        System.out.println(stackOverflowSurvey.getAverageHoursWorked());
//        System.out.println(stackOverflowSurvey.getAverageSalary());
//        System.out.println(stackOverflowSurvey.getPercentageUsingLanguage("python"));
//        System.out.println(stackOverflowSurvey.getPercentageUsingLanguage("java"));
//        System.out.println(stackOverflowSurvey.getPercentageUsingLanguage("c"));
//        System.out.println(stackOverflowSurvey.getPercentageUsingLanguage("c#"));
        System.out.println("Age: " + stackOverflowSurvey.getAverageAge());
        System.out.println("Hours: " + stackOverflowSurvey.getAverageHoursWorked());
        System.out.println("Salary: " + stackOverflowSurvey.getAverageSalary());
        System.out.println("Percent using Java: " + stackOverflowSurvey.getPercentageUsingLanguage("java"));
        System.out.println("Percent using Python: " + stackOverflowSurvey.getPercentageUsingLanguage("Python"));
        System.out.println("Percent using C#: " + stackOverflowSurvey.getPercentageUsingLanguage("C#"));
        System.out.println("Percent using C: " + stackOverflowSurvey.getPercentageUsingLanguage("C"));
        System.out.println("Percent using Swift: " + stackOverflowSurvey.getPercentageUsingLanguage("Swift"));
        System.out.println("Percent using Kotlin: " + stackOverflowSurvey.getPercentageUsingLanguage("Kotlin"));
        System.out.println("Percent using JavaScript: " + stackOverflowSurvey.getPercentageUsingLanguage("JavaScript"));
        System.out.println("Percent using Java: " + stackOverflowSurvey.getPercentageUsingLanguage("HTML/CSS"));




    }
    }

