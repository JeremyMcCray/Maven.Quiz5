package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 * Jeremy McCray's work
 */
public class StringAssembler {
    Character delimiter;
    String string = "";

    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
    }

    public StringAssembler append(String str) {
        if(string.length() == 0){
            string= str;
        } else string+= delimiter + str;
        return this;
    }

    public String assemble() {
        return this.string;
    }
}
