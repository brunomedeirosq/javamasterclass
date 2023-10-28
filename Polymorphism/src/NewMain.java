public class NewMain {

    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("A","Star Wars");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
//        jaws.watchMovie();

//        Adventure jawsTestCast = (Adventure) Movie.getMovie("C","Jaws");
//        jawsTestCast.watchMovie();

//        Object comedy = Movie.getMovie("C","Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();

//        var airplane = Movie.getMovie("C","Airplane");
//        airplane.watchMovie();
//
//        var plane = new Comedy("Airplane");
//        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");

        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof  ScienceFiction syfy) {
            //this approach was introduced in java 16 and it's called pattern matching support
            //if the JVM can identify that the object matches the type, it can extract data from the object, without casting
            //variable syfy (if the instanceof method returns true) is already typed as a ScienceFiction variable
            syfy.watchScienceFiction();
        }
    }
}
