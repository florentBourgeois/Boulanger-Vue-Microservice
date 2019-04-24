package fr.CCI.Java.boulangerievuemicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.CCI.Java.boulangerievuemicroservice.bean.ProduitBean;
import fr.CCI.Java.boulangerievuemicroservice.proxies.MicroserviceProduitProxy;


@Controller
public class VueHTMLController {

	
	// on utilise un MicroserviceProduitProxy pour se connecter au microservice du projet boulanger-microservice
	@Autowired
	private MicroserviceProduitProxy produitProxy;

	
	// lorsque l'utilisateur demande la page accueil on veut afficher la liste des produits
	@GetMapping(value= "/accueil")
	public String pageAccueil(Model model) { // Model est l'objet qui sera passé en paramettre dans la page html.
		List<ProduitBean> produits = produitProxy.listeDesProduits(); // utiliser le proxy pour demander au microservice de produit la liste des produits.
		
		model.addAttribute("ps", produits); // on ajout les produits dans le modèle pour que la page html puisse y acceder
		return "Accueil"; // faire le rendu de la page Accueil.html
	}

	
}

