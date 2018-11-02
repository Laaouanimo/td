package calendrier;

public class mois {
    public static class Calendrier {

        public static String nomMois(int mois) {
            switch (mois) {
                case 1:
                    return "janvier";

                case 2:
                    return "février";

                case 3:
                    return "mars";

                case 4:
                    return "avril";

                case 5:
                    return "mai";

                case 6:
                    return "juin";


                case 7:
                    return "juillet";

                case 8:
                    return "aout";

                case 9:
                    return "september";

                case 10:
                    return "octobre";

                case 11:
                    return "novembre";

                case 12:
                    return "décembre";


                default:
                    return " mois invalide";

            }


        }
    }
}

