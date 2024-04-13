package vn.edu.vn.fit.untils;

public enum StudentStatus {

    ACTIVE("Active"),
    INACTIVE("Inactive"),
    DELETED("Deleted");

    private String status;
    StudentStatus(String status) {
        this.status = status;
    }



}
