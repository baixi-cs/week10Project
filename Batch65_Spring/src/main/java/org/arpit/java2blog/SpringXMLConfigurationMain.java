package org.arpit.java2blog;
 

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
/**
 * Spring XML based configuration example
 *
 */
public class SpringXMLConfigurationMain 
{
	///Batch65_Spring/src/main/java/org/arpit/java2blog/ApplicationContext.xml
    public static void main( String[] args )
    {


//Create a new ClassPathXmlApplicationContext, loading the definitions from the given XML
    	//file and automatically refreshing the context.

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("/org/arpit/java2blog/ApplicationContext.xml");
        Country countryBean = (Country) ac.getBean("country4"); // (ready Object) bean from Spring Container
      
        String name = countryBean.getName();
        System.out.println("Country name: "+name);
        long population = countryBean.getPopulation();
        System.out.println("Country population: "+population);
        
        ac.close(); 
    }
}
