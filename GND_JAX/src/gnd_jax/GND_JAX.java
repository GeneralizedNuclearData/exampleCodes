/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gnd_jax;

import gnd_jax.GND.Reaction;
import gnd_jax.GND.ReactionSuite;
import gnd_jax.GND.XDataXYs1DPrimary;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author mattoon1
 */
public class GND_JAX
{

  /**
   * @param args the command line arguments
   * @throws javax.xml.bind.JAXBException
   */
  public static void main(String[] args) throws JAXBException
  {
    JAXBContext context = JAXBContext.newInstance( ReactionSuite.class );
    Unmarshaller um = context.createUnmarshaller();
    
    ReactionSuite RS = (ReactionSuite) um.unmarshal(
            new java.io.File( "Mn55.gnd.xml" ) );
    
    for (Reaction reac : RS.getReactions().getReaction())
    {
      System.out.printf("Reaction %s (MT%d):\n", reac.getLabel(), reac.getENDFMT());
      for (JAXBElement xsc : reac.getCrossSection().getXYs1DOrRegions1DOrResonancesWithBackground())
      {
        if ("XYs1d".equals(xsc.getName().toString()))
        {
          XDataXYs1DPrimary XYs = (XDataXYs1DPrimary)xsc.getValue();
          System.out.printf("  crossSection has %d points\n", XYs.getValues().getLength());
        }
      }
    }
  }
  
}
