import java.util.*;

public class Nine {
    static Scanner getLine = new Scanner(System.in);
    static Locale locale = new Locale("english");
    public static void main(String[] args){
        System.out.print("What would you like to do with the provided date:\n1. Print day of the week.\n2. Compare with another date.\n3. Exit.\n");
        String getOpt = getLine.nextLine();
        switch (Integer.parseInt(getOpt)){
            case 1:
                getDayOfWeek(getDate());
                break;
            case 2:
                compareDate(getDate());
                break;
            case 3:
                System.exit(0);
            default:
                System.exit(0);
                break;
        }
    }

    static void getDayOfWeek(Calendar usrDate){
        Integer year = usrDate.get(Calendar.YEAR);
        if (Objects.equals(year, 2024)){
            System.out.print(usrDate.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale) + "\n");
            main(null);
        } else {
            System.out.print("Year must be 2024.");
        }
    }

    static void compareDate(Calendar usrDate){
        Calendar secDate = getDate();
        if (usrDate.after(secDate)){
            System.out.print("The first date is after the second date.\n");
        } else {
            System.out.print("The first date is before the second date.\n");
        }
        main(null);
    }

    static Calendar getDate(){
        System.out.print("Enter a date in the following format (MM/DD/YYYY)\n");
        String[] getDateStr = getLine.nextLine().split("/");
        Integer[] date = new Integer[3];
        if (Integer.parseInt(getDateStr[2]) < 1900 || Integer.parseInt(getDateStr[2]) > 2100 ||
            Integer.parseInt(getDateStr[0]) > 12 || Integer.parseInt(getDateStr[0]) < 1 ||
            Integer.parseInt(getDateStr[1]) > 31 || Integer.parseInt(getDateStr[1]) < 1){
            date[0] = 1900;
            date[1] = 01;
            date[2] = 01;
        } else {
            date[0] = Integer.parseInt(getDateStr[2]);
            date[1] = Integer.parseInt(getDateStr[0]);
            date[2] = Integer.parseInt(getDateStr[1]);
        }
        Calendar usrDate = new Calendar.Builder().setDate(date[0], date[1], date[2]).build();
        return usrDate;
    }
}