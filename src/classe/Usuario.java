package classe;

import java.util.Objects;

public class Usuario {
	String nome;
	String email;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Usuario) {
			Usuario other = (Usuario) obj;
			
			boolean isNomeEqual = other.nome.equals(this.nome);
			boolean isEmailEqual = other.email.equals(this.email);
			
			return isNomeEqual && isEmailEqual;
		}else {
			return false;
		}
		//O hashcode será abordado em outra aula
	
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
