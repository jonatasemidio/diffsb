package diff;

/**
 * Object used to be returned to users
 */
public class Result {

    private final String content;

    public Result(String content) {
        this.content = content;
    }

     public String getContent() {
        return content;
    }
}

