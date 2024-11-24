/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioUnidad3.Proyecto.modelo;

/**
 *
 * @YESID MARTINEZ
 */
import lombok.Data;

@Data
public class Usuario {
    //Propiedades
    private String id;
    private String password;
    private String name;
    private String last_name;
    private String role;
    private String email;
    private String phone;
    private String status;
    private String created_at;
  

    public String getId() {
        return id;
    }

}
