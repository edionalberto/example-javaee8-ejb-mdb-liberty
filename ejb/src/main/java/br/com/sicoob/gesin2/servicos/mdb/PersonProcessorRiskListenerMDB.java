package br.com.sicoob.gesin2.servicos.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/QueueTest")
})
public class PersonProcessorRiskListenerMDB implements MessageListener{

	public void onMessage(Message message) {
		// TODO Auto-generated method stub
	
	}

}
