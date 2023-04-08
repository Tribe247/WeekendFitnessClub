package groupFitnessLesson;

public class Launcher {


    /*public void welcomePage(){
        System.out.println("Welcome to Group Fitness Lesson" +
                "\n You can Book a new lesson, " +
                "\n Attend a lesson, " +
                "\n Change or cancel booked lesson or " +
                "\n Check monthly fitness and booking report");
    }
    public void welcomePage1() {
        System.out.println("Please select what you wish to do" +
                "\n To Book a new lesson PRESS 1 " +
                "\n To Attend a lesson PRESS 2 " +
                "\n To Change or cancel booked lesson PRESS 3 " +
                "\n Check monthly fitness and booking report PRESS 4");
    }    */

    public static void main(String[] args) {

        // Creating object to call the class that contain my function
        SubLauncher sbl = new SubLauncher();

        // Calling the welcome method
        sbl.welcomePage();

        // Calling the welcome method that contain my functions

        sbl.welcomePage1();


    /*    Scanner Launcher1 = new Scanner(System.in);

        // Object of the class launcher
        Launcher lh = new Launcher();

        // Object of the class timetable / booking
        TimeTableLauncher tb = new TimeTableLauncher();

        //Object of cancel and change
        cancelNchange cNc = new cancelNchange();

        // Object of the rate/Review class
        ReviewAttend newRev = new ReviewAttend();

        // Calling this method as the welcome page
        lh.welcomePage();
        lh.welcomePage1();

        int menu = Launcher1.nextInt();
        switch (menu) {
            case 1:
                // Calling this method for booking
                tb.timeTableWelcome();
                break;
            case 2:
                // A method to call for Cancellation/ change will be called herr
                cNc.changeCancel();
                break;
            case 3:
                // A method called to initiate review/rating
                newRev.toCallAttend();
                break;
            case 4:
                //A method to print monthly lesson report

                break;
            case 5:
                //A method to call monthly champion fitness report

                break;
            case 6:


            default:
                System.out.println("Invalid Entry");
        }    */


    }
}
     // I am thinking of implementing cases in this session; Where case1 will represent each function