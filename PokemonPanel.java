import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
*Main Content Panel: Pokemon.
*@author Danny Luu
*@since 04/20/21
*/

public class PokemonPanel extends JPanel {
   
   /** Label. */
   private JLabel lPokemon = new JLabel("Pokemon");
   /** Label. */
   private JLabel lPokedex = new JLabel("Pokedex");
   /** Label. */
   private JLabel lBackpack = new JLabel("Backpack");
   
   /** Button. */
   private JButton bPokemon = new JButton("Make Pokemon");
   /** Button. */
   private JButton bPokedex = new JButton("Pokedex");
   /** Button. */
   private JButton bBackpack = new JButton("Backpack");


   /** Top Panel: Holds Card-Panels. */
   private JPanel deckPanel = new JPanel();
   
   /** Card-Panel: Pokemon. */
   private JPanel cardPokemon = new JPanel();
   /** Pokemon Sub Panel. */
   private JPanel pokemonTop = new JPanel();
   /** Pokemon Sub Panel. */
   private JPanel pokemonBottom = new JPanel();
   
   /** Card-Panel: Pokedex. */
   private JPanel cardPokedex = new JPanel();
      /** Pokedex Sub Panel. */
   private JPanel pokedexTop = new JPanel();
   /** Pokedex Sub Panel. */
   private JPanel pokedexBottom = new JPanel();
   
   /** Card-Panel: Backpack. */
   private JPanel cardBackpack = new JPanel();
   /** Backpack Sub Panel. */
   private JPanel backpackTop = new JPanel();
   /** Backpack Sub Panel. */
   private JPanel backpackBottom = new JPanel();
   
   
   /**Bottom Panel: Buttons for card navigation. */
   private JPanel buttonPanel = new JPanel();


      
   /**
   * Constructor holds everything.
   */
   public PokemonPanel() { 
      this.setLayout(new BorderLayout());
      deckPanel.setLayout(new CardLayout());

      
      

      
      
      
      this.add("North", deckPanel);
      //Adding card panels to the deck"
      deckPanel.add(cardPokemon, "pokemon");
      deckPanel.add(cardPokedex, "pokedex");
      deckPanel.add(cardBackpack, "backpack");
      
      cardPokemon.add(pokemonTop);
      cardPokemon.add(pokemonBottom);
      
      pokemonTop.add(lPokemon);
      
      cardPokedex.add(pokedexTop);
      cardPokedex.add(pokedexBottom);
      
      pokedexTop.add(lPokedex);
      
      cardBackpack.add(backpackTop);
      cardBackpack.add(backpackBottom);
      
      backpackTop.add(lBackpack);
      
      
      this.add("South", buttonPanel);
      //Adding buttons to button panel
      buttonPanel.add(bPokemon);
      buttonPanel.add(bPokedex);
      buttonPanel.add(bBackpack);
      
      bPokemon.addActionListener(new GUIListener()); 
      bPokedex.addActionListener(new GUIListener()); 
      bBackpack.addActionListener(new GUIListener()); 
      
   }
   
   /**
   * private class for ActionListener.
   */
   private class GUIListener implements ActionListener {
      /**only method for ActionListener, actionPerformed.
      * @param event button is clicked
      */
      public void actionPerformed(ActionEvent event) {
         CardLayout card = (CardLayout)(deckPanel.getLayout());
         
         if (event.getSource() == bPokemon) {
            card.show(deckPanel, "pokemon");
            //top.show(topDeckPanel, "1");
         }
         if (event.getSource() == bPokedex) {
            card.show(deckPanel, "pokedex");
            //top.show(topDeckPanel, "2");
         }
         if (event.getSource() == bBackpack) {
            card.show(deckPanel, "backpack");
            //top.show(topDeckPanel, "3");
         }
      }
   }
   
} // Closes class