package controle;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

///
/// Les m�thode du contr�leur r�pondent � des sollicitations
/// des pages JSP

@Controller
public class MultiControleur {

	// /
	// / Affichage de la page d'accueil
	// /
	@RequestMapping(value = "index.htm", method = RequestMethod.GET)
	public ModelAndView Afficheindex(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("index");
	}

	// /
	// / Affichage de la page d'accueil
	// /
	@RequestMapping(value = "AppClientInscription_war_exploded/index.htm", method = RequestMethod.GET)
	public ModelAndView Afficheindex1(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("index");
	}

	// /
	// / Affichage de la page d'accueil
	// /
	@RequestMapping(value = "/a.htm", method = RequestMethod.GET)
	public ModelAndView Afficheindex2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("index");
	}

	// /
	// / Affichage de la page d'accueil
	// /
	@RequestMapping(value = "/AppClientInscription_war_exploded/map.htm", method = RequestMethod.GET)
	public ModelAndView Afficheindex3(HttpServletRequest request, HttpServletResponse response) throws Exception {

		return new ModelAndView("WEB-INF/Map");
	}

	// /
	// / Affichage de la page d'accueil
	// /
	@RequestMapping(value = "erreur.htm", method = RequestMethod.GET)
	public ModelAndView AfficheErreur(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("WEB-INF/Erreur");
	}


}
