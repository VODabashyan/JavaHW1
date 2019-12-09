public class FrameAnimation {
    static void animator() {
        String frames = "|/—\\";
        for (int i = 1; i <= frames.length(); i++) {
            System.out.println(frames.charAt(i - 1));
        }
    }

    public static void main(String[] args) {
        int i;
        for (i = 0; ; i++) {
            animator();
        }
    }
}
