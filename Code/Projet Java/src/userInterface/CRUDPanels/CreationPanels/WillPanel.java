package userInterface.CRUDPanels.CreationPanels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class WillPanel extends JPanel {
    private JLabel epitaphLabel, funeralsTypeLabel, otherFuneralLabel;
    private JTextField epitaphTextField, otherFuneralTextField;
    private JComboBox funeralsTypeComboBox;

    public WillPanel(){
        this.setLayout(new GridLayout(3, 2));

        ComboBoxListener comboBoxListener = new ComboBoxListener();

         epitaphLabel = new JLabel("Epitaphe : ");
         epitaphLabel.setHorizontalAlignment(SwingConstants.RIGHT);
         epitaphTextField = new JTextField();
         this.add(epitaphLabel);
         this.add(epitaphTextField);

        funeralsTypeLabel = new JLabel("Type de funérail : ");
        funeralsTypeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        String [] funeralsTypeValues = {"Inhumation", "Crémation", "autres"};
        funeralsTypeComboBox = new JComboBox(funeralsTypeValues);
        funeralsTypeComboBox.setMaximumRowCount(3);
        funeralsTypeComboBox.addItemListener(comboBoxListener);
        this.add(funeralsTypeLabel);
        this.add(funeralsTypeComboBox);

        otherFuneralLabel = new JLabel("Autre type de funérail : ");
        otherFuneralLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        otherFuneralTextField = new JTextField();
    }

    private class ComboBoxListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED && funeralsTypeComboBox.getSelectedItem().equals(2)){
                WillPanel.this.add(otherFuneralLabel);
                WillPanel.this.add(otherFuneralTextField);
            }
            else if(e.getStateChange() == ItemEvent.SELECTED && !funeralsTypeComboBox.getSelectedItem().equals(2)){
                WillPanel.this.remove(otherFuneralLabel);
                WillPanel.this.remove(otherFuneralTextField);
            }
        }
    }
}
