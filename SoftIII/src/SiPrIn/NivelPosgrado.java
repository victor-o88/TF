
package SiPrIn;

public class NivelPosgrado {
    
    private String nivel_posgrado;
    private String titulo;    
    private String universidad;
    private String facultad;
    private int aprobacion_tesis;
    private String pais;
    private String provincia;
    private String ciudad;
    private String area_conocimiento;
    private String coneau;
    private int obtencion;
    private String id_usuario;
    private int num_nivelposgrado;

    //CONSTRUCTOR COMPLETO
    public NivelPosgrado(String nivel_posgrado, String titulo, String universidad, String facultad, int aprobacion_tesis, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion, String id_usuario, int num_nivelposgrado) {
        
        this.nivel_posgrado = nivel_posgrado;
        this.titulo = titulo;
        this.universidad = universidad;
        this.facultad = facultad;
        this.aprobacion_tesis=aprobacion_tesis;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.area_conocimiento = area_conocimiento;
        this.coneau = coneau;
        this.obtencion = obtencion;
        this.id_usuario = id_usuario;
        this.num_nivelposgrado = num_nivelposgrado;
    }

        //CONSTRUCTOR SIN ID_USUARIO, SIRVE CUANDO QUIERO AGREGAR UN NUEVO REGISTRO A NIVEL DE POSGRADO
    public NivelPosgrado(String nivel_posgrado, String titulo, String universidad, String facultad, int aprobacion_tesis, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion) {
        
        this.nivel_posgrado = nivel_posgrado;
        this.titulo = titulo;
        this.universidad = universidad;
        this.facultad = facultad;
        this.aprobacion_tesis = aprobacion_tesis;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.area_conocimiento = area_conocimiento;
        this.coneau = coneau;
        this.obtencion = obtencion;
    }
    
    public NivelPosgrado(){}
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel_posgrado() {
        return nivel_posgrado;
    }

    public void setNivel_posgrado(String nivel_posgrado) {
        this.nivel_posgrado = nivel_posgrado;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getArea_conocimiento() {
        return area_conocimiento;
    }

    public void setArea_conocimiento(String area_conocimiento) {
        this.area_conocimiento = area_conocimiento;
    }

    public String getConeau() {
        return coneau;
    }

    public void setConeau(String coneau) {
        this.coneau = coneau;
    }

    public int getObtencion() {
        return obtencion;
    }

    public void setObtencion(int obtencion) {
        this.obtencion = obtencion;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getAprobacion_tesis() {
        return aprobacion_tesis;
    }

    public void setAprobacion_tesis(int aprobacion_tesis) {
        this.aprobacion_tesis = aprobacion_tesis;
    }

    public int getNum_nivelposgrado() {
        return num_nivelposgrado;
    }

    public void setNum_nivelposgrado(int num_nivelposgrado) {
        this.num_nivelposgrado = num_nivelposgrado;
    }
}
