package main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AtomeTest
{
    private Atome hydrogene;
    private Noyau noyauHydrogene;

    // DÃ©finissez ici les variables d'instance nÃ©cessaires Ã  vos engagements;
    // Vous pouvez Ã©galement les saisir automatiquement du prÃ©sentoir
    // Ã  l'aide du menu contextuel "PrÃ©sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du prÃ©sentoir (les objets sans constructeur, comme int, float, etc.).



    /**
     * Constructeur de la classe-test AtomeTest
     */
    public AtomeTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * MÃ©thode appelÃ©e avant chaque appel de mÃ©thode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        hydrogene = new Atome();
        noyauHydrogene = new Noyau();
    }

    /**
     * Supprime les engagements
     *
     * MÃ©thode appelÃ©e aprÃ¨s chaque appel de mÃ©thode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //LibÃ©rez ici les ressources engagÃ©es par setUp()
    }

    @Test
    public void testChargeAtome()
    {
        assertEquals(1.6E-19, hydrogene.chargeAtome(-1), 0.1);
    }

    @Test
    public void testExplosionNoyau()
    {
        assertEquals(2.7E-46, noyauHydrogene.explosionNoyau(hydrogene, -1), 0.1);
    }
}


