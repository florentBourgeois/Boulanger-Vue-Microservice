package fr.CCI.Java.boulangerievuemicroservice.proxies;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import fr.CCI.Java.boulangerievuemicroservice.bean.ProduitBean;

@FeignClient(name = "boulangerie-produits", url="localhost:9900")
public interface MicroserviceProduitProxy {

	@GetMapping(value= "/produits")
	public List<ProduitBean> listeDesProduits();
	
	
}
