package controle;



import dao.StationService;
import meserreurs.MonException;
import metier.StationEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;


///
/// Les m�thode du contr�leur r�pondent � des sollicitations
/// des pages JSP

@Controller
public class StationControleur {

//	private static final Logger logger = LoggerFactory.getLogger(MultiControleur.class);

	@RequestMapping(value = "afficherStation.htm")
	public ModelAndView afficherStation(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String destinationPage;
		try {
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();

			// HttpSession session = request.getSession();
			StationService stationService = new StationService();

            List<StationEntity> listeStations = stationService.consulterListeBornes();

            for(StationEntity station : listeStations) {
                objectBuilder.add("idStation", station.getIdStation());
                objectBuilder.add("latitude", station.getLatitude());
                objectBuilder.add("longitude", station.getLongitude());
                objectBuilder.add("adresse", station.getAdresse());
                objectBuilder.add("numero", station.getNumero());
                objectBuilder.add("ville", station.getVille());
                objectBuilder.add("codePostal", station.getCodePostal());

                arrayBuilder.add(objectBuilder);
                objectBuilder = Json.createObjectBuilder();
            }

            response.setContentType("application/json; charset=UTF-8");
            response.getWriter().write(arrayBuilder.build().toString());

			destinationPage = "/vues/index";
		} catch (MonException e) {
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
            JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
            objectBuilder.add("msg", e.getMessage());
            arrayBuilder.add(objectBuilder);
            response.setContentType("application/json; charset=UTF-8");
            response.getWriter().write(arrayBuilder.build().toString());

			request.setAttribute("MesErreurs", e.getMessage());
			destinationPage = "Erreur";

		}
		return new ModelAndView(destinationPage);
	}


}