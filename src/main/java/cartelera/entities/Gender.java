package cartelera.entities;

public enum Gender {
    COMEDY("Comedia"),
    DRAMA("Drama"),
    ACTION("Acción"),
    SCI_FI("Ciencia Ficción"),
    FANTASY("Fantasia"),
    MUSICAL("Musical"),
    TERROR("Terror"),
    SUSPENSE("Suspense"),
    ROMANCE("Romántica"),
    CHILDISH("Infantil"),
    BIOGRAPHICAL("Biografía"),
    FAMILY("Familiar");

    private String gender;


    Gender(String gender) {
        this.gender = gender;
    }
}