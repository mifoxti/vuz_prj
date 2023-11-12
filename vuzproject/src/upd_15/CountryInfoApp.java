package upd_15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountryInfoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Country Information App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JComboBox<String> countryComboBox = new JComboBox<>();
            countryComboBox.addItem("Выберите страну");
            countryComboBox.addItem("Россия");
            countryComboBox.addItem("США");
            countryComboBox.addItem("Китай");

            JTextArea infoTextArea = new JTextArea(10, 30);
            infoTextArea.setEditable(false);

            countryComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedCountry = (String) countryComboBox.getSelectedItem();
                    displayCountryInfo(selectedCountry, infoTextArea);
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));  // Установка вертикального расположения

            panel.add(new JLabel("Выберите страну: "));
            panel.add(countryComboBox);
            panel.add(Box.createVerticalStrut(10));  // Расстояние между компонентами
            panel.add(new JLabel("Информация о стране: "));
            panel.add(new JScrollPane(infoTextArea));

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static void displayCountryInfo(String country, JTextArea infoTextArea) {
        String info;
        switch (country) {
            case "Россия":
                info = "Столица: Москва\nНаселение: 146 миллионов\nЯзык: Русский";
                break;
            case "США":
                info = "Столица: Вашингтон, округ Колумбия\nНаселение: 331 миллион\nЯзык: Английский";
                break;
            case "Китай":
                info = "Столица: Пекин\nНаселение: 1.4 миллиарда\nЯзык: Китайский";
                break;
            default:
                info = "Выберите страну для отображения информации.";
        }
        infoTextArea.setText(info);
    }
}
