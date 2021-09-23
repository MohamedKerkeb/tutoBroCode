package PrintF;

public class Main {
    public static void main(String[] args) {
        /* 
            Printf() =  an optional method to control, format and display text to console windows
                        two arguments = format string + (object/variable/value)
                        % [flags] [precison] [width] [conversion-character]
        */

        // * rajouter un element a la fin d'une string ou autres
        // * la lettre d correspond a un integer seulement
        //System.out.printf("This is a format string %d", 123);
        //System.out.println();
        // * mettre l'elmeent devant 
        //System.out.printf("%d This is a format string", 123);

        // creeons des variables
        
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Mohamed";
        int myInt = 50;
        double myDouble = 1; 

        // ! [conversion-character]
        // * les lettres apres le % correspond au type de l'element q'uon veux rajouter
        //System.out.printf("%b", myBoolean);System.out.println();
        //System.out.printf("%c", myChar);System.out.println();
        //System.out.printf("%s", myString );System.out.println();
        //System.out.printf("%d", myInt);System.out.println();
        //System.out.printf("%f", myDouble);System.out.println();

        // ! [width]
        // * minimum number of characters to be written as output
        // System.out.printf("Hello %10s", myString);
        // * on ajoute un nombre entre le % et la lettre pour avoir un minimum d'espace entre chaque element qui constitue
        // * la string. 
        // * on peut mettre un nombre negatif pour justify le texte en soit les espaces se trouve apres l'element qu'on rajoute

        // ! [precision]
        // * set number of digit of precision when outputting floating-point values
        //System.out.printf("You have this much money %.3f", myDouble);
        // * on peut avec cette method precise les nombre decimal qui peut apparaitre apres le zero.

        // ! [flags]
        //* adds an effect to output based on the flag addes to fromat specifer
        //* - : left-justify
        //* + : output a plus ( + ) or minus ( - ) sign for a numeric value
        //* 0 : numeric values are zero-padded
        //* , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %03f", myDouble);


    }
}
