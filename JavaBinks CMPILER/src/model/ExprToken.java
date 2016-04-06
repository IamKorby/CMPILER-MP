package model;

/**
 * Created by WilliamPC on 4/7/2016.
 */
public class ExprToken {
    private String token;
    private ExprType type;

    public ExprToken(String token ,ExprType type) {
        this.type = type;
        this.token = token;
    }

    public ExprType getType() {
        return type;
    }

    public void setType(ExprType type) {
        this.type = type;
    }

    public String getToken() {

        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
