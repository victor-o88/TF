
package SiPrIn;
//LO QUE TENDRIA QUE HACER ES AGREGAR UN ATRIBUTO MAS LLAMADO ID_NIVEL_POSGRADO QUE VA A SER EL QUE IDENTIFIQUE AL REGISTRO PARA LUEGO PODER MODIFICAR DICHO REGISTRO
public class NivelGrado {
    
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
    public String id_usuario;
    private int num_nivelgrado;
    
    //constructor completo
    public NivelGrado(String titulo, String universidad, String facultad, int aprobacion_tesis, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion, String id_usuario, int num_nivelgrado) {
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
        this.id_usuario = id_usuario;
        this.num_nivelgrado = num_nivelgrado;
    }
    //constructor para aGregar un nivel de grado en la interface nivel de grado
        public NivelGrado(String titulo, String universidad, String facultad, int aprobacion_tesis, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion) {
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
    
        public NivelGrado(){}
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAprobacion_tesis() {
        return aprobacion_tesis;
    }

    public void setAprobacion_tesis(int aprobacion_tesis) {
        this.aprobacion_tesis = aprobacion_tesis;
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

    public int getNum_nivelgrado() {
        return num_nivelgrado;
    }

    public void setNum_nivelgrado(int num_nivelgrado) {
        this.num_nivelgrado = num_nivelgrado;
    }
    
}
