
package generator.model;

/**
 *
 * @author Kissy de Melo
 */
public class Protocolo {
    private int id;
    private String protocolo; 
    private String descricao; 

    public Protocolo(String protocolo, String descricao, int id) {
        this.protocolo = protocolo;
        this.descricao = descricao;
        this.id = id; 
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
