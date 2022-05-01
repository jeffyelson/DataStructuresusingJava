class Blanks {
    private static int number = 0;
    private static String s = " World " ;
    Blanks () {
         s = " Hello " ;
        }

        Blanks ( int n ) {
         super ();
        number = n ;
         }
        void methodA () {
        methodC ();
        }
        void methodB () {
         System . out . println ( number );
         }
        void methodC () {
         System . out . println ( s );
         }
 }


