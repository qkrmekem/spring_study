package enumExample;

public enum Color implements Printer{
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");

    private String rgb;
    Color(String rgb) {
        this.rgb = rgb;
    }

    @Override
    public void print() {
        System.out.println("rgb : " + rgb);
    }
}
