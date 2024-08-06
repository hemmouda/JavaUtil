package hemmouda.util.structures;

/**
 * Holds a public accessible pair
 * of objects
 */
public class Pair <F, S> {

    /**
     * The first object
     */
    public F f;
    /**
     * The second object
     */
    public S s;

    public Pair (F first, S second) {
        this.f = first;
        this.s = second;
    }

}
