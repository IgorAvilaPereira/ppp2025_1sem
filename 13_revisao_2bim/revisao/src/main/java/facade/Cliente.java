package facade;

public class Cliente {
    private String nome;
    private String email;
    private String cpf;
    private String cep;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", cep=" + cep + "]";
    }

    

}
