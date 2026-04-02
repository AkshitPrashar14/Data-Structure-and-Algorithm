class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        int totalDays = 0;
        
        // Count days from 1971 to (year - 1)
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }
        
        // Days in each month
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        // Add days for months in current year
        for (int m = 0; m < month - 1; m++) {
            totalDays += monthDays[m];
        }
        
        // Add 1 extra day if leap year and after February
        if (month > 2 && isLeap(year)) {
            totalDays += 1;
        }
        
        // Add days in current month
        totalDays += day;
        
        // Jan 1, 1971 was Friday (index 5)
        return days[(totalDays + 4) % 7];
    }
    
    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
