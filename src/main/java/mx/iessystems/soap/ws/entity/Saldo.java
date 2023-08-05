package mx.iessystems.soap.ws.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Saldo implements Serializable {
    private static final long serialVersionUID = 8865718278L;

    private int idCliente;
    private String email;
    private String password;

    public int getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                " idCliente='" + getIdCliente() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                "}";
    }

}
