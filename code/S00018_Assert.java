//-ea
public class S00018_Assert {

    static void parameterNeeded(String input) {
        assert input != null;
    }

    public static void main(String[] args) {
        parameterNeeded(null);
    }

}