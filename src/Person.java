class Person {
    private String fname;
    private String lname;
    private String phnNo;
    private int zipCode;
    private String relation;
    private Relationship relationship;
    public Person(String fname, String lname, String phnNo, int zipCode, String relation) {
        this.fname = fname;
        this.lname = lname;
        this.phnNo = phnNo;
        this.zipCode = zipCode;
        this.relationship = Relationship.fromString(relation);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phnNo='" + phnNo + '\'' +
                ", zipCode=" + zipCode +
                ", relation=" + relationship +
                '}';
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getRelation() {
        return relation;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Relationship getRelationship() {
        return relationship;
    }
}
enum Relationship {
    FAMILY("family"),
    FRIENDS("friends"),
    ASSOCIATES("associates"),
    COLLEAGUES("colleagues");

    private final String relation;

    Relationship(String relation) {
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    public static Relationship fromString(String text) {
        for (Relationship relationship : Relationship.values()) {
            if (relationship.relation.equalsIgnoreCase(text)) {
                return relationship;
            }
        }
        //We will learn later
        throw new IllegalArgumentException("No constant with text " + text + " found");
    }
}