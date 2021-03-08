/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator.DAO;

import generator.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kissy de Melo
 */
public class ClienteDAO {
    private static final String NEW_CLIENT = "INSERT INTO cliente (codigo, nome , contato, email, estado) VALUES (?,?,?,?,?)";
    private static final String CLIENTS = "SELECT id,codigo, nome, contato, email FROM cliente ORDER BY UPPER(id) ASC";
    private static final String EDIT_CLIENT = "UPDATE cliente SET codigo = ?, nome = ?, contato = ?, email = ?, estado = ? WHERE idUser = ?";
    private static final String SEARCH = "SELECT id, contato, nome, email, estado FROM cliente WHERE id=?";
    private static final String DELETE_CLIENT = "DELETE FROM cliente WHERE id=?";
    
    public ClienteDAO(){}
    
    //lista todos os usuarios
    public List<Cliente> clients() {
        Connection conn = null;
        List<Cliente> list = null;
        PreparedStatement prepared = null;
        ResultSet rs = null;

        try {
            conn = new ConnectionFactory().getConnection(); 
            list = new ArrayList(); 
            prepared = conn.prepareStatement(CLIENTS); 
            rs = prepared.executeQuery(); 

            while (rs.next()) { 
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setCodigo(rs.getInt(2));
                cliente.setNome(rs.getString(3));
                cliente.setEmail(rs.getString(4));
                cliente.setEstado(rs.getString(5));
                list.add(cliente); 
            }

            return list;
        } catch (Exception e) {
            System.out.println("ERROR - " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }

                if (prepared != null) {
                    prepared.close();
                }

                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error close connections" + ex.getMessage());
            }
        }

        return null;
    }

}
