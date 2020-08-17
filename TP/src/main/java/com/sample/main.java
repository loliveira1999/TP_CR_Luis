package com.sample;

import java.awt.Frame;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	
        kSession.fireAllRules();

    	UI UI = new UI();
    	UI.main(args);

    }

}
