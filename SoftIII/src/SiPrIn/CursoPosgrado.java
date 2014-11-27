package SiPrIn;

public class CursoPosgrado {

    private String curso;
    private String universidad;
    private String facultad;
    private int anio;
    private int carga_horaria;
    private String pais;
    private String provincia;
    private String ciudad;
    private String area_conocimiento;
    private String coneau;
    private int obtencion;
    private String id_usuario;
    private int num_curso;

    //CONSTRUCTOR COMPLETO
    public CursoPosgrado(String curso, String universidad, String facultad, int anio, int carga_horaria, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion, String id_usuario, int num_curso) {
        this.curso = curso;
        this.universidad = universidad;
        this.facultad = facultad;
        this.anio = anio;
        this.carga_horaria = carga_horaria;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.area_conocimiento = area_conocimiento;
        this.coneau = coneau;
        this.obtencion = obtencion;
        this.id_usuario = id_usuario;
        this.num_curso = num_curso;
    }

    //CONSTRUCTOR SIN ID_USUARIO
    public CursoPosgrado(String curso, String universidad, String facultad, int anio, int carga_horaria, String pais, String provincia,
            String ciudad, String area_conocimiento, String coneau, int obtencion) {
        this.curso = curso;
        this.universidad = universidad;
        this.facultad = facultad;
        this.anio = anio;
        this.carga_horaria = carga_horaria;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.area_conocimiento = area_conocimiento;
        this.coneau = coneau;
        this.obtencion = obtencion;
    }

    public CursoPosgrado() {
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
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

    public int getNum_curso() {
        return num_curso;
    }

    public void setNum_curso(int num_curso) {
        this.num_curso = num_curso;
    }
}
