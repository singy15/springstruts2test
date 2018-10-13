package singy.springstruts2test.entities;

public class MUser {
    private String userCd;
    private String name;

    @Override
    public String toString() {
        return String.format("userCd : %s, name : %s", userCd, name);
    }

    public String getUserCd() {
        return userCd;
    }

    public void setUserCd(String userCd) {
        this.userCd = userCd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
