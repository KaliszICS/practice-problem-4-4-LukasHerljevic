public final class CampbellClass {

    private CampbellClass(){}
    
    public static String convertString(int val){
            return String.valueOf(val);
           
    }
        
    public static String convertString(double val){
            return String.valueOf(val);
           
    }
    
    public static String convertString(char val){
            return String.valueOf(val);
           
    }
        
    public static String convertString(boolean val){
            return String.valueOf(val);
           
    }

    public static double convertMetersToCenti(double cent){
            return cent*100;
           
        }

        public static int convertMetersToCenti(int cent){
            return cent*100;
           
        }

        public static String removeNonAlpha(String alpha){

                return alpha.replaceAll("[^a-zA-Z]", "");

        }

        public static String removeNonAlpha(String alpha, boolean cas) {
                alpha.replaceAll("[^a-zA-Z]", "");
                 
                if (cas == true) return alpha.toUpperCase().replaceAll("[^a-zA-Z]", "");
                else return alpha.toLowerCase().replaceAll("[^a-zA-Z]", "");
        }
    }
