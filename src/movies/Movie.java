// this is the directory/package that all three java files are in so that they can easily
// communicate with each other without having to import from other files
package movies;

// public class object that will dictate the attributes and functionality of the object
public class Movie {

    // these are the attributes for each Movie Object
    // these remain private for no reason other than because they said so XD
    private String name;
    private String category;

    // this is the constructor he you use to create and assign the attributes to the object
    // so instead of Movie movie = new Movie(); you will say:
    // Movie movie = new Movie(name, category); and that will assign the attributes as its created
    Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    // these are "Setters" they are simple methods that assign the value of an attribute
    // ex. System.out.println(movie.setName("Butt-Pirates of the Caribbean: Dead Men Fuck No Booty-holes");
    public void setName(String name) {
        this.name = name;
    }

    // this one is for the category
    public void setCategory(String category) {
        this.category = category;
    }

    // these are "Getters" they are simple methods that acquire the current value of the attribute
    // ex. System.out.println(movie.getName()); will return the name of the movie as a string
    public String getName() {
        return name;
    }
    // this one will get the category
    public String getCategory() {
        return category;
    }

}
