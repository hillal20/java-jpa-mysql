package mainApplication;


import mainApplication.modules.Alien;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

public class MainApplicationClass {



    public static void main(String[] args){
        System.out.println(" ==== jpa app is running ====");

        // we can use these properties here or in the persistence.xml file
        Map properties = new HashMap();
       // properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu1", properties);
        EntityManager em = emf.createEntityManager();

//        em.getTransaction().begin();
//        Alien a7 = new Alien();
//        a7.setName("a7");
//        a7.setId(7);
//        a7.setTech("tech7");
//        em.persist(a7);
//        em.getTransaction().commit();

        // fetching data from alien table from row 4 ( id = 4)
        Alien a4 = em.find(Alien.class,4);
        System.out.println("a4 ===> "+ a4);


        em.close();
        emf.close();






    }

}
