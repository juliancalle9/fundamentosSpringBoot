package com.fundamentos.fundamentos;

import com.fundamentos.fundamentos.bean.MyBean;
import com.fundamentos.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private MyBean myBean;

	//Se inyectara la dependencia, se inyecta la interface
	private ComponentDependency componentDependency;
	/*Constructor de la clase que recibe como parámetro la dependencia para poderse inyectar
	Cuando se quieren implementar dos clases de una dependencia hay que indicarle cual dependencia usar por medio de
	Qualifier
	* */
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	//Ejecuta el programa
	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
	}
}
