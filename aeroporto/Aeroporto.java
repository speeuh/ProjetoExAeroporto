package aeroporto;

public class Aeroporto {
	private String sigla;
	
	public String getSigla() {
		return this.sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Sigla: ");
		sb.append(this.getSigla());
		
		return sb.toString();
	}
}
