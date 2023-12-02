package programmerzamannow.reflection.data;

public enum Gender {

    MALE("Male"),
    FEMALE("Female");

    private final String Description ;

    Gender(String description) {
        Description = description;
    }

    public String getDescription() {
        return Description;
    }
}
