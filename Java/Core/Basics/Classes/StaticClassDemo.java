public class StaticClassDemo {
    public static void main(String[] args) {
        Static_Class.Nested_Class objNested_Class = new Static_Class.Nested_Class();
        objNested_Class.player(); // Calling the player method
    }
}

class Static_Class {
    static String song;

    static String songByMood(String mood) {
        System.out.println("I'm in a mood of " + mood);
        switch (mood) {
            case "Love":
                song = "Jarre Jarre From Majnu";
                break;
            case "Trend":
                song = "Devara song";
                break;
            case "Melody":
                song = "Mella Mellaga from ABCD";
                break;
            default:
                song = "Nani playlist";
                break;
        }
        return song;
    }

    // Making the Nested_Class static
    static class Nested_Class {
        static {
            System.out.println("Static block of Nested Class");
        }

        public void player() {
            String song = Static_Class.songByMood("Love");
            System.out.println(song);
        }
    }
}
