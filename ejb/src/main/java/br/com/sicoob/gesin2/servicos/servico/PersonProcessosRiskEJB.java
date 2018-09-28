package br.com.sicoob.gesin2.servicos.servico;

import javax.ejb.Stateless;

import br.com.sicoob.gesin2.client.dto.PersonDTO;
import br.com.sicoob.gesin2.client.dto.enums.Risk;

@Stateless
public class PersonProcessosRiskEJB {
	
	public Risk calculateOperationRisk(PersonDTO person) {
		return Risk.A_MAIS;
	}
	
}
