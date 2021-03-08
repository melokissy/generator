
package generator.model;

/**
 *
 * @author Kissy de Melo
 */
public class Cliente {
    private int id; 
    private int codigo; 
    private String nome; 
    private String contato; 
    private String email; 
    private String estado; 

    public Cliente(int id, int codigo, String nome, String contato, String email, String estado) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
        this.email = email;
        this.estado = estado;
    }

    public Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
}
