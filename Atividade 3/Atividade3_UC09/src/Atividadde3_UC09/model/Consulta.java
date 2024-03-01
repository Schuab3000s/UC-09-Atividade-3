package Atividadde3_UC09.model;

public class Consulta {

    String data, consultaReceita, paciente;
    boolean consultaRealizada;
    

    public String getData() {
        return data;
    }

    public String getPaciente() {
        return paciente;
    }

    public boolean getConsultaRealizada() {
        return consultaRealizada;
    }
    
    public String getConsultaReceita() {
        return consultaReceita;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setConsultaRealizada(boolean consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }
    
    public void setConsultaReceita(String consultaReceita) {
        this.consultaReceita = consultaReceita;
    }

}
