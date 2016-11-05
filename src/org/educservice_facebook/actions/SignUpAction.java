package org.educservice_facebook.actions;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;
import org.educservice_facebook.model.User;
import org.educservice_facebook.persistence.Connection;

public class SignUpAction extends Acao {

	@Override
	protected void executar(Requisicao req, Resposta resp) {
		if(Connection.getInstance().create(new User(req.getString("login"), req.getString("password"), req.getString("email")))) {
			resp.println("Registration sucessful.");
		} else {
			resp.println("Registration failed.");
		}
	}

}
