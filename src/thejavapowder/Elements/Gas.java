package thejavapowder.Elements;

public class Gas extends Element {
    public Gas(byte bu, byte we, boolean co, String name, String desc, int col, byte[] react, int dTemp, byte dLife) {
        super(bu, we, co, name, desc, col, react, dTemp, dLife);
        this.state = 'g';
    }

    //public Gas(byte[] trans) {
    //    super(trans);
    //}
}
