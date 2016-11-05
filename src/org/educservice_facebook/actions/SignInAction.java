package org.educservice_facebook.actions;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;
import org.educservice_facebook.model.User;
import org.educservice_facebook.persistence.Connection;

public class SignInAction extends Acao {

	@Override
	protected void executar(Requisicao req, Resposta resp) {
		User u = (User) Connection.getInstance().retrieve(req.getParametro("login"));
		//if login e senha iguais print senao print
		if(u.getLogin().equals(req.getString("login"))) {
			if(u.getPassword().equals(req.getString("password"))) {
				resp.println("Login successful.");
			} else {
				resp.println("Login failed.");
			}
		} else {
			resp.println("Login failed.");
		}
	}

}
