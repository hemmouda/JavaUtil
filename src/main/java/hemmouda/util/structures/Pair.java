package hemmouda.util.structures;

/**
 * Holds a publicly accessible pair
 * of objects
 */
public class Pair <F, S> {

    /**
     * The first object
     */
    public F first;
    /**
     * The second object
     */
    public S second;

    public Pair (F first, S second) {
        this.first = first;
        this.second = second;
    }

    public Pair () {
        this(null, null);
    }

}
