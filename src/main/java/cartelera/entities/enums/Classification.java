package cartelera.entities.enums;

// todo @Enumerated(EnumType.STRING)

public enum Classification {
    ALL_AGES("Todos los públicos"),
    OLDER7("7 años"),
    OLDER12("12 años"),
    OLDER16("16 años"),
    OLDER18("18 años");

    private String classification;

    Classification(String classification) {
        this.classification = classification;
    }
}
