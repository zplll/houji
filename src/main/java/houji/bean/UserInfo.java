package houji.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/6.
 */
public class UserInfo implements Serializable {

    private int userId;
    private String name;
    private String password;
    private String email;
    private String  roleId;
    private String createTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userId\":")
                .append(userId);
        sb.append(",\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"password\":\"")
                .append(password).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append(",\"roleId\":\"")
                .append(roleId).append('\"');
        sb.append(",\"createTima\":\"")
                .append(createTime).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTima) {
        this.createTime = createTima;
    }

    public UserInfo() {
        super();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}
