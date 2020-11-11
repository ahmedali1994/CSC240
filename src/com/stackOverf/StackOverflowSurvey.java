package com.stackOverf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StackOverflowSurvey implements DeveloperSurvey{
    private int[] surveyInfo;

    public StackOverflowSurvey()
    {
        this.surveyInfo = getProcessedInfoIntType();
    }

    public int[] getProcessedInfoIntType()
    {
        int[] information = new int[15]; // | age | ageCount | hoursWorked | hoursWorkedCount | salary | salaryCount | Java | python | C# | ..
        //counter variables
        int ageCount = 0;
        int hoursWorkedCount = 0;
        int salaryCount = 0;
        int developerCount = 0;


        try {

            BufferedReader reader = new BufferedReader(new FileReader("survey_results_public_subset.tsv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] field = line.split("\t");
                String[] languages = field[22].split(";");

                //processing data
                String ageString = field[3];
                String hoursString = field[58];
                String salaryString = field[6];
                String payfreString = field[5];
                String languagesString = field[22];


                if(!ageString.equals("NA") && !ageString.contains(".")){
                    information[0] += Integer.parseInt(ageString);
                    ageCount++;
                    information[1] = ageCount;
                }
                if (!salaryString.equals("NA") && payfreString.equals("Yearly") && !salaryString.contains("E") ) {
                    information[4] +=Integer.parseInt(salaryString);
                    salaryCount++;
                    information[5] = salaryCount;
                }
                if (!hoursString.equals("NA") && !hoursString.contains(".")) {
                    information[2] += Integer.parseInt(hoursString);
                    hoursWorkedCount++;
                    information[3] = hoursWorkedCount;
                }
                if (!languagesString.contains("NA"))
                {
                    developerCount++;
                    information[14] = developerCount;
                    for (String lan : languages)
                    {
                        if (lan.equalsIgnoreCase("Java"))
                        {
                            information[6]++;
                        }if (lan.equalsIgnoreCase("Python"))
                        {
                            information[7]++;
                        }if (lan.equalsIgnoreCase("C#"))
                        {
                            information[8]++;
                        }
                        if (lan.equalsIgnoreCase("C"))
                        {
                            information[9]++;
                        }
                        if (lan.equalsIgnoreCase("Swift"))
                        {
                            information[10]++;
                        }
                        if (lan.equalsIgnoreCase("Kotlin"))
                        {
                            information[11]++;
                        }
                        if (lan.equalsIgnoreCase("JavaScript"))
                        {
                            information[12]++;
                        }
                        if (lan.equalsIgnoreCase("HTML/CSS"))
                        {
                            information[13]++;
                        }
                    }
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return information;
    }


    @Override
    public int getAverageSalary() {
        return surveyInfo[4] / surveyInfo[5];
    }

    @Override
    public int getAverageHoursWorked() {
        return surveyInfo[2] / surveyInfo[3];
    }

    @Override
    public int getAverageAge() {
        return surveyInfo[0] / surveyInfo[1];
    }

    @Override
    public float getPercentageUsingLanguage(String language) {
        if (language.equalsIgnoreCase("Java")){return  ((float) surveyInfo[6] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("Python")){return ((float) surveyInfo[7] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("C#")){return ((float) surveyInfo[8] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("C")){return ((float) surveyInfo[9] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("Swift")){return ((float) surveyInfo[10] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("Kotlin")){return ((float) surveyInfo[11] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("JavaScript")){return ((float) surveyInfo[12] / surveyInfo[14]);}
        if (language.equalsIgnoreCase("HTML/CSS")){return ((float) surveyInfo[13] / surveyInfo[14]);}
        return 0;
    }
}
