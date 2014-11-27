
package SiPrIn;

import java.sql.Date;

public class Usuario {
    
    private String id_usuario;
    private String nombre;
    private String apellido;
    private Date fec_nac;
    private String sexo;
    private String email;
    private String cuil;
    private int codigo_postal;
    private long telefono;
    private long celular;
    private String cont;
    private String confirmar_cont;
    private String tipo;
    private String provincia;
    private String departamento;
    private String pais;
    private String id_categoria;
    private String calle;
    private int num;
    private String piso;
    private int dni; 
    //constructor completo
    public Usuario(String id_usuario, String nombre, String apellido, Date fec_nac, String sexo, String email, String cuil, int codigo_postal, long telefono, long celular, String cont, String confirmar_cont,
            String tipo, String provincia, String departamento, String pais, String id_categoria, String calle, int num, String piso, int dni) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fec_nac = fec_nac;
        this.sexo = sexo;
        this.email = email;
        this.cuil = cuil;
        this.codigo_postal = codigo_postal;
        this.telefono = telefono;
        this.celular = celular;
        this.cont = cont;
        this.confirmar_cont = confirmar_cont;
        this.tipo = tipo;
        this.provincia = provincia;
        this.departamento = departamento;
        this.pais = pais;
        this.id_categoria = id_categoria;
        this.calle = calle;
        this.num = num;
        this.piso = piso;
        this.dni = dni;
    }
//constructor de usuario nuevo al momento de registarse al sistema
        public Usuario(String id_usuario, String nombre, String apellido, Date fec_nac, String sexo, String email, String cont, String confirmar_cont,
            String tipo, int dni) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fec_nac = fec_nac;
        this.sexo = sexo;
        this.email = email;
        this.cont = cont;
        this.confirmar_cont = confirmar_cont;
        this.tipo = tipo;
        this.dni = dni;
    }
    
    //constructor de usuario de datos personales
    public Usuario(String nombre, String apellido, Date fec_nac, String sexo, String email, String cuil, int codigo_postal, long telefono, long celular,
            String provincia, String departamento, String pais, String id_categoria, String calle, int num, String piso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fec_nac = fec_nac;
        this.sexo = sexo;
        this.email = email;
        this.cuil = cuil;
        this.codigo_postal = codigo_postal;
        this.telefono = telefono;
        this.celular = celular;
        this.provincia = provincia;
        this.departamento = departamento;
        this.pais = pais;
        this.id_categoria = id_categoria;
        this.calle = calle;
        this.num = num;
        this.piso = piso;
    }   
        
    public Usuario(){}
    
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(Date fec_nac) {
        this.fec_nac = fec_nac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getConfirmar_cont() {
        return confirmar_cont;
    }

    public void setConfirmar_cont(String confirmar_cont) {
        this.confirmar_cont = confirmar_cont;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    
        
    
    
   
    
   
}
