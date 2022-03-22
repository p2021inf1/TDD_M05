package org.m05.uf2.pilatest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	Pila pila_plena;
	Pila pila_buida;

	@BeforeEach
	void setUp() throws Exception {
		pila_buida = new Pila();

		pila_plena = new Pila();
		pila_plena.apilar(1);
		pila_plena.apilar(2);
		pila_plena.apilar(3);
		pila_plena.apilar(4);
	}

	@AfterEach
	void tearDown() throws Exception {
		pila_buida = null;
		pila_plena = null;
	}

	@Test
	final void testPilaBuida() {
		assertEquals(pila_buida.getNumElements(), 0);
	}

	@Test
	final void testApilar() {
		Integer i = new Integer(5);
		int mida = pila_plena.getNumElements();
		pila_plena.apilar(i);
		assertEquals(pila_plena.getNumElements(), mida + 1);
	}

	@Test
	final void testDesapilar() {
		int elements = pila_plena.getNumElements();
		pila_plena.desapilar();
		assertEquals(pila_plena.getNumElements(), (elements-1));
		
	}

	@Test
	final void testGetNumElements() {
		int valor = 0;
		valor = pila_plena.getNumElements();
		assertEquals(pila_plena.getNumElements(), 4);
	}

	@Test
	public void testDesapilar_pilaPlena() {
		int mida = pila_plena.getNumElements();
		Integer i = (Integer) pila_plena.desapilar();
		assertEquals(i, new Integer(4));
		assertEquals(pila_plena.getNumElements(), mida - 1);
	}

	@Test
	public void testDesapilar_pilaBuida() {
		int mida = pila_buida.getNumElements();
		Integer i = (Integer) pila_buida.desapilar();
		assertEquals(i, null);
		assertEquals(pila_buida.getNumElements(), mida);
	}
}
