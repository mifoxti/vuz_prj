public class Author {
    private String name;
    private String email;
    private char gender;


    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String mail){
        this.email = mail;
    }

    public char getGender(){
        return this.gender;
    }

    public String toString(){
        return ("author - " + this.name + " (" + this.gender + ") at " + this.email);
    }
}
