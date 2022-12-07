public class PessoaJuridica extends Pessoa{

    private String cnpj;
    private String razaoSocial;

	public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
		super(nome);
		this.cnpj= cnpj;
		this.razaoSocial= razaoSocial;

	}
    public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String toString() {
		return "\n-------------------------\n"
		+"\n----|conta tipo juridica\n"+"\n----|Name:"
		+ this.getNome()+"\n---|Cnpj:"
		+this.getCnpj()
		+"\n---|Razao Social :"+this.getRazaoSocial();
	}
}
