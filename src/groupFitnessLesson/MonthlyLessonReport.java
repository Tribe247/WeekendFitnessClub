package groupFitnessLesson;

public class MonthlyLessonReport {

    //Object to call data class
    MonthlyLessonRData mLReport = new MonthlyLessonRData();
    public void janLesson(){

        mLReport.yoga7thJan();
        mLReport.yoga8thJan();
        // After the report is view: Ask what else to do

    }

    public void febLesson(){

        mLReport.yoga9thFeb();
        mLReport.yoga10thFeb();
        // After the report is view: Ask what else to do
        System.out.println("What else will you like to? ");


    }

}
