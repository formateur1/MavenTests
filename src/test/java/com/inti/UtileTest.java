package com.inti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtileTest {
	
	Utile u = null;
	List<Double> listeSalaire;
	
	@BeforeClass
	public static void debut()
	{
		System.out.println("Début de tous les tests : " + LocalDate.now());
	}
	
	@Before
	public void setUp()
	{
		u = new Utile();
		listeSalaire = new ArrayList<>();
	}
	
	@Test
	public void caclulMoyenneAvecListSalaireReel() throws Exception
	{
		listeSalaire.add(1000.0);
		listeSalaire.add(2000.0);
		listeSalaire.add(3000.0);
		
		double moyenne = u.caclulMoyenne(listeSalaire);
		
		assertEquals(moyenne, 2000.0, 1);
		assertEquals("Test d'une liste de salaire" ,moyenne, 2000.0, 1); 
	}
	
	@Test(expected = Exception.class)
	public void caclulMoyenneAvecListSalaireVide() throws Exception
	{				
		double moyenne = u.caclulMoyenne(listeSalaire);
		
		fail("Liste vide");
	}


	@Test(expected = Exception.class)
	public void caclulMoyenneAvecListSalaireNull() throws Exception
	{		
		double moyenne = u.caclulMoyenne(null);
		
		fail("Liste vide");
	}
	
	@After
	public void afterEachTest()
	{
		System.out.println("Fin du test");
	}
	
	@AfterClass
	public static void fin()
	{
		System.out.println("Fin de tous les tests : " + LocalDate.now());
	}

}
