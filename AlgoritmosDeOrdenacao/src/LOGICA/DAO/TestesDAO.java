/*
 * Copyright (C) 2018 mgarcia
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package LOGICA.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Esta classe implementa o DAO para manipular a tabela Testes
 *
 * @author mgarcia
 */
public class TestesDAO {

    /**
     * Este método adiciona um novo registro de um teste ao banco de dados
     *
     *
     * @author Mateus Garcia
     * @param elementos quantidade inteira de elementos testados
     * @param ordem ale, cre ou dec
     * @param dados dist ou rep
     * @param tempo inteiro, em milisegundos
     */
    public static void AddRegistro(int elementos, String ordem, String dados, long tempo, String algoritmo) {
        String sql = "INSERT INTO Testes VALUES (?,?,?,?,?)";
        try {
            Connection con = new ConnectionFactory().getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, elementos);
            ps.setString(2, ordem);
            ps.setString(3, dados);
            ps.setLong(4, tempo);
            ps.setString(5, algoritmo);
            ps.execute();
            ps.close();
            con.close();
        } catch (IOException ex) {
            System.out.println("Erro ao tentar se conectar ao arquivo do banco");
            JOptionPane.showMessageDialog(null, "Erro ao tentar se conectar ao "
                    + "arquivo do banco\n" + ex);
            Logger.getLogger(TestesDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        } catch (SQLException ex) {
            System.out.println("Erro ao criar a statement");
            JOptionPane.showMessageDialog(null, "Erro ao criar a statement\n" + ex);
            Logger.getLogger(TestesDAO.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(TestesDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }
    }
}
