package withLambda;

public class DisplayImpl implements DIsplay {
    @Override
    public int getSize(String s) {
        return s.length();
    }
}
