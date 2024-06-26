// src/auth/Usuarios.java
package auth;

public class Usuarios {
    private String username;
    private String password;

    public Usuarios(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean autenticar(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
