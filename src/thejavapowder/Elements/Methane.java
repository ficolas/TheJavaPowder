package thejavapowder.Elements;

public class Methane extends Element {    /*
	 * Java Powder element class
	 * - Creates elements.
	 * The Switch is not needed since it's in the main loop
	 * (WIP)
	 *
	 *
	 *
	 */

    //Order of creation: new Element(amount-of-burn,weight,conductive(boolean),state("g","p","s","l"), color(HEX))
    public Methane(byte bu,
                   byte we,
                   boolean co,
                   char st,
                   String name,
                   String desc,
                   int col,
                   byte[] react,
                   int dTemp) {
        super(bu,
                we,
                co,
                st,
                name,
                desc,
                col,
                react,
                dTemp);
    }

    public Methane(byte[] trans) {
        super(trans);
    }
    /*
        switch state
        {
            case "g": doGasLoop(); break;
            case "l": doLiqLoop(); break;
            case "p": doPowLoop(); break;
            case "s": doSolLoop(); break;
            default: Console.printtxt("State missing! Aborting"); break;
        }
    */


}