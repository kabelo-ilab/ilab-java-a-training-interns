package Chapter2;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayNum = 2;
        String dayOfWeek = "None";

        switch (dayNum){
            case 1 : dayOfWeek = "Monday";
            break;
            case 2 : dayOfWeek = "Tuesday";
                break;
            case 3 : dayOfWeek = "Wednesday";
                break;
            case 4 : dayOfWeek = "Thursday";
                break;
            case 5 : dayOfWeek = "Friday";
                break;
            case 6 : dayOfWeek = "Saturday";
                break;
            case 7 : dayOfWeek = "Sunday";
                break;
            default:dayOfWeek = "Invalid";
        }
        System.out.println(dayOfWeek);
        System.out.println("\n=======================================\n");

        /*Supervisor for departments:
        1,2 & 5 - Smith
        3 - Jones
        4 - Mokoena
        * */
        int departmentId = 4;
        String supervisor;

        switch (departmentId){
            case 1, 2, 5 :
                supervisor = "Smith";
                break;
            case 3 : supervisor = "Jones";
            break;
            case 4 : supervisor = "Mokoena";
            break;
            default: supervisor = "Unknown";
        }
        System.out.println("Supervisor: " + supervisor);

    }
}
