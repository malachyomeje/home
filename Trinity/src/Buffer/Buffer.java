package Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) {
        try {
            BufferedWriter veju= new BufferedWriter( new FileWriter("emma.txt"));
            veju.write( "\nThe only constant thing in life is not change but choice.\tEvery  change is the function of choice made or not.");
            veju.write("\nFormal education will make you a living; self education will make you a fortune");
            veju.write("\nStay hungry, stay foolish, and i have always wished that for my self ... And now as a graduate to begin anew, I wish that for you _ jobs(1993-2011");
            veju.write("\n Be curious always! For knowledge will not acquire you; you will acquire it.");
            veju.write( "\nIf you care what other people think, you will always be their prisoner ");
            veju.write("\nIt is not what you think that is holding you back, it is what you think you are not");
            veju.write( "\n Self-love, self-respect, self-worth: There is a reason they start with SELF, you can cont find them in anyone else " );
            veju.write("\n Imagination is the beginning of creation ");
            veju.write(" \nThere are only two kinds of honest people in the world, small children and drunk people... that why i love alcohol");
            veju.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
