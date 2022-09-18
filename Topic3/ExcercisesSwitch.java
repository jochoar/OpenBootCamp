public class ExcercisesSwitch {
    //Lastly, for the Switch, you will need to create the variable season, and different cases for the four seasons of the year. Depending on the value of the station variable, a message must be sent through the console informing of the station it is in. It will also be necessary to set a default for when the value of the variable is not a season.
    public static void main(String[] args) {
        String season = "Summer";

        switch (season) {
            case "Summer":
                System.out.println(season);
                break;
            
            case "Winter":
                System.out.println(season);
                break;

            case "Autumn":
                System.out.println(season);
                break;
        
            case "Spring":
                System.out.println(season);
                break;
            default:
            System.out.println("Not is a season");

                
        }
    }
}