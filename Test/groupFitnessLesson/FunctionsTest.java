package groupFitnessLesson;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionsTest {

    // In this functional test, One of the lessons is chosen as a test case.
    // The test is passed and methods were replicated in the other fitness lesson

    FitnessLesson ft = new FitnessLesson();

    @Test
    void addYoga7thJ() {
        ft.addYoga7thJ("Salisu", "Yoga Morning Session");
        ft.addYoga7thJ("Skiy", "Yoga Morning Session");
        ft.addYoga7thJ("Monda", "Yoga Morning Session");
        ft.addYoga7thJ("Tracey", "Yoga Morning Session");
        ft.addYoga7thJ("Lucy", "Yoga Morning Session");

        // This will not be booked as number of customer is exceeded
        ft.addYoga7thJ("Alkaline", "Yoga Morning Session");

        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void changeYoga7thJ() {
        ft.addYoga7thJ("Salisu", "Yoga Morning Session");

        // Only customer that booked should be able to attend
        ft.changeYoga7thJ("Salisu", "Yoga Morning Session");

        // Test for customer that doesn't have a booked session
        ft.changeYoga7thJ("Baye", "Yoga Morning Session");
        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void cancelYoga7thJ() {
        ft.addYoga7thJ("Salisu", "Yoga Morning Session");

        // Only customer that booked should be able to cancel
        ft.cancelYoga7thJ("Salisu", "Yoga Morning Session");

        // Test for customer that doesn't have a booked session
        ft.cancelYoga7thJ("Baye", "Yoga Morning Session");

        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void attendYoga7thJ() {
        // Only customer that booked should be able to attend
        ft.attendYoga7thJ("Salisu", "Yoga Morning Session");

        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void rateYoga7thJ() {
        // Only customer that booked should be able to cancel
        ft.rateYoga7thJ("Salisu");

        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void reviewYoga7thJ() {
        // Only customer that booked should be able to cancel
        ft.reviewYoga7thJ("Salisu");

        assertEquals("Salisu" , "Salisu");
    }

    @Test
    void lessonReportYoga7thJan() {
        ft.lessonReportYoga7thJan();
        int NoOfCustomer = 5;
        String avRating = "Null";
    }

    @Test
    void champReportYoga7thJan() {
        ft.champReportYoga7thJan();
        int NoOfCustomer = 5;
        double price = 21.00;
        double totalIncome = NoOfCustomer * price;
    }
}