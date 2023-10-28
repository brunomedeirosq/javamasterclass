public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.printf("%s is a " + instanceType +  ".%n",title);
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'C' -> new Comedy(title);
            case 'A' -> new Adventure(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }


}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }

}

class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching an Comedy!");
    }
}

class ScienceFiction extends Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Aliens",
                "More Aliens",
                "Even more Aliens");
    }

    public void watchScienceFiction() {
        System.out.println("Watching an Science Fiction!");
    }
}
