class Person {
    private String fname;
    private String lname;
    private String phnNo;
    private int zipCode;
    private String relation;
//    private enum relationship {
//            family("family"), friends("friends"), associates("associates"), colleagues("colleagues");
//            String relation;
//            relationship(String relation){
//                this.relation=relation;
//            }
//
//            public String getRelation() {
//                return relation;
//            }
//
//    };

    public Person(String fname, String lname, String phnNo, int zipCode, String relation) {
        this.fname = fname;
        this.lname = lname;
        this.phnNo = phnNo;
        this.zipCode = zipCode;
        this.relation = relation;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phnNo='" + phnNo + '\'' +
                ", zipCode=" + zipCode +
                ", relation=" + relation +
                '}';
    }
}