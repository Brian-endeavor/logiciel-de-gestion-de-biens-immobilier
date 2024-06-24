package gui;

//package dao;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.io.File;

public class AnnoncesGui extends JFrame {

private JPanel imagePanel;

private JScrollPane scrollPane;

public AnnoncesGui() {

setTitle("Image ScrollPane Example");

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setSize(1080, 528);

int[] tabid = {5968425, 2, 120009, 12131415};

//Créer le JPanel qui contiendra les images

imagePanel = new JPanel();

imagePanel.setLayout(new GridLayout(0, 2)); // 2 colonnes pour les images et les boutons

//Chemin d'accès au dossier contenant les images

String imagePath = "igo/";

//Charger les images du dossier et les ajouter au JPanel avec un bouton

File folder = new File(imagePath);

File[] files = folder.listFiles();

if (files != null) {

for (int i = 0; i < files.length; i++) {

if (files[i].isFile()) {

//Charger l'image

ImageIcon imageIcon = new ImageIcon(files[i].getAbsolutePath());

JLabel imageLabel = new JLabel(imageIcon);

final int kid = tabid[i % tabid.length];

//Créer le bouton pour l'image

JButton button = new JButton("en savoir plus ou reserver");

button.addActionListener(new ActionListener() {

@Override

public void actionPerformed(ActionEvent e) {

//Ouvrir une nouvelle fenêtre lorsque le bouton est cliqué

openNewWindow(imageIcon, kid);

}

});

//Créer un JPanel pour contenir l'image et le bouton

JPanel panel = new JPanel(new BorderLayout());

panel.add(imageLabel, BorderLayout.CENTER);

panel.add(button, BorderLayout.SOUTH);

//Ajouter le JPanel au JPanel principal

imagePanel.add(panel);

}

}

}

//Créer un JScrollPane et y ajouter le JPanel contenant les images

scrollPane = new JScrollPane(imagePanel);

scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

//Ajouter le JScrollPane à la JFrame

getContentPane().add(scrollPane);

setVisible(true);

}

public static void main(String[] args) {

SwingUtilities.invokeLater(() -> new AnnoncesGui());

}

private void openNewWindow(ImageIcon imageIcon, int kw) {

//Créer une nouvelle fenêtre

JFrame newWindow = new JFrame("New Window");

newWindow.setSize(400, 600);

newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

//Pour une image et un formulaire

JPanel form = new JPanel(new GridBagLayout());

GridBagConstraints gbc = new GridBagConstraints();

gbc.insets = new Insets(10, 10, 10, 10);

gbc.fill = GridBagConstraints.HORIZONTAL;

gbc.gridx = 0;

gbc.gridy = 0;

form.add(new JLabel("NOM SUR LA CARTE"), gbc);

gbc.gridx = 1;

gbc.gridy = 0;

form.add(new JTextField(15), gbc);

gbc.gridx = 0;

gbc.gridy = 1;

form.add(new JLabel("NUMERO DE LA CARTE"), gbc);

gbc.gridx = 1;

gbc.gridy = 1;

form.add(new JTextField(15), gbc);

gbc.gridx = 0;

gbc.gridy = 2;

form.add(new JLabel("DATE D'EXPIRATION"), gbc);

gbc.gridx = 1;

gbc.gridy = 2;

form.add(new JTextField(5), gbc);

gbc.gridx = 0;

gbc.gridy = 3;

form.add(new JLabel("CODE DE SECURITE"), gbc);

gbc.gridx = 1;

gbc.gridy = 3;

form.add(new JTextField(5), gbc);

gbc.gridx = 0;

gbc.gridy = 4;

gbc.gridwidth = 2;

form.add(new JButton("PAYER"), gbc);

gbc.gridx = 0;

gbc.gridy = 5;

gbc.gridwidth = 2;

//Charger l'image

JLabel imageLabel2 = new JLabel(imageIcon);

JPanel bindipano = new JPanel(new BorderLayout());

bindipano.add(imageLabel2, BorderLayout.NORTH);

bindipano.add(form, BorderLayout.CENTER);

//Ajouter les composants à la nouvelle fenêtre

newWindow.add(bindipano);

//Rendre la nouvelle fenêtre visible

newWindow.setVisible(true);

}

}

