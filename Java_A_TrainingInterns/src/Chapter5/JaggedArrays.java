package Chapter5;
/*
* Jagged Array is an array of other arrays*/
public class JaggedArrays {
    public static void main(String[] args) {
        //Create a jagged array
        String[][] arHobbies = new String[3][];
        String[] arSports = {"Golf","Tennis","Soccer"};

        arHobbies[0] = arSports;
        arHobbies[1] = new String[]{"Hiking", "Reading Books"};
        arHobbies[2] = new String[4];
        //Chess, Soccer, Netball, Hiking
        arHobbies[2][0] = "Chess";
        arHobbies[2][1] = "Soccer";
        arHobbies[2][2] = "Netball";
        arHobbies[2][3] = "Hiking";

        for (int i = 0; i < arHobbies.length; i++) {
            for (int j = 0; j < arHobbies[i].length; j++) {
                System.out.print(arHobbies[i][j] + "  |  ");
            }
            System.out.println();
        }


    }
}
