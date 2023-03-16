package View;

public class Worker {

    private int avatar;
    private String name;
    private String departament;
    private String initials;
    private String birthday;

    public Worker(int avatar, String name, String departament, String initials){
        this.avatar = avatar;
        this.name = name;
        this.departament = departament;
        this.initials = initials;
    }

    public int getAvatar() {
        return this.avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartament() {
        return this.departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getInitials() {
        return this.initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
